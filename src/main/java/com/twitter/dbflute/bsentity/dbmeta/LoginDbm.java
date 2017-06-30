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
 * The DB meta of LOGIN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LoginDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LoginDbm _instance = new LoginDbm();
    private LoginDbm() {}
    public static LoginDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Login)et).getLoginFlg(), (et, vl) -> ((Login)et).setLoginFlg((Boolean)vl), "loginFlg");
        setupEpg(_epgMap, et -> ((Login)et).getUserId(), (et, vl) -> ((Login)et).setUserId(ctl(vl)), "userId");
        setupEpg(_epgMap, et -> ((Login)et).getLastLoginDatetime(), (et, vl) -> ((Login)et).setLastLoginDatetime(ctldt(vl)), "lastLoginDatetime");
        setupEpg(_epgMap, et -> ((Login)et).getLastLogoutDatetime(), (et, vl) -> ((Login)et).setLastLogoutDatetime(ctldt(vl)), "lastLogoutDatetime");
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
        setupEfpg(_efpgMap, et -> ((Login)et).getUser(), (et, vl) -> ((Login)et).setUser((OptionalEntity<User>)vl), "user");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "LOGIN";
    protected final String _tableDispName = "LOGIN";
    protected final String _tablePropertyName = "login";
    protected final TableSqlName _tableSqlName = new TableSqlName("LOGIN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLoginFlg = cci("LOGIN_FLG", "LOGIN_FLG", null, null, Boolean.class, "loginFlg", null, false, false, false, "BIT", null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Long.class, "userId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "user", null, null, false);
    protected final ColumnInfo _columnLastLoginDatetime = cci("LAST_LOGIN_DATETIME", "LAST_LOGIN_DATETIME", null, null, java.time.LocalDateTime.class, "lastLoginDatetime", null, false, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastLogoutDatetime = cci("LAST_LOGOUT_DATETIME", "LAST_LOGOUT_DATETIME", null, null, java.time.LocalDateTime.class, "lastLogoutDatetime", null, false, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null, false);

    /**
     * LOGIN_FLG: {BIT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoginFlg() { return _columnLoginFlg; }
    /**
     * USER_ID: {UQ, NotNull, BIGINT(19), FK to USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * LAST_LOGIN_DATETIME: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastLoginDatetime() { return _columnLastLoginDatetime; }
    /**
     * LAST_LOGOUT_DATETIME: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastLogoutDatetime() { return _columnLastLogoutDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLoginFlg());
        ls.add(columnUserId());
        ls.add(columnLastLoginDatetime());
        ls.add(columnLastLogoutDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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
        return cfi("FK_LOGIN_USER", "user", this, UserDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, false, false, null, null, false, "loginAsOne", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.twitter.dbflute.exentity.Login"; }
    public String getConditionBeanTypeName() { return "com.twitter.dbflute.cbean.LoginCB"; }
    public String getBehaviorTypeName() { return "com.twitter.dbflute.exbhv.LoginBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Login> getEntityType() { return Login.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Login newEntity() { return new Login(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Login)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Login)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
