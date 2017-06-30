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
 * The DB meta of RELATION. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class RelationDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final RelationDbm _instance = new RelationDbm();
    private RelationDbm() {}
    public static RelationDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Relation)et).getRelationId(), (et, vl) -> ((Relation)et).setRelationId(ctl(vl)), "relationId");
        setupEpg(_epgMap, et -> ((Relation)et).getUserId(), (et, vl) -> ((Relation)et).setUserId(ctl(vl)), "userId");
        setupEpg(_epgMap, et -> ((Relation)et).getFollowUserId(), (et, vl) -> ((Relation)et).setFollowUserId(ctl(vl)), "followUserId");
        setupEpg(_epgMap, et -> ((Relation)et).getFollowApprovalDatetime(), (et, vl) -> ((Relation)et).setFollowApprovalDatetime(ctldt(vl)), "followApprovalDatetime");
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
        setupEfpg(_efpgMap, et -> ((Relation)et).getUser(), (et, vl) -> ((Relation)et).setUser((OptionalEntity<User>)vl), "user");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "RELATION";
    protected final String _tableDispName = "RELATION";
    protected final String _tablePropertyName = "relation";
    protected final TableSqlName _tableSqlName = new TableSqlName("RELATION", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRelationId = cci("RELATION_ID", "RELATION_ID", null, null, Long.class, "relationId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Long.class, "userId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "user", null, null, false);
    protected final ColumnInfo _columnFollowUserId = cci("FOLLOW_USER_ID", "FOLLOW_USER_ID", null, null, Long.class, "followUserId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFollowApprovalDatetime = cci("FOLLOW_APPROVAL_DATETIME", "FOLLOW_APPROVAL_DATETIME", null, null, java.time.LocalDateTime.class, "followApprovalDatetime", null, false, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null, false);

    /**
     * RELATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRelationId() { return _columnRelationId; }
    /**
     * USER_ID: {UQ, NotNull, BIGINT(19), FK to USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * FOLLOW_USER_ID: {NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFollowUserId() { return _columnFollowUserId; }
    /**
     * FOLLOW_APPROVAL_DATETIME: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFollowApprovalDatetime() { return _columnFollowApprovalDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRelationId());
        ls.add(columnUserId());
        ls.add(columnFollowUserId());
        ls.add(columnFollowApprovalDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRelationId()); }
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
        return cfi("FK_RELATION_USER", "user", this, UserDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, false, false, null, null, false, "relationAsOne", false);
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
    public String getEntityTypeName() { return "com.twitter.dbflute.exentity.Relation"; }
    public String getConditionBeanTypeName() { return "com.twitter.dbflute.cbean.RelationCB"; }
    public String getBehaviorTypeName() { return "com.twitter.dbflute.exbhv.RelationBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Relation> getEntityType() { return Relation.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Relation newEntity() { return new Relation(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Relation)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Relation)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
