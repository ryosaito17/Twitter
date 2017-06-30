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
 * The DB meta of GOOD. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class GoodDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final GoodDbm _instance = new GoodDbm();
    private GoodDbm() {}
    public static GoodDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Good)et).getGoodId(), (et, vl) -> ((Good)et).setGoodId(ctl(vl)), "goodId");
        setupEpg(_epgMap, et -> ((Good)et).getUserId(), (et, vl) -> ((Good)et).setUserId(ctl(vl)), "userId");
        setupEpg(_epgMap, et -> ((Good)et).getMutterId(), (et, vl) -> ((Good)et).setMutterId(ctl(vl)), "mutterId");
        setupEpg(_epgMap, et -> ((Good)et).getGoodFlg(), (et, vl) -> ((Good)et).setGoodFlg((Boolean)vl), "goodFlg");
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
        setupEfpg(_efpgMap, et -> ((Good)et).getUser(), (et, vl) -> ((Good)et).setUser((OptionalEntity<User>)vl), "user");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "GOOD";
    protected final String _tableDispName = "GOOD";
    protected final String _tablePropertyName = "good";
    protected final TableSqlName _tableSqlName = new TableSqlName("GOOD", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnGoodId = cci("GOOD_ID", "GOOD_ID", null, null, Long.class, "goodId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Long.class, "userId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "user", null, null, false);
    protected final ColumnInfo _columnMutterId = cci("MUTTER_ID", "MUTTER_ID", null, null, Long.class, "mutterId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGoodFlg = cci("GOOD_FLG", "GOOD_FLG", null, null, Boolean.class, "goodFlg", null, false, false, false, "BIT", null, null, null, false, null, null, null, null, null, false);

    /**
     * GOOD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGoodId() { return _columnGoodId; }
    /**
     * USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * MUTTER_ID: {UQ+, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMutterId() { return _columnMutterId; }
    /**
     * GOOD_FLG: {BIT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGoodFlg() { return _columnGoodFlg; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnGoodId());
        ls.add(columnUserId());
        ls.add(columnMutterId());
        ls.add(columnGoodFlg());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnGoodId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnMutterId());
        ls.add(columnUserId());
        return hpcui(ls);
    }

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
        return cfi("FK_GOOD_USER", "user", this, UserDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "goodList", false);
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
    public String getEntityTypeName() { return "com.twitter.dbflute.exentity.Good"; }
    public String getConditionBeanTypeName() { return "com.twitter.dbflute.cbean.GoodCB"; }
    public String getBehaviorTypeName() { return "com.twitter.dbflute.exbhv.GoodBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Good> getEntityType() { return Good.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Good newEntity() { return new Good(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Good)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Good)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
