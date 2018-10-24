package boot.security.vo;

import boot.application.query.Pager;

public class FindRoleParam extends Pager {

    private String search;

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
