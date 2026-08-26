package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

public final class SearchEngine {
    public static ArrayList searchEngines;
    public final String autocomplete_url;
    public final String name;
    public final String search_url;

    public SearchEngine(String str, String str2, String str3) {
        this.name = str;
        this.search_url = str2;
        this.autocomplete_url = str3;
    }

    public static SearchEngine getCurrent() {
        ArrayList searchEngines2 = getSearchEngines();
        return searchEngines2.isEmpty() ? new SearchEngine("Google", "https://www.google.com/search?q=", "https://suggestqueries.google.com/complete/search?client=chrome&amp;q=") : (SearchEngine) searchEngines2.get(Utilities.clamp(SharedConfig.searchEngineType, searchEngines2.size() - 1, 0));
    }

    public static ArrayList getSearchEngines() {
        if (searchEngines == null) {
            searchEngines = new ArrayList();
            int i = 1;
            while (true) {
                String strNullable = nullable(LocaleController.getString("SearchEngine" + i + "Name"));
                if (strNullable == null) {
                    break;
                }
                String strNullable2 = nullable(LocaleController.getString("SearchEngine" + i + "SearchURL"));
                String strNullable3 = nullable(LocaleController.getString("SearchEngine" + i + "AutocompleteURL"));
                nullable(LocaleController.getString("SearchEngine" + i + "PrivacyPolicyURL"));
                searchEngines.add(new SearchEngine(strNullable, strNullable2, strNullable3));
                i++;
            }
        }
        return searchEngines;
    }

    public static String nullable(String str) {
        if (str == null || str.startsWith("LOC_ERR") || "reserved".equals(str)) {
            return null;
        }
        return str;
    }
}
