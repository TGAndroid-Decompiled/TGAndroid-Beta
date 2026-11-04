package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
public final class d1 {
    public static ArrayList d;
    public final String f50829a;
    public final String f50830b;
    public final String f50831c;

    public d1(String str, String str2, String str3) {
        this.f50829a = str;
        this.f50830b = str2;
        this.f50831c = str3;
    }

    public static d1 a() {
        ArrayList b10 = b();
        if (b10.isEmpty()) {
            return new d1("Google", "https://www.google.com/search?q=", "https://suggestqueries.google.com/complete/search?client=chrome&amp;q=");
        }
        return (d1) b10.get(Utilities.j(az.f21653p0, b10.size() - 1, 0));
    }

    public static ArrayList b() {
        if (d == null) {
            d = new ArrayList();
            int i3 = 1;
            while (true) {
                String c2 = c(bd.N0("SearchEngine" + i3 + "Name"));
                if (c2 == null) {
                    break;
                }
                String c10 = c(bd.N0("SearchEngine" + i3 + "SearchURL"));
                String c11 = c(bd.N0("SearchEngine" + i3 + "AutocompleteURL"));
                c(bd.N0("SearchEngine" + i3 + "PrivacyPolicyURL"));
                d.add(new d1(c2, c10, c11));
                i3++;
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
