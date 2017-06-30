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
 * The abstract condition-query of MUTTER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMutterCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMutterCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "MUTTER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * MUTTER_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * MUTTER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param mutterId The value of mutterId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterId_GreaterThan(Long mutterId) {
        regMutterId(CK_GT, mutterId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param mutterId The value of mutterId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterId_LessThan(Long mutterId) {
        regMutterId(CK_LT, mutterId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param mutterId The value of mutterId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterId_GreaterEqual(Long mutterId) {
        regMutterId(CK_GE, mutterId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param mutterId The value of mutterId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterId_LessEqual(Long mutterId) {
        regMutterId(CK_LE, mutterId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * MUTTER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of mutterId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of mutterId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMutterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMutterId(), "MUTTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MUTTER_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * MUTTER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param mutterIdList The collection of mutterId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMutterId_NotInScope(Collection<Long> mutterIdList) {
        doSetMutterId_NotInScope(mutterIdList);
    }

    protected void doSetMutterId_NotInScope(Collection<Long> mutterIdList) {
        regINS(CK_NINS, cTL(mutterIdList), xgetCValueMutterId(), "MUTTER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MUTTER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setMutterId_IsNull() { regMutterId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MUTTER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setMutterId_IsNotNull() { regMutterId(CK_ISNN, DOBJ); }

    protected void regMutterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMutterId(), "MUTTER_ID"); }
    protected abstract ConditionValue xgetCValueMutterId();

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
     * MUTTER_DATETIME: {NotNull, DATETIME(19)}
     * @param mutterDatetime The value of mutterDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterDatetime_Equal(java.time.LocalDateTime mutterDatetime) {
        regMutterDatetime(CK_EQ,  mutterDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_DATETIME: {NotNull, DATETIME(19)}
     * @param mutterDatetime The value of mutterDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterDatetime_GreaterThan(java.time.LocalDateTime mutterDatetime) {
        regMutterDatetime(CK_GT,  mutterDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_DATETIME: {NotNull, DATETIME(19)}
     * @param mutterDatetime The value of mutterDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterDatetime_LessThan(java.time.LocalDateTime mutterDatetime) {
        regMutterDatetime(CK_LT,  mutterDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_DATETIME: {NotNull, DATETIME(19)}
     * @param mutterDatetime The value of mutterDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterDatetime_GreaterEqual(java.time.LocalDateTime mutterDatetime) {
        regMutterDatetime(CK_GE,  mutterDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_DATETIME: {NotNull, DATETIME(19)}
     * @param mutterDatetime The value of mutterDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterDatetime_LessEqual(java.time.LocalDateTime mutterDatetime) {
        regMutterDatetime(CK_LE, mutterDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setMutterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of mutterDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of mutterDatetime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setMutterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setMutterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setMutterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of mutterDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of mutterDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setMutterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "MUTTER_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueMutterDatetime(), nm, op);
    }

    protected void regMutterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMutterDatetime(), "MUTTER_DATETIME"); }
    protected abstract ConditionValue xgetCValueMutterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MUTTER_TEXT: {NotNull, TEXT(65535)}
     * @param mutterText The value of mutterText as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMutterText_Equal(String mutterText) {
        doSetMutterText_Equal(fRES(mutterText));
    }

    protected void doSetMutterText_Equal(String mutterText) {
        regMutterText(CK_EQ, mutterText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MUTTER_TEXT: {NotNull, TEXT(65535)}
     * @param mutterText The value of mutterText as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMutterText_NotEqual(String mutterText) {
        doSetMutterText_NotEqual(fRES(mutterText));
    }

    protected void doSetMutterText_NotEqual(String mutterText) {
        regMutterText(CK_NES, mutterText);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MUTTER_TEXT: {NotNull, TEXT(65535)}
     * @param mutterText The value of mutterText as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMutterText_GreaterThan(String mutterText) {
        regMutterText(CK_GT, fRES(mutterText));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MUTTER_TEXT: {NotNull, TEXT(65535)}
     * @param mutterText The value of mutterText as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMutterText_LessThan(String mutterText) {
        regMutterText(CK_LT, fRES(mutterText));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MUTTER_TEXT: {NotNull, TEXT(65535)}
     * @param mutterText The value of mutterText as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMutterText_GreaterEqual(String mutterText) {
        regMutterText(CK_GE, fRES(mutterText));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MUTTER_TEXT: {NotNull, TEXT(65535)}
     * @param mutterText The value of mutterText as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMutterText_LessEqual(String mutterText) {
        regMutterText(CK_LE, fRES(mutterText));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MUTTER_TEXT: {NotNull, TEXT(65535)}
     * @param mutterTextList The collection of mutterText as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMutterText_InScope(Collection<String> mutterTextList) {
        doSetMutterText_InScope(mutterTextList);
    }

    protected void doSetMutterText_InScope(Collection<String> mutterTextList) {
        regINS(CK_INS, cTL(mutterTextList), xgetCValueMutterText(), "MUTTER_TEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MUTTER_TEXT: {NotNull, TEXT(65535)}
     * @param mutterTextList The collection of mutterText as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMutterText_NotInScope(Collection<String> mutterTextList) {
        doSetMutterText_NotInScope(mutterTextList);
    }

    protected void doSetMutterText_NotInScope(Collection<String> mutterTextList) {
        regINS(CK_NINS, cTL(mutterTextList), xgetCValueMutterText(), "MUTTER_TEXT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MUTTER_TEXT: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setMutterText_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param mutterText The value of mutterText as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMutterText_LikeSearch(String mutterText, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMutterText_LikeSearch(mutterText, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MUTTER_TEXT: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setMutterText_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mutterText The value of mutterText as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setMutterText_LikeSearch(String mutterText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mutterText), xgetCValueMutterText(), "MUTTER_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MUTTER_TEXT: {NotNull, TEXT(65535)}
     * @param mutterText The value of mutterText as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMutterText_NotLikeSearch(String mutterText, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMutterText_NotLikeSearch(mutterText, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MUTTER_TEXT: {NotNull, TEXT(65535)}
     * @param mutterText The value of mutterText as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setMutterText_NotLikeSearch(String mutterText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mutterText), xgetCValueMutterText(), "MUTTER_TEXT", likeSearchOption);
    }

    protected void regMutterText(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMutterText(), "MUTTER_TEXT"); }
    protected abstract ConditionValue xgetCValueMutterText();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MUTTER_IMAGE: {BLOB(65535)}
     */
    public void setMutterImage_IsNull() { regMutterImage(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MUTTER_IMAGE: {BLOB(65535)}
     */
    public void setMutterImage_IsNotNull() { regMutterImage(CK_ISNN, DOBJ); }

    protected void regMutterImage(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMutterImage(), "MUTTER_IMAGE"); }
    protected abstract ConditionValue xgetCValueMutterImage();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_LATITUDE: {DOUBLE(22)}
     * @param mutterLatitude The value of mutterLatitude as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterLatitude_Equal(java.math.BigDecimal mutterLatitude) {
        doSetMutterLatitude_Equal(mutterLatitude);
    }

    protected void doSetMutterLatitude_Equal(java.math.BigDecimal mutterLatitude) {
        regMutterLatitude(CK_EQ, mutterLatitude);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_LATITUDE: {DOUBLE(22)}
     * @param mutterLatitude The value of mutterLatitude as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterLatitude_NotEqual(java.math.BigDecimal mutterLatitude) {
        doSetMutterLatitude_NotEqual(mutterLatitude);
    }

    protected void doSetMutterLatitude_NotEqual(java.math.BigDecimal mutterLatitude) {
        regMutterLatitude(CK_NES, mutterLatitude);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_LATITUDE: {DOUBLE(22)}
     * @param mutterLatitude The value of mutterLatitude as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterLatitude_GreaterThan(java.math.BigDecimal mutterLatitude) {
        regMutterLatitude(CK_GT, mutterLatitude);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_LATITUDE: {DOUBLE(22)}
     * @param mutterLatitude The value of mutterLatitude as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterLatitude_LessThan(java.math.BigDecimal mutterLatitude) {
        regMutterLatitude(CK_LT, mutterLatitude);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_LATITUDE: {DOUBLE(22)}
     * @param mutterLatitude The value of mutterLatitude as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterLatitude_GreaterEqual(java.math.BigDecimal mutterLatitude) {
        regMutterLatitude(CK_GE, mutterLatitude);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_LATITUDE: {DOUBLE(22)}
     * @param mutterLatitude The value of mutterLatitude as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterLatitude_LessEqual(java.math.BigDecimal mutterLatitude) {
        regMutterLatitude(CK_LE, mutterLatitude);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_LATITUDE: {DOUBLE(22)}
     * @param minNumber The min number of mutterLatitude. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of mutterLatitude. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMutterLatitude_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMutterLatitude_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_LATITUDE: {DOUBLE(22)}
     * @param minNumber The min number of mutterLatitude. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of mutterLatitude. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMutterLatitude_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMutterLatitude(), "MUTTER_LATITUDE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MUTTER_LATITUDE: {DOUBLE(22)}
     * @param mutterLatitudeList The collection of mutterLatitude as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMutterLatitude_InScope(Collection<java.math.BigDecimal> mutterLatitudeList) {
        doSetMutterLatitude_InScope(mutterLatitudeList);
    }

    protected void doSetMutterLatitude_InScope(Collection<java.math.BigDecimal> mutterLatitudeList) {
        regINS(CK_INS, cTL(mutterLatitudeList), xgetCValueMutterLatitude(), "MUTTER_LATITUDE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MUTTER_LATITUDE: {DOUBLE(22)}
     * @param mutterLatitudeList The collection of mutterLatitude as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMutterLatitude_NotInScope(Collection<java.math.BigDecimal> mutterLatitudeList) {
        doSetMutterLatitude_NotInScope(mutterLatitudeList);
    }

    protected void doSetMutterLatitude_NotInScope(Collection<java.math.BigDecimal> mutterLatitudeList) {
        regINS(CK_NINS, cTL(mutterLatitudeList), xgetCValueMutterLatitude(), "MUTTER_LATITUDE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MUTTER_LATITUDE: {DOUBLE(22)}
     */
    public void setMutterLatitude_IsNull() { regMutterLatitude(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MUTTER_LATITUDE: {DOUBLE(22)}
     */
    public void setMutterLatitude_IsNotNull() { regMutterLatitude(CK_ISNN, DOBJ); }

    protected void regMutterLatitude(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMutterLatitude(), "MUTTER_LATITUDE"); }
    protected abstract ConditionValue xgetCValueMutterLatitude();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_LONGITUDE: {DOUBLE(22)}
     * @param mutterLongitude The value of mutterLongitude as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterLongitude_Equal(java.math.BigDecimal mutterLongitude) {
        doSetMutterLongitude_Equal(mutterLongitude);
    }

    protected void doSetMutterLongitude_Equal(java.math.BigDecimal mutterLongitude) {
        regMutterLongitude(CK_EQ, mutterLongitude);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_LONGITUDE: {DOUBLE(22)}
     * @param mutterLongitude The value of mutterLongitude as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterLongitude_NotEqual(java.math.BigDecimal mutterLongitude) {
        doSetMutterLongitude_NotEqual(mutterLongitude);
    }

    protected void doSetMutterLongitude_NotEqual(java.math.BigDecimal mutterLongitude) {
        regMutterLongitude(CK_NES, mutterLongitude);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_LONGITUDE: {DOUBLE(22)}
     * @param mutterLongitude The value of mutterLongitude as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterLongitude_GreaterThan(java.math.BigDecimal mutterLongitude) {
        regMutterLongitude(CK_GT, mutterLongitude);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_LONGITUDE: {DOUBLE(22)}
     * @param mutterLongitude The value of mutterLongitude as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterLongitude_LessThan(java.math.BigDecimal mutterLongitude) {
        regMutterLongitude(CK_LT, mutterLongitude);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_LONGITUDE: {DOUBLE(22)}
     * @param mutterLongitude The value of mutterLongitude as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterLongitude_GreaterEqual(java.math.BigDecimal mutterLongitude) {
        regMutterLongitude(CK_GE, mutterLongitude);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_LONGITUDE: {DOUBLE(22)}
     * @param mutterLongitude The value of mutterLongitude as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMutterLongitude_LessEqual(java.math.BigDecimal mutterLongitude) {
        regMutterLongitude(CK_LE, mutterLongitude);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_LONGITUDE: {DOUBLE(22)}
     * @param minNumber The min number of mutterLongitude. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of mutterLongitude. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMutterLongitude_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMutterLongitude_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MUTTER_LONGITUDE: {DOUBLE(22)}
     * @param minNumber The min number of mutterLongitude. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of mutterLongitude. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMutterLongitude_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMutterLongitude(), "MUTTER_LONGITUDE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MUTTER_LONGITUDE: {DOUBLE(22)}
     * @param mutterLongitudeList The collection of mutterLongitude as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMutterLongitude_InScope(Collection<java.math.BigDecimal> mutterLongitudeList) {
        doSetMutterLongitude_InScope(mutterLongitudeList);
    }

    protected void doSetMutterLongitude_InScope(Collection<java.math.BigDecimal> mutterLongitudeList) {
        regINS(CK_INS, cTL(mutterLongitudeList), xgetCValueMutterLongitude(), "MUTTER_LONGITUDE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MUTTER_LONGITUDE: {DOUBLE(22)}
     * @param mutterLongitudeList The collection of mutterLongitude as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMutterLongitude_NotInScope(Collection<java.math.BigDecimal> mutterLongitudeList) {
        doSetMutterLongitude_NotInScope(mutterLongitudeList);
    }

    protected void doSetMutterLongitude_NotInScope(Collection<java.math.BigDecimal> mutterLongitudeList) {
        regINS(CK_NINS, cTL(mutterLongitudeList), xgetCValueMutterLongitude(), "MUTTER_LONGITUDE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MUTTER_LONGITUDE: {DOUBLE(22)}
     */
    public void setMutterLongitude_IsNull() { regMutterLongitude(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MUTTER_LONGITUDE: {DOUBLE(22)}
     */
    public void setMutterLongitude_IsNotNull() { regMutterLongitude(CK_ISNN, DOBJ); }

    protected void regMutterLongitude(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMutterLongitude(), "MUTTER_LONGITUDE"); }
    protected abstract ConditionValue xgetCValueMutterLongitude();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EDIT_DATETIME: {DATETIME(19)}
     * @param editDatetime The value of editDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEditDatetime_Equal(java.time.LocalDateTime editDatetime) {
        regEditDatetime(CK_EQ,  editDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EDIT_DATETIME: {DATETIME(19)}
     * @param editDatetime The value of editDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEditDatetime_GreaterThan(java.time.LocalDateTime editDatetime) {
        regEditDatetime(CK_GT,  editDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EDIT_DATETIME: {DATETIME(19)}
     * @param editDatetime The value of editDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEditDatetime_LessThan(java.time.LocalDateTime editDatetime) {
        regEditDatetime(CK_LT,  editDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EDIT_DATETIME: {DATETIME(19)}
     * @param editDatetime The value of editDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEditDatetime_GreaterEqual(java.time.LocalDateTime editDatetime) {
        regEditDatetime(CK_GE,  editDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EDIT_DATETIME: {DATETIME(19)}
     * @param editDatetime The value of editDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEditDatetime_LessEqual(java.time.LocalDateTime editDatetime) {
        regEditDatetime(CK_LE, editDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EDIT_DATETIME: {DATETIME(19)}
     * <pre>e.g. setEditDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of editDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of editDatetime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setEditDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setEditDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EDIT_DATETIME: {DATETIME(19)}
     * <pre>e.g. setEditDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of editDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of editDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setEditDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "EDIT_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueEditDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EDIT_DATETIME: {DATETIME(19)}
     */
    public void setEditDatetime_IsNull() { regEditDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EDIT_DATETIME: {DATETIME(19)}
     */
    public void setEditDatetime_IsNotNull() { regEditDatetime(CK_ISNN, DOBJ); }

    protected void regEditDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEditDatetime(), "EDIT_DATETIME"); }
    protected abstract ConditionValue xgetCValueEditDatetime();

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
    public HpSLCFunction<MutterCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MutterCB.class);
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
    public HpSLCFunction<MutterCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MutterCB.class);
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
    public HpSLCFunction<MutterCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MutterCB.class);
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
    public HpSLCFunction<MutterCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MutterCB.class);
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
    public HpSLCFunction<MutterCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MutterCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MutterCB&gt;() {
     *     public void query(MutterCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MutterCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MutterCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MutterCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MutterCQ sq);

    protected MutterCB xcreateScalarConditionCB() {
        MutterCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MutterCB xcreateScalarConditionPartitionByCB() {
        MutterCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MutterCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MutterCB cb = new MutterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MUTTER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MutterCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MutterCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MutterCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MutterCB cb = new MutterCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MUTTER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MutterCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MutterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MutterCB cb = new MutterCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MutterCQ sq);

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
    protected MutterCB newMyCB() {
        return new MutterCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MutterCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
