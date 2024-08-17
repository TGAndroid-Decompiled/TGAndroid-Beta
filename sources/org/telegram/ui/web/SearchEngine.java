package org.telegram.ui.web;

import android.text.TextUtils;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

public class SearchEngine {
    private static ArrayList<SearchEngine> searchEngines;
    public final String autocomplete_url;
    public final String name;
    public final String privacy_policy_url;
    public final String search_url;

    public SearchEngine(String str, String str2, String str3, String str4) {
        this.name = str;
        this.search_url = str2;
        this.autocomplete_url = str3;
        this.privacy_policy_url = str4;
    }

    public String getSearchURL(String str) {
        if (this.search_url == null) {
            return null;
        }
        return this.search_url + URLEncoder.encode(str);
    }

    public String getAutocompleteURL(String str) {
        if (this.autocomplete_url == null) {
            return null;
        }
        return this.autocomplete_url + URLEncoder.encode(str);
    }

    public ArrayList<String> extractSuggestions(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONArray(str).getJSONArray(1);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
            try {
                JSONArray jSONArray2 = new JSONObject(str).getJSONObject("gossip").getJSONArray("results");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    arrayList.add(jSONArray2.getJSONObject(i2).getString("key"));
                }
            } catch (Exception e2) {
                FileLog.e((Throwable) e2, false);
                try {
                    JSONArray jSONArray3 = new JSONArray(str);
                    for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                        String string = jSONArray3.getJSONObject(i3).getString("phrase");
                        if (!TextUtils.isEmpty(string)) {
                            arrayList.add(string);
                        }
                    }
                } catch (Exception e3) {
                    FileLog.e((Throwable) e3, false);
                }
            }
        }
        return arrayList;
    }

    public static ArrayList<SearchEngine> getSearchEngines() {
        if (searchEngines == null) {
            searchEngines = new ArrayList<>();
            int i = 1;
            while (true) {
                String nullable = nullable(LocaleController.getString("SearchEngine" + i + "Name"));
                if (nullable == null) {
                    break;
                }
                searchEngines.add(new SearchEngine(nullable, nullable(LocaleController.getString("SearchEngine" + i + "SearchURL")), nullable(LocaleController.getString("SearchEngine" + i + "AutocompleteURL")), nullable(LocaleController.getString("SearchEngine" + i + "PrivacyPolicyURL"))));
                i++;
            }
        }
        return searchEngines;
    }

    private static String nullable(String str) {
        if (str == null || str.startsWith("LOC_ERR") || "reserved".equals(str)) {
            return null;
        }
        return str;
    }

    public static SearchEngine getCurrent() {
        return getSearchEngines().get(Utilities.clamp(SharedConfig.searchEngineType, r0.size() - 1, 0));
    }
}
