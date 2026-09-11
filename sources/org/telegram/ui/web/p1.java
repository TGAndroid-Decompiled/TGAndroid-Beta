package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class p1 {
    public static ArrayList d;
    public final String f42208a;
    public final String f42209b;
    public final String f42210c;

    public p1(String str, String str2, String str3) {
        this.f42208a = str;
        this.f42209b = str2;
        this.f42210c = str3;
    }

    public static p1 a() {
        ArrayList b10 = b();
        if (b10.isEmpty()) {
            return new p1("Google", "https://www.google.com/search?q=", "https://suggestqueries.google.com/complete/search?client=chrome&amp;q=");
        }
        return (p1) b10.get(Utilities.clamp(SharedConfig.searchEngineType, b10.size() - 1, 0));
    }

    public static ArrayList b() {
        if (d == null) {
            d = new ArrayList();
            int i10 = 1;
            while (true) {
                String c10 = c(LocaleController.getString("SearchEngine" + i10 + "Name"));
                if (c10 == null) {
                    break;
                }
                String c11 = c(LocaleController.getString("SearchEngine" + i10 + "SearchURL"));
                String c12 = c(LocaleController.getString("SearchEngine" + i10 + "AutocompleteURL"));
                c(LocaleController.getString("SearchEngine" + i10 + "PrivacyPolicyURL"));
                d.add(new p1(c10, c11, c12));
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
