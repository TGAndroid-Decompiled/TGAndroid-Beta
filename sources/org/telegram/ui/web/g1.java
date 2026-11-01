package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.messenger.uz;
public final class g1 {
    public static ArrayList d;
    public final String f42847a;
    public final String f42848b;
    public final String f42849c;

    public g1(String str, String str2, String str3) {
        this.f42847a = str;
        this.f42848b = str2;
        this.f42849c = str3;
    }

    public static g1 a() {
        ArrayList b10 = b();
        if (b10.isEmpty()) {
            return new g1("Google", "https://www.google.com/search?q=", "https://suggestqueries.google.com/complete/search?client=chrome&amp;q=");
        }
        return (g1) b10.get(Utilities.j(uz.f18541p0, b10.size() - 1, 0));
    }

    public static ArrayList b() {
        if (d == null) {
            d = new ArrayList();
            int i10 = 1;
            while (true) {
                String c10 = c(dd.M0("SearchEngine" + i10 + "Name"));
                if (c10 == null) {
                    break;
                }
                String c11 = c(dd.M0("SearchEngine" + i10 + "SearchURL"));
                String c12 = c(dd.M0("SearchEngine" + i10 + "AutocompleteURL"));
                c(dd.M0("SearchEngine" + i10 + "PrivacyPolicyURL"));
                d.add(new g1(c10, c11, c12));
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
