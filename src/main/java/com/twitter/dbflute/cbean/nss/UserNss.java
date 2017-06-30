package com.twitter.dbflute.cbean.nss;

import com.twitter.dbflute.cbean.cq.UserCQ;

/**
 * The nest select set-upper of USER.
 * @author DBFlute(AutoGenerator)
 */
public class UserNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final UserCQ _query;
    public UserNss(UserCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * LOGIN by USER_ID, named 'loginAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LoginNss withLoginAsOne() {
        _query.xdoNss(() -> _query.queryLoginAsOne());
        return new LoginNss(_query.queryLoginAsOne());
    }
    /**
     * With nested relation columns to select clause. <br>
     * MUTTER by USER_ID, named 'mutterAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MutterNss withMutterAsOne() {
        _query.xdoNss(() -> _query.queryMutterAsOne());
        return new MutterNss(_query.queryMutterAsOne());
    }
    /**
     * With nested relation columns to select clause. <br>
     * RELATION by USER_ID, named 'relationAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public RelationNss withRelationAsOne() {
        _query.xdoNss(() -> _query.queryRelationAsOne());
        return new RelationNss(_query.queryRelationAsOne());
    }
}
