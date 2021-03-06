/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.generated.Indexes;
import jooq.generated.Keys;
import jooq.generated.Library;
import jooq.generated.tables.records.CarRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.JSON;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * 车辆
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Car extends TableImpl<CarRecord> {

    private static final long serialVersionUID = 169321554;

    /**
     * The reference instance of <code>library.car</code>
     */
    public static final Car CAR = new Car();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CarRecord> getRecordType() {
        return CarRecord.class;
    }

    /**
     * The column <code>library.car.id</code>.
     */
    public final TableField<CarRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>library.car.org_id</code>. 集团id
     */
    public final TableField<CarRecord, String> ORG_ID = createField(DSL.name("org_id"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "集团id");

    /**
     * The column <code>library.car.name</code>. 品牌车型
     */
    public final TableField<CarRecord, JSON> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.JSON, this, "品牌车型");

    /**
     * The column <code>library.car.vin_number</code>. VIN码
     */
    public final TableField<CarRecord, String> VIN_NUMBER = createField(DSL.name("vin_number"), org.jooq.impl.SQLDataType.VARCHAR(32), this, "VIN码");

    /**
     * The column <code>library.car.mileage</code>. 表现里程
     */
    public final TableField<CarRecord, Double> MILEAGE = createField(DSL.name("mileage"), org.jooq.impl.SQLDataType.DOUBLE, this, "表现里程");

    /**
     * The column <code>library.car.first_license_plate_date</code>. 首次上牌
     */
    public final TableField<CarRecord, Timestamp> FIRST_LICENSE_PLATE_DATE = createField(DSL.name("first_license_plate_date"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "首次上牌");

    /**
     * The column <code>library.car.color</code>. 车身颜色
     */
    public final TableField<CarRecord, JSON> COLOR = createField(DSL.name("color"), org.jooq.impl.SQLDataType.JSON, this, "车身颜色");

    /**
     * The column <code>library.car.plate_number</code>. 车牌号
     */
    public final TableField<CarRecord, String> PLATE_NUMBER = createField(DSL.name("plate_number"), org.jooq.impl.SQLDataType.VARCHAR(32), this, "车牌号");

    /**
     * The column <code>library.car.stock_status</code>. | 出库状态 | stock_status | 单选选项集 | 出库状态，1-未出库、2-转场、3-外借 |
     */
    public final TableField<CarRecord, String> STOCK_STATUS = createField(DSL.name("stock_status"), org.jooq.impl.SQLDataType.VARCHAR(80), this, "| 出库状态 | stock_status | 单选选项集 | 出库状态，1-未出库、2-转场、3-外借 |");

    /**
     * The column <code>library.car.transfer_total</code>. 过户次数
     */
    public final TableField<CarRecord, Double> TRANSFER_TOTAL = createField(DSL.name("transfer_total"), org.jooq.impl.SQLDataType.DOUBLE, this, "过户次数");

    /**
     * The column <code>library.car.keys_count</code>. 钥匙数量
     */
    public final TableField<CarRecord, Integer> KEYS_COUNT = createField(DSL.name("keys_count"), org.jooq.impl.SQLDataType.INTEGER, this, "钥匙数量");

    /**
     * The column <code>library.car.engine_number</code>. 发动机号
     */
    public final TableField<CarRecord, String> ENGINE_NUMBER = createField(DSL.name("engine_number"), org.jooq.impl.SQLDataType.VARCHAR(32), this, "发动机号");

    /**
     * The column <code>library.car.production_date</code>. 出厂日期
     */
    public final TableField<CarRecord, Timestamp> PRODUCTION_DATE = createField(DSL.name("production_date"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "出厂日期");

    /**
     * The column <code>library.car.annual_expires_date</code>. 年检到日期
     */
    public final TableField<CarRecord, Timestamp> ANNUAL_EXPIRES_DATE = createField(DSL.name("annual_expires_date"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "年检到日期");

    /**
     * The column <code>library.car.inner_color</code>. 内饰颜色
     */
    public final TableField<CarRecord, JSON> INNER_COLOR = createField(DSL.name("inner_color"), org.jooq.impl.SQLDataType.JSON, this, "内饰颜色");

    /**
     * The column <code>library.car.new_price</code>. 新车指导价
     */
    public final TableField<CarRecord, Double> NEW_PRICE = createField(DSL.name("new_price"), org.jooq.impl.SQLDataType.DOUBLE, this, "新车指导价");

    /**
     * The column <code>library.car.use_type</code>.
     */
    public final TableField<CarRecord, String> USE_TYPE = createField(DSL.name("use_type"), org.jooq.impl.SQLDataType.VARCHAR(80), this, "");

    /**
     * The column <code>library.car.area</code>. 车辆所在地
     */
    public final TableField<CarRecord, JSON> AREA = createField(DSL.name("area"), org.jooq.impl.SQLDataType.JSON, this, "车辆所在地");

    /**
     * The column <code>library.car.register_area</code>. 车辆归属地
     */
    public final TableField<CarRecord, JSON> REGISTER_AREA = createField(DSL.name("register_area"), org.jooq.impl.SQLDataType.JSON, this, "车辆归属地");

    /**
     * The column <code>library.car.vehicle_condition</code>. 车况描述
     */
    public final TableField<CarRecord, String> VEHICLE_CONDITION = createField(DSL.name("vehicle_condition"), org.jooq.impl.SQLDataType.CLOB, this, "车况描述");

    /**
     * The column <code>library.car.sale_price</code>. 网络标价
     */
    public final TableField<CarRecord, Double> SALE_PRICE = createField(DSL.name("sale_price"), org.jooq.impl.SQLDataType.DOUBLE, this, "网络标价");

    /**
     * The column <code>library.car.exhibition_price</code>. 展厅标价
     */
    public final TableField<CarRecord, Double> EXHIBITION_PRICE = createField(DSL.name("exhibition_price"), org.jooq.impl.SQLDataType.DOUBLE, this, "展厅标价");

    /**
     * The column <code>library.car.sales_price</code>. 销售底价
     */
    public final TableField<CarRecord, Double> SALES_PRICE = createField(DSL.name("sales_price"), org.jooq.impl.SQLDataType.DOUBLE, this, "销售底价");

    /**
     * The column <code>library.car.anjie</code>. 按揭方案
     */
    public final TableField<CarRecord, String> ANJIE = createField(DSL.name("anjie"), org.jooq.impl.SQLDataType.VARCHAR(32), this, "按揭方案");

    /**
     * The column <code>library.car.wholesale_price</code>. 批发价
     */
    public final TableField<CarRecord, Double> WHOLESALE_PRICE = createField(DSL.name("wholesale_price"), org.jooq.impl.SQLDataType.DOUBLE, this, "批发价");

    /**
     * The column <code>library.car.assessor_name</code>.
     */
    public final TableField<CarRecord, String> ASSESSOR_NAME = createField(DSL.name("assessor_name"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>library.car.purchase_type</code>.
     */
    public final TableField<CarRecord, String> PURCHASE_TYPE = createField(DSL.name("purchase_type"), org.jooq.impl.SQLDataType.VARCHAR(80), this, "");

    /**
     * The column <code>library.car.purchase_price</code>. 采购价
     */
    public final TableField<CarRecord, Double> PURCHASE_PRICE = createField(DSL.name("purchase_price"), org.jooq.impl.SQLDataType.DOUBLE, this, "采购价");

    /**
     * The column <code>library.car.contract_sign_date</code>. 采购日期
     */
    public final TableField<CarRecord, Timestamp> CONTRACT_SIGN_DATE = createField(DSL.name("contract_sign_date"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "采购日期");

    /**
     * The column <code>library.car.engine_volume_liter</code>. 排量（L）
     */
    public final TableField<CarRecord, Double> ENGINE_VOLUME_LITER = createField(DSL.name("engine_volume_liter"), org.jooq.impl.SQLDataType.DOUBLE, this, "排量（L）");

    /**
     * The column <code>library.car.gear_box_type</code>.
     */
    public final TableField<CarRecord, String> GEAR_BOX_TYPE = createField(DSL.name("gear_box_type"), org.jooq.impl.SQLDataType.VARCHAR(80), this, "");

    /**
     * The column <code>library.car.fuel_type</code>.
     */
    public final TableField<CarRecord, String> FUEL_TYPE = createField(DSL.name("fuel_type"), org.jooq.impl.SQLDataType.VARCHAR(80), this, "");

    /**
     * The column <code>library.car.car_body</code>.
     */
    public final TableField<CarRecord, String> CAR_BODY = createField(DSL.name("car_body"), org.jooq.impl.SQLDataType.VARCHAR(80), this, "");

    /**
     * The column <code>library.car.seat_number</code>. 座位数
     */
    public final TableField<CarRecord, Double> SEAT_NUMBER = createField(DSL.name("seat_number"), org.jooq.impl.SQLDataType.DOUBLE, this, "座位数");

    /**
     * The column <code>library.car.emission_standard</code>.
     */
    public final TableField<CarRecord, String> EMISSION_STANDARD = createField(DSL.name("emission_standard"), org.jooq.impl.SQLDataType.VARCHAR(80), this, "");

    /**
     * The column <code>library.car.highlights_configuration</code>. 亮点配置
     */
    public final TableField<CarRecord, JSON> HIGHLIGHTS_CONFIGURATION = createField(DSL.name("highlights_configuration"), org.jooq.impl.SQLDataType.JSON, this, "亮点配置");

    /**
     * The column <code>library.car.car_remark</code>. 备注
     */
    public final TableField<CarRecord, String> CAR_REMARK = createField(DSL.name("car_remark"), org.jooq.impl.SQLDataType.CLOB, this, "备注");

    /**
     * The column <code>library.car.weidian_is_upshelf</code>.
     */
    public final TableField<CarRecord, String> WEIDIAN_IS_UPSHELF = createField(DSL.name("weidian_is_upshelf"), org.jooq.impl.SQLDataType.VARCHAR(80), this, "");

    /**
     * The column <code>library.car.up_shelf_date</code>. 微店上架时间
     */
    public final TableField<CarRecord, Timestamp> UP_SHELF_DATE = createField(DSL.name("up_shelf_date"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "微店上架时间");

    /**
     * The column <code>library.car.down_shelf_date</code>. 微店下架时间
     */
    public final TableField<CarRecord, Timestamp> DOWN_SHELF_DATE = createField(DSL.name("down_shelf_date"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "微店下架时间");

    /**
     * The column <code>library.car.is_upshelf_jiaxuan</code>.
     */
    public final TableField<CarRecord, String> IS_UPSHELF_JIAXUAN = createField(DSL.name("is_upshelf_jiaxuan"), org.jooq.impl.SQLDataType.VARCHAR(80), this, "");

    /**
     * The column <code>library.car.up_shelf_jiaxuan_date</code>. 家选上架时间
     */
    public final TableField<CarRecord, Timestamp> UP_SHELF_JIAXUAN_DATE = createField(DSL.name("up_shelf_jiaxuan_date"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "家选上架时间");

    /**
     * The column <code>library.car.down_shelf_jiaxuan_date</code>. 家选下架时间
     */
    public final TableField<CarRecord, Timestamp> DOWN_SHELF_JIAXUAN_DATE = createField(DSL.name("down_shelf_jiaxuan_date"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "家选下架时间");

    /**
     * The column <code>library.car.reserve_time</code>. 预定日期
     */
    public final TableField<CarRecord, Timestamp> RESERVE_TIME = createField(DSL.name("reserve_time"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "预定日期");

    /**
     * The column <code>library.car.pay_time</code>. 销售日期
     */
    public final TableField<CarRecord, Timestamp> PAY_TIME = createField(DSL.name("pay_time"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "销售日期");

    /**
     * The column <code>library.car.salesperson</code>.
     */
    public final TableField<CarRecord, String> SALESPERSON = createField(DSL.name("salesperson"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>library.car.deal_price</code>. 成交价
     */
    public final TableField<CarRecord, Double> DEAL_PRICE = createField(DSL.name("deal_price"), org.jooq.impl.SQLDataType.DOUBLE, this, "成交价");

    /**
     * The column <code>library.car.out_stock_reason</code>.
     */
    public final TableField<CarRecord, String> OUT_STOCK_REASON = createField(DSL.name("out_stock_reason"), org.jooq.impl.SQLDataType.VARCHAR(80), this, "");

    /**
     * The column <code>library.car.out_stock_reason_remarks</code>.
     */
    public final TableField<CarRecord, String> OUT_STOCK_REASON_REMARKS = createField(DSL.name("out_stock_reason_remarks"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>library.car.jiaxuan_renzheng</code>.
     */
    public final TableField<CarRecord, String> JIAXUAN_RENZHENG = createField(DSL.name("jiaxuan_renzheng"), org.jooq.impl.SQLDataType.VARCHAR(80), this, "");

    /**
     * The column <code>library.car.in_stock</code>. 入库时间
     */
    public final TableField<CarRecord, Timestamp> IN_STOCK = createField(DSL.name("in_stock"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "入库时间");

    /**
     * The column <code>library.car.out_stock_date</code>. 退库日期
     */
    public final TableField<CarRecord, Timestamp> OUT_STOCK_DATE = createField(DSL.name("out_stock_date"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "退库日期");

    /**
     * The column <code>library.car.video</code>. 车辆视频
     */
    public final TableField<CarRecord, JSON> VIDEO = createField(DSL.name("video"), org.jooq.impl.SQLDataType.JSON, this, "车辆视频");

    /**
     * The column <code>library.car.common_data</code>. 备用扩展字段
     */
    public final TableField<CarRecord, JSON> COMMON_DATA = createField(DSL.name("common_data"), org.jooq.impl.SQLDataType.JSON, this, "备用扩展字段");

    /**
     * The column <code>library.car.business_type</code>.
     */
    public final TableField<CarRecord, String> BUSINESS_TYPE = createField(DSL.name("business_type"), org.jooq.impl.SQLDataType.VARCHAR(80), this, "");

    /**
     * The column <code>library.car.operation_phase</code>.
     */
    public final TableField<CarRecord, String> OPERATION_PHASE = createField(DSL.name("operation_phase"), org.jooq.impl.SQLDataType.VARCHAR(80), this, "");

    /**
     * The column <code>library.car.operator</code>. 操作人
     */
    public final TableField<CarRecord, String> OPERATOR = createField(DSL.name("operator"), org.jooq.impl.SQLDataType.VARCHAR(32), this, "操作人");

    /**
     * The column <code>library.car.owner</code>.
     */
    public final TableField<CarRecord, String> OWNER = createField(DSL.name("owner"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>library.car.shop_code</code>. 店铺code
     */
    public final TableField<CarRecord, String> SHOP_CODE = createField(DSL.name("shop_code"), org.jooq.impl.SQLDataType.VARCHAR(32), this, "店铺code");

    /**
     * The column <code>library.car.creator</code>. 记录创建人
     */
    public final TableField<CarRecord, String> CREATOR = createField(DSL.name("creator"), org.jooq.impl.SQLDataType.VARCHAR(32), this, "记录创建人");

    /**
     * The column <code>library.car.department_id</code>. 部门id
     */
    public final TableField<CarRecord, String> DEPARTMENT_ID = createField(DSL.name("department_id"), org.jooq.impl.SQLDataType.VARCHAR(32), this, "部门id");

    /**
     * The column <code>library.car.date_create</code>. 创建时间
     */
    public final TableField<CarRecord, Timestamp> DATE_CREATE = createField(DSL.name("date_create"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>library.car.date_update</code>. 更新时间
     */
    public final TableField<CarRecord, Timestamp> DATE_UPDATE = createField(DSL.name("date_update"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * The column <code>library.car.date_delete</code>. 删除时间
     */
    public final TableField<CarRecord, ULong> DATE_DELETE = createField(DSL.name("date_delete"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "删除时间");

    /**
     * The column <code>library.car.sync_status</code>. 车辆库同步状态(为null表示未同步成功)
     */
    public final TableField<CarRecord, String> SYNC_STATUS = createField(DSL.name("sync_status"), org.jooq.impl.SQLDataType.VARCHAR(10), this, "车辆库同步状态(为null表示未同步成功)");

    /**
     * The column <code>library.car.source</code>. 车辆来源
     */
    public final TableField<CarRecord, String> SOURCE = createField(DSL.name("source"), org.jooq.impl.SQLDataType.VARCHAR(32), this, "车辆来源");

    /**
     * Create a <code>library.car</code> table reference
     */
    public Car() {
        this(DSL.name("car"), null);
    }

    /**
     * Create an aliased <code>library.car</code> table reference
     */
    public Car(String alias) {
        this(DSL.name(alias), CAR);
    }

    /**
     * Create an aliased <code>library.car</code> table reference
     */
    public Car(Name alias) {
        this(alias, CAR);
    }

    private Car(Name alias, Table<CarRecord> aliased) {
        this(alias, aliased, null);
    }

    private Car(Name alias, Table<CarRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("车辆"));
    }

    public <O extends Record> Car(Table<O> child, ForeignKey<O, CarRecord> key) {
        super(child, key, CAR);
    }

    @Override
    public Schema getSchema() {
        return Library.LIBRARY;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CAR_IDX_ORG_ID, Indexes.CAR_IDX_SHOP_CODE, Indexes.CAR_PRIMARY);
    }

    @Override
    public UniqueKey<CarRecord> getPrimaryKey() {
        return Keys.KEY_CAR_PRIMARY;
    }

    @Override
    public List<UniqueKey<CarRecord>> getKeys() {
        return Arrays.<UniqueKey<CarRecord>>asList(Keys.KEY_CAR_PRIMARY);
    }

    @Override
    public Car as(String alias) {
        return new Car(DSL.name(alias), this);
    }

    @Override
    public Car as(Name alias) {
        return new Car(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Car rename(String name) {
        return new Car(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Car rename(Name name) {
        return new Car(name, null);
    }
}
