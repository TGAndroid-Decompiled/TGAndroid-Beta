package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class k1 {
    public static ArrayList d;
    public final String f44088a;
    public final String f44089b;
    public final String f44090c;

    public k1(String str, String str2, String str3) {
        this.f44088a = str;
        this.f44089b = str2;
        this.f44090c = str3;
    }

    public static k1 a() {
        ArrayList b10 = b();
        if (b10.isEmpty()) {
            return new k1("Google", "https://www.google.com/search?q=", "https://suggestqueries.google.com/complete/search?client=chrome&amp;q=");
        }
        return (k1) b10.get(Utilities.clamp(SharedConfig.searchEngineType, b10.size() - 1, 0));
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
                String c6 = c(LocaleController.getString("SearchEngine" + i10 + "SearchURL"));
                String c10 = c(LocaleController.getString("SearchEngine" + i10 + "AutocompleteURL"));
                c(LocaleController.getString("SearchEngine" + i10 + "PrivacyPolicyURL"));
                d.add(new k1(c3, c6, c10));
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
