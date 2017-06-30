package com.twitter.dbflute.cbean.nss;

import com.twitter.dbflute.cbean.cq.GoodCQ;

/**
 * The nest select set-upper of GOOD.
 * @author DBFlute(AutoGenerator)
 */
public class GoodNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final GoodCQ _query;
    public GoodNss(GoodCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * USER by my USER_ID, named 'user'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public UserNss withUser() {
        _query.xdoNss(() -> _query.queryUser());
        return new UserNss(_query.queryUser());
    }
}
