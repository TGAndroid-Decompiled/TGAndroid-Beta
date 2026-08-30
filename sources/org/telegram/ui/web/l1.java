package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class l1 {
    public static ArrayList d;
    public final String f39570a;
    public final String f39571b;
    public final String f39572c;

    public l1(String str, String str2, String str3) {
        this.f39570a = str;
        this.f39571b = str2;
        this.f39572c = str3;
    }

    public static l1 a() {
        ArrayList b10 = b();
        if (b10.isEmpty()) {
            return new l1("Google", "https://www.google.com/search?q=", "https://suggestqueries.google.com/complete/search?client=chrome&amp;q=");
        }
        return (l1) b10.get(Utilities.clamp(SharedConfig.searchEngineType, b10.size() - 1, 0));
    }

    public static ArrayList b() {
        if (d == null) {
            d = new ArrayList();
            int i10 = 1;
            while (true) {
                String c3 = c(LocaleController.getString("SearchEngine" + i10 + "Name"));
                if (c3 == null) {
                    break;
                }
                String c10 = c(LocaleController.getString("SearchEngine" + i10 + "SearchURL"));
                String c11 = c(LocaleController.getString("SearchEngine" + i10 + "AutocompleteURL"));
                c(LocaleController.getString("SearchEngine" + i10 + "PrivacyPolicyURL"));
                d.add(new l1(c3, c10, c11));
                i10++;
            }
        }
        return d;
    }

    public static String c(String str) {
        if (str != null && !str.startsWith("LOC_ERR") && !"reserved".equals(str)) {
            return str;
        }
        return null;
    }
}
