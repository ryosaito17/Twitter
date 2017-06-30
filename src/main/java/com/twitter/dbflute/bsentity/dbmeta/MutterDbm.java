package com.twitter.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.twitter.dbflute.allcommon.*;
import com.twitter.dbflute.exentity.*;

/**
 * The DB meta of MUTTER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MutterDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MutterDbm _instance = new MutterDbm();
    private MutterDbm() {}
    public static MutterDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((Mutter)et).getMutterId(), (et, vl) -> ((Mutter)et).setMutterId(ctl(vl)), "mutterId");
        setupEpg(_epgMap, et -> ((Mutter)et).getUserId(), (et, vl) -> ((Mutter)et).setUserId(ctl(vl)), "userId");
        setupEpg(_epgMap, et -> ((Mutter)et).getMutterDatetime(), (et, vl) -> ((Mutter)et).setMutterDatetime(ctldt(vl)), "mutterDatetime");
        setupEpg(_epgMap, et -> ((Mutter)et).getMutterText(), (et, vl) -> ((Mutter)et).setMutterText((String)vl), "mutterText");
        setupEpg(_epgMap, et -> ((Mutter)et).getMutterImage(), (et, vl) -> ((Mutter)et).setMutterImage((byte[])vl), "mutterImage");
        setupEpg(_epgMap, et -> ((Mutter)et).getMutterLatitude(), (et, vl) -> ((Mutter)et).setMutterLatitude(ctb(vl)), "mutterLatitude");
        setupEpg(_epgMap, et -> ((Mutter)et).getMutterLongitude(), (et, vl) -> ((Mutter)et).setMutterLongitude(ctb(vl)), "mutterLongitude");
        setupEpg(_epgMap, et -> ((Mutter)et).getEditDatetime(), (et, vl) -> ((Mutter)et).setEditDatetime(ctldt(vl)), "editDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((Mutter)et).getUser(), (et, vl) -> ((Mutter)et).setUser((OptionalEntity<User>)vl), "user");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MUTTER";
    protected final String _tableDispName = "MUTTER";
    protected final String _tablePropertyName = "mutter";
    protected final TableSqlName _tableSqlName = new TableSqlName("MUTTER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMutterId = cci("MUTTER_ID", "MUTTER_ID", null, null, Long.class, "mutterId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Long.class, "userId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "user", null, null, false);
    protected final ColumnInfo _columnMutterDatetime = cci("MUTTER_DATETIME", "MUTTER_DATETIME", null, null, java.time.LocalDateTime.class, "mutterDatetime", null, false, false, true, "DATETIME", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMutterText = cci("MUTTER_TEXT", "MUTTER_TEXT", null, null, String.class, "mutterText", null, false, false, true, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMutterImage = cci("MUTTER_IMAGE", "MUTTER_IMAGE", null, null, byte[].class, "mutterImage", null, false, false, false, "BLOB", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMutterLatitude = cci("MUTTER_LATITUDE", "MUTTER_LATITUDE", null, null, java.math.BigDecimal.class, "mutterLatitude", null, false, false, false, "DOUBLE", 22, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMutterLongitude = cci("MUTTER_LONGITUDE", "MUTTER_LONGITUDE", null, null, java.math.BigDecimal.class, "mutterLongitude", null, false, false, false, "DOUBLE", 22, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEditDatetime = cci("EDIT_DATETIME", "EDIT_DATETIME", null, null, java.time.LocalDateTime.class, "editDatetime", null, false, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null, false);

    /**
     * MUTTER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMutterId() { return _columnMutterId; }
    /**
     * USER_ID: {UQ, NotNull, BIGINT(19), FK to USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * MUTTER_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMutterDatetime() { return _columnMutterDatetime; }
    /**
     * MUTTER_TEXT: {NotNull, TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMutterText() { return _columnMutterText; }
    /**
     * MUTTER_IMAGE: {BLOB(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMutterImage() { return _columnMutterImage; }
    /**
     * MUTTER_LATITUDE: {DOUBLE(22)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMutterLatitude() { return _columnMutterLatitude; }
    /**
     * MUTTER_LONGITUDE: {DOUBLE(22)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMutterLongitude() { return _columnMutterLongitude; }
    /**
     * EDIT_DATETIME: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEditDatetime() { return _columnEditDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMutterId());
        ls.add(columnUserId());
        ls.add(columnMutterDatetime());
        ls.add(columnMutterText());
        ls.add(columnMutterImage());
        ls.add(columnMutterLatitude());
        ls.add(columnMutterLongitude());
        ls.add(columnEditDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMutterId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnUserId()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * USER by my USER_ID, named 'user'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), UserDbm.getInstance().columnUserId());
        return cfi("FK_MUTTER_USER", "user", this, UserDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, false, false, null, null, false, "mutterAsOne", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.twitter.dbflute.exentity.Mutter"; }
    public String getConditionBeanTypeName() { return "com.twitter.dbflute.cbean.MutterCB"; }
    public String getBehaviorTypeName() { return "com.twitter.dbflute.exbhv.MutterBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Mutter> getEntityType() { return Mutter.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Mutter newEntity() { return new Mutter(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Mutter)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Mutter)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
