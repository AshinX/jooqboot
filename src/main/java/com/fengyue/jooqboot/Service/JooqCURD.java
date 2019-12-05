package com.fengyue.jooqboot.Service;

import jooq.generated.Tables;
import jooq.generated.tables.Car;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.Table;
import org.jooq.types.ULong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author fengyue
 * @date 2019-12-05  下午4:55
 */
@Service
@Transactional
public class JooqCURD {

    @Autowired
    private DSLContext dslContext;

    public Integer select(){
        List<Car> carList = dslContext.select()
                .from(Tables.CAR)
                .where(Tables.CAR.DATE_DELETE.ne(ULong.valueOf(0L)))
                .fetch().into(Car.class);
        return carList.size();
    }
}
