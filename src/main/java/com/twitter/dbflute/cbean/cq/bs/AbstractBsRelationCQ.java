package com.twitter.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.twitter.dbflute.allcommon.*;
import com.twitter.dbflute.cbean.*;
import com.twitter.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of RELATION.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsRelationCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsRelationCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "RELATION";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RELATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param relationId The value of relationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRelationId_Equal(Long relationId) {
        doSetRelationId_Equal(relationId);
    }

    protected void doSetRelationId_Equal(Long relationId) {
        regRelationId(CK_EQ, relationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RELATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param relationId The value of relationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRelationId_NotEqual(Long relationId) {
        doSetRelationId_NotEqual(relationId);
    }

    protected void doSetRelationId_NotEqual(Long relationId) {
        regRelationId(CK_NES, relationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RELATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param relationId The value of relationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRelationId_GreaterThan(Long relationId) {
        regRelationId(CK_GT, relationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RELATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param relationId The value of relationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRelationId_LessThan(Long relationId) {
        regRelationId(CK_LT, relationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RELATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param relationId The value of relationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRelationId_GreaterEqual(Long relationId) {
        regRelationId(CK_GE, relationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RELATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param relationId The value of relationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRelationId_LessEqual(Long relationId) {
        regRelationId(CK_LE, relationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RELATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of relationId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of relationId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRelationId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRelationId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RELATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of relationId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of relationId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setRelationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRelationId(), "RELATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RELATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param relationIdList The collection of relationId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRelationId_InScope(Collection<Long> relationIdList) {
        doSetRelationId_InScope(relationIdList);
    }

    protected void doSetRelationId_InScope(Collection<Long> relationIdList) {
        regINS(CK_INS, cTL(relationIdList), xgetCValueRelationId(), "RELATION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RELATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param relationIdList The collection of relationId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRelationId_NotInScope(Collection<Long> relationIdList) {
        doSetRelationId_NotInScope(relationIdList);
    }

    protected void doSetRelationId_NotInScope(Collection<Long> relationIdList) {
        regINS(CK_NINS, cTL(relationIdList), xgetCValueRelationId(), "RELATION_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RELATION_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setRelationId_IsNull() { regRelationId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RELATION_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setRelationId_IsNotNull() { regRelationId(CK_ISNN, DOBJ); }

    protected void regRelationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRelationId(), "RELATION_ID"); }
    protected abstract ConditionValue xgetCValueRelationId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {UQ, NotNull, BIGINT(19), FK to USER}
     * @param userId The value of userId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_Equal(Long userId) {
        doSetUserId_Equal(userId);
    }

    protected void doSetUserId_Equal(Long userId) {
        regUserId(CK_EQ, userId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {UQ, NotNull, BIGINT(19), FK to USER}
     * @param userId The value of userId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_NotEqual(Long userId) {
        doSetUserId_NotEqual(userId);
    }

    protected void doSetUserId_NotEqual(Long userId) {
        regUserId(CK_NES, userId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {UQ, NotNull, BIGINT(19), FK to USER}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Long userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {UQ, NotNull, BIGINT(19), FK to USER}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Long userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {UQ, NotNull, BIGINT(19), FK to USER}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Long userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {UQ, NotNull, BIGINT(19), FK to USER}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Long userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {UQ, NotNull, BIGINT(19), FK to USER}
     * @param minNumber The min number of userId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUserId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUserId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {UQ, NotNull, BIGINT(19), FK to USER}
     * @param minNumber The min number of userId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {UQ, NotNull, BIGINT(19), FK to USER}
     * @param userIdList The collection of userId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserId_InScope(Collection<Long> userIdList) {
        doSetUserId_InScope(userIdList);
    }

    protected void doSetUserId_InScope(Collection<Long> userIdList) {
        regINS(CK_INS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {UQ, NotNull, BIGINT(19), FK to USER}
     * @param userIdList The collection of userId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserId_NotInScope(Collection<Long> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Long> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "USER_ID"); }
    protected abstract ConditionValue xgetCValueUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_USER_ID: {NotNull, BIGINT(19)}
     * @param followUserId The value of followUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowUserId_Equal(Long followUserId) {
        doSetFollowUserId_Equal(followUserId);
    }

    protected void doSetFollowUserId_Equal(Long followUserId) {
        regFollowUserId(CK_EQ, followUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_USER_ID: {NotNull, BIGINT(19)}
     * @param followUserId The value of followUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowUserId_NotEqual(Long followUserId) {
        doSetFollowUserId_NotEqual(followUserId);
    }

    protected void doSetFollowUserId_NotEqual(Long followUserId) {
        regFollowUserId(CK_NES, followUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_USER_ID: {NotNull, BIGINT(19)}
     * @param followUserId The value of followUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowUserId_GreaterThan(Long followUserId) {
        regFollowUserId(CK_GT, followUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_USER_ID: {NotNull, BIGINT(19)}
     * @param followUserId The value of followUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowUserId_LessThan(Long followUserId) {
        regFollowUserId(CK_LT, followUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_USER_ID: {NotNull, BIGINT(19)}
     * @param followUserId The value of followUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowUserId_GreaterEqual(Long followUserId) {
        regFollowUserId(CK_GE, followUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_USER_ID: {NotNull, BIGINT(19)}
     * @param followUserId The value of followUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowUserId_LessEqual(Long followUserId) {
        regFollowUserId(CK_LE, followUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_USER_ID: {NotNull, BIGINT(19)}
     * @param minNumber The min number of followUserId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of followUserId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFollowUserId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFollowUserId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_USER_ID: {NotNull, BIGINT(19)}
     * @param minNumber The min number of followUserId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of followUserId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setFollowUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFollowUserId(), "FOLLOW_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOLLOW_USER_ID: {NotNull, BIGINT(19)}
     * @param followUserIdList The collection of followUserId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFollowUserId_InScope(Collection<Long> followUserIdList) {
        doSetFollowUserId_InScope(followUserIdList);
    }

    protected void doSetFollowUserId_InScope(Collection<Long> followUserIdList) {
        regINS(CK_INS, cTL(followUserIdList), xgetCValueFollowUserId(), "FOLLOW_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOLLOW_USER_ID: {NotNull, BIGINT(19)}
     * @param followUserIdList The collection of followUserId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFollowUserId_NotInScope(Collection<Long> followUserIdList) {
        doSetFollowUserId_NotInScope(followUserIdList);
    }

    protected void doSetFollowUserId_NotInScope(Collection<Long> followUserIdList) {
        regINS(CK_NINS, cTL(followUserIdList), xgetCValueFollowUserId(), "FOLLOW_USER_ID");
    }

    protected void regFollowUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFollowUserId(), "FOLLOW_USER_ID"); }
    protected abstract ConditionValue xgetCValueFollowUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_APPROVAL_DATETIME: {DATETIME(19)}
     * @param followApprovalDatetime The value of followApprovalDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowApprovalDatetime_Equal(java.time.LocalDateTime followApprovalDatetime) {
        regFollowApprovalDatetime(CK_EQ,  followApprovalDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_APPROVAL_DATETIME: {DATETIME(19)}
     * @param followApprovalDatetime The value of followApprovalDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowApprovalDatetime_GreaterThan(java.time.LocalDateTime followApprovalDatetime) {
        regFollowApprovalDatetime(CK_GT,  followApprovalDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_APPROVAL_DATETIME: {DATETIME(19)}
     * @param followApprovalDatetime The value of followApprovalDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowApprovalDatetime_LessThan(java.time.LocalDateTime followApprovalDatetime) {
        regFollowApprovalDatetime(CK_LT,  followApprovalDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_APPROVAL_DATETIME: {DATETIME(19)}
     * @param followApprovalDatetime The value of followApprovalDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowApprovalDatetime_GreaterEqual(java.time.LocalDateTime followApprovalDatetime) {
        regFollowApprovalDatetime(CK_GE,  followApprovalDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_APPROVAL_DATETIME: {DATETIME(19)}
     * @param followApprovalDatetime The value of followApprovalDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowApprovalDatetime_LessEqual(java.time.LocalDateTime followApprovalDatetime) {
        regFollowApprovalDatetime(CK_LE, followApprovalDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_APPROVAL_DATETIME: {DATETIME(19)}
     * <pre>e.g. setFollowApprovalDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of followApprovalDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of followApprovalDatetime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setFollowApprovalDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setFollowApprovalDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_APPROVAL_DATETIME: {DATETIME(19)}
     * <pre>e.g. setFollowApprovalDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of followApprovalDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of followApprovalDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setFollowApprovalDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "FOLLOW_APPROVAL_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueFollowApprovalDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FOLLOW_APPROVAL_DATETIME: {DATETIME(19)}
     */
    public void setFollowApprovalDatetime_IsNull() { regFollowApprovalDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FOLLOW_APPROVAL_DATETIME: {DATETIME(19)}
     */
    public void setFollowApprovalDatetime_IsNotNull() { regFollowApprovalDatetime(CK_ISNN, DOBJ); }

    protected void regFollowApprovalDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFollowApprovalDatetime(), "FOLLOW_APPROVAL_DATETIME"); }
    protected abstract ConditionValue xgetCValueFollowApprovalDatetime();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<RelationCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, RelationCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<RelationCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, RelationCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<RelationCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, RelationCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<RelationCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, RelationCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<RelationCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, RelationCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;RelationCB&gt;() {
     *     public void query(RelationCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<RelationCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, RelationCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        RelationCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(RelationCQ sq);

    protected RelationCB xcreateScalarConditionCB() {
        RelationCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected RelationCB xcreateScalarConditionPartitionByCB() {
        RelationCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<RelationCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RelationCB cb = new RelationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "RELATION_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(RelationCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<RelationCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(RelationCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RelationCB cb = new RelationCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "RELATION_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(RelationCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<RelationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RelationCB cb = new RelationCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(RelationCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected RelationCB newMyCB() {
        return new RelationCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return RelationCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
