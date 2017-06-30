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
 * The abstract condition-query of GOOD.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsGoodCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsGoodCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "GOOD";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GOOD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param goodId The value of goodId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGoodId_Equal(Long goodId) {
        doSetGoodId_Equal(goodId);
    }

    protected void doSetGoodId_Equal(Long goodId) {
        regGoodId(CK_EQ, goodId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GOOD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param goodId The value of goodId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGoodId_NotEqual(Long goodId) {
        doSetGoodId_NotEqual(goodId);
    }

    protected void doSetGoodId_NotEqual(Long goodId) {
        regGoodId(CK_NES, goodId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GOOD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param goodId The value of goodId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGoodId_GreaterThan(Long goodId) {
        regGoodId(CK_GT, goodId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GOOD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param goodId The value of goodId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGoodId_LessThan(Long goodId) {
        regGoodId(CK_LT, goodId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GOOD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param goodId The value of goodId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGoodId_GreaterEqual(Long goodId) {
        regGoodId(CK_GE, goodId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GOOD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param goodId The value of goodId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGoodId_LessEqual(Long goodId) {
        regGoodId(CK_LE, goodId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GOOD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of goodId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of goodId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setGoodId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setGoodId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GOOD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of goodId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of goodId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setGoodId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGoodId(), "GOOD_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GOOD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param goodIdList The collection of goodId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGoodId_InScope(Collection<Long> goodIdList) {
        doSetGoodId_InScope(goodIdList);
    }

    protected void doSetGoodId_InScope(Collection<Long> goodIdList) {
        regINS(CK_INS, cTL(goodIdList), xgetCValueGoodId(), "GOOD_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GOOD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param goodIdList The collection of goodId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGoodId_NotInScope(Collection<Long> goodIdList) {
        doSetGoodId_NotInScope(goodIdList);
    }

    protected void doSetGoodId_NotInScope(Collection<Long> goodIdList) {
        regINS(CK_NINS, cTL(goodIdList), xgetCValueGoodId(), "GOOD_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GOOD_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setGoodId_IsNull() { regGoodId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GOOD_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setGoodId_IsNotNull() { regGoodId(CK_ISNN, DOBJ); }

    protected void regGoodId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGoodId(), "GOOD_ID"); }
    protected abstract ConditionValue xgetCValueGoodId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
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
     * USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
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
     * USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Long userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Long userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Long userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Long userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
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
     * USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param minNumber The min number of userId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
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
     * USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
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
     * MUTTER_ID: {UQ+, NotNull, BIGINT(19)}
     * @param mutterId The value of mutterId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterId_Equal(Long mutterId) {
        doSetMutterId_Equal(mutterId);
    }

    protected void doSetMutterId_Equal(Long mutterId) {
        regMutterId(CK_EQ, mutterId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_ID: {UQ+, NotNull, BIGINT(19)}
     * @param mutterId The value of mutterId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterId_NotEqual(Long mutterId) {
        doSetMutterId_NotEqual(mutterId);
    }

    protected void doSetMutterId_NotEqual(Long mutterId) {
        regMutterId(CK_NES, mutterId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_ID: {UQ+, NotNull, BIGINT(19)}
     * @param mutterId The value of mutterId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterId_GreaterThan(Long mutterId) {
        regMutterId(CK_GT, mutterId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_ID: {UQ+, NotNull, BIGINT(19)}
     * @param mutterId The value of mutterId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterId_LessThan(Long mutterId) {
        regMutterId(CK_LT, mutterId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_ID: {UQ+, NotNull, BIGINT(19)}
     * @param mutterId The value of mutterId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterId_GreaterEqual(Long mutterId) {
        regMutterId(CK_GE, mutterId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_ID: {UQ+, NotNull, BIGINT(19)}
     * @param mutterId The value of mutterId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterId_LessEqual(Long mutterId) {
        regMutterId(CK_LE, mutterId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_ID: {UQ+, NotNull, BIGINT(19)}
     * @param minNumber The min number of mutterId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of mutterId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMutterId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMutterId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_ID: {UQ+, NotNull, BIGINT(19)}
     * @param minNumber The min number of mutterId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of mutterId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMutterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMutterId(), "MUTTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MUTTER_ID: {UQ+, NotNull, BIGINT(19)}
     * @param mutterIdList The collection of mutterId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMutterId_InScope(Collection<Long> mutterIdList) {
        doSetMutterId_InScope(mutterIdList);
    }

    protected void doSetMutterId_InScope(Collection<Long> mutterIdList) {
        regINS(CK_INS, cTL(mutterIdList), xgetCValueMutterId(), "MUTTER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MUTTER_ID: {UQ+, NotNull, BIGINT(19)}
     * @param mutterIdList The collection of mutterId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMutterId_NotInScope(Collection<Long> mutterIdList) {
        doSetMutterId_NotInScope(mutterIdList);
    }

    protected void doSetMutterId_NotInScope(Collection<Long> mutterIdList) {
        regINS(CK_NINS, cTL(mutterIdList), xgetCValueMutterId(), "MUTTER_ID");
    }

    protected void regMutterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMutterId(), "MUTTER_ID"); }
    protected abstract ConditionValue xgetCValueMutterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GOOD_FLG: {BIT}
     * @param goodFlg The value of goodFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGoodFlg_Equal(Boolean goodFlg) {
        regGoodFlg(CK_EQ, goodFlg);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GOOD_FLG: {BIT}
     */
    public void setGoodFlg_IsNull() { regGoodFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GOOD_FLG: {BIT}
     */
    public void setGoodFlg_IsNotNull() { regGoodFlg(CK_ISNN, DOBJ); }

    protected void regGoodFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGoodFlg(), "GOOD_FLG"); }
    protected abstract ConditionValue xgetCValueGoodFlg();

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
    public HpSLCFunction<GoodCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, GoodCB.class);
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
    public HpSLCFunction<GoodCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, GoodCB.class);
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
    public HpSLCFunction<GoodCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, GoodCB.class);
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
    public HpSLCFunction<GoodCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, GoodCB.class);
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
    public HpSLCFunction<GoodCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, GoodCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;GoodCB&gt;() {
     *     public void query(GoodCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<GoodCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, GoodCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        GoodCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(GoodCQ sq);

    protected GoodCB xcreateScalarConditionCB() {
        GoodCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected GoodCB xcreateScalarConditionPartitionByCB() {
        GoodCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<GoodCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        GoodCB cb = new GoodCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "GOOD_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(GoodCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<GoodCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(GoodCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        GoodCB cb = new GoodCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "GOOD_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(GoodCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<GoodCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        GoodCB cb = new GoodCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(GoodCQ sq);

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
    protected GoodCB newMyCB() {
        return new GoodCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return GoodCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
