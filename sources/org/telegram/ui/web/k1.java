package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

public final class k1 {
    public static ArrayList d;

    public final String f43889a;

    public final String f43890b;

    public final String f43891c;

    public k1(String str, String str2, String str3) {
        this.f43889a = str;
        this.f43890b = str2;
        this.f43891c = str3;
    }

    public static k1 a() {
        ArrayList arrayListB = b();
        return arrayListB.isEmpty() ? new k1("Google", "https://www.google.com/search?q=", "https://suggestqueries.google.com/complete/search?client=chrome&amp;q=") : (k1) arrayListB.get(Utilities.clamp(SharedConfig.searchEngineType, arrayListB.size() - 1, 0));
    }

    public static ArrayList b() {
        if (d == null) {
            d = new ArrayList();
            int i10 = 1;
            while (true) {
                String strC = c(LocaleController.getString("SearchEngine" + i10 + "Name"));
                if (strC == null) {
                    break;
                }
                String strC2 = c(LocaleController.getString("SearchEngine" + i10 + "SearchURL"));
                String strC3 = c(LocaleController.getString("SearchEngine" + i10 + "AutocompleteURL"));
                c(LocaleController.getString("SearchEngine" + i10 + "PrivacyPolicyURL"));
                d.add(new k1(strC, strC2, strC3));
                i10++;
            }
        }
        return d;
    }

    public static String c(String str) {
        if (str == null || str.startsWith("LOC_ERR") || "reserved".equals(str)) {
            return null;
        }
        return str;
    }
}
