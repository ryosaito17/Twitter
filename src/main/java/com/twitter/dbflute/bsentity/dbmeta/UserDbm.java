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
 * The DB meta of USER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UserDbm _instance = new UserDbm();
    private UserDbm() {}
    public static UserDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((User)et).getUserId(), (et, vl) -> ((User)et).setUserId(ctl(vl)), "userId");
        setupEpg(_epgMap, et -> ((User)et).getAccountId(), (et, vl) -> ((User)et).setAccountId((String)vl), "accountId");
        setupEpg(_epgMap, et -> ((User)et).getRegisterDatetime(), (et, vl) -> ((User)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((User)et).getPassword(), (et, vl) -> ((User)et).setPassword((String)vl), "password");
        setupEpg(_epgMap, et -> ((User)et).getMailAddress(), (et, vl) -> ((User)et).setMailAddress((String)vl), "mailAddress");
        setupEpg(_epgMap, et -> ((User)et).getFollowAcceptFlg(), (et, vl) -> ((User)et).setFollowAcceptFlg((Boolean)vl), "followAcceptFlg");
        setupEpg(_epgMap, et -> ((User)et).getGeolocationFlg(), (et, vl) -> ((User)et).setGeolocationFlg((Boolean)vl), "geolocationFlg");
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
        setupEfpg(_efpgMap, et -> ((User)et).getLoginAsOne(), (et, vl) -> ((User)et).setLoginAsOne((OptionalEntity<Login>)vl), "loginAsOne");
        setupEfpg(_efpgMap, et -> ((User)et).getMutterAsOne(), (et, vl) -> ((User)et).setMutterAsOne((OptionalEntity<Mutter>)vl), "mutterAsOne");
        setupEfpg(_efpgMap, et -> ((User)et).getRelationAsOne(), (et, vl) -> ((User)et).setRelationAsOne((OptionalEntity<Relation>)vl), "relationAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "USER";
    protected final String _tableDispName = "USER";
    protected final String _tablePropertyName = "user";
    protected final TableSqlName _tableSqlName = new TableSqlName("USER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Long.class, "userId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, "goodList", null, false);
    protected final ColumnInfo _columnAccountId = cci("ACCOUNT_ID", "ACCOUNT_ID", null, null, String.class, "accountId", null, false, false, true, "VARCHAR", 30, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPassword = cci("PASSWORD", "PASSWORD", null, null, String.class, "password", null, false, false, true, "VARCHAR", 30, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMailAddress = cci("MAIL_ADDRESS", "MAIL_ADDRESS", null, null, String.class, "mailAddress", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFollowAcceptFlg = cci("FOLLOW_ACCEPT_FLG", "FOLLOW_ACCEPT_FLG", null, null, Boolean.class, "followAcceptFlg", null, false, false, false, "BIT", null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGeolocationFlg = cci("GEOLOCATION_FLG", "GEOLOCATION_FLG", null, null, Boolean.class, "geolocationFlg", null, false, false, false, "BIT", null, null, null, false, null, null, null, null, null, false);

    /**
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * ACCOUNT_ID: {UQ, NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAccountId() { return _columnAccountId; }
    /**
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * PASSWORD: {NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPassword() { return _columnPassword; }
    /**
     * MAIL_ADDRESS: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMailAddress() { return _columnMailAddress; }
    /**
     * FOLLOW_ACCEPT_FLG: {BIT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFollowAcceptFlg() { return _columnFollowAcceptFlg; }
    /**
     * GEOLOCATION_FLG: {BIT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGeolocationFlg() { return _columnGeolocationFlg; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUserId());
        ls.add(columnAccountId());
        ls.add(columnRegisterDatetime());
        ls.add(columnPassword());
        ls.add(columnMailAddress());
        ls.add(columnFollowAcceptFlg());
        ls.add(columnGeolocationFlg());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnUserId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnAccountId()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * LOGIN by USER_ID, named 'loginAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignLoginAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), LoginDbm.getInstance().columnUserId());
        return cfi("FK_LOGIN_USER", "loginAsOne", this, LoginDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "user", false);
    }
    /**
     * MUTTER by USER_ID, named 'mutterAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignMutterAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), MutterDbm.getInstance().columnUserId());
        return cfi("FK_MUTTER_USER", "mutterAsOne", this, MutterDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "user", false);
    }
    /**
     * RELATION by USER_ID, named 'relationAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignRelationAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), RelationDbm.getInstance().columnUserId());
        return cfi("FK_RELATION_USER", "relationAsOne", this, RelationDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "user", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * GOOD by USER_ID, named 'goodList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerGoodList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), GoodDbm.getInstance().columnUserId());
        return cri("FK_GOOD_USER", "goodList", this, GoodDbm.getInstance(), mp, false, "user");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.twitter.dbflute.exentity.User"; }
    public String getConditionBeanTypeName() { return "com.twitter.dbflute.cbean.UserCB"; }
    public String getBehaviorTypeName() { return "com.twitter.dbflute.exbhv.UserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<User> getEntityType() { return User.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public User newEntity() { return new User(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((User)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((User)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
