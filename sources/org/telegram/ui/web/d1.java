package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cz;
import org.telegram.messenger.hd;
public final class d1 {
    public static ArrayList d;
    public final String f53081a;
    public final String f53082b;
    public final String f53083c;

    public d1(String str, String str2, String str3) {
        this.f53081a = str;
        this.f53082b = str2;
        this.f53083c = str3;
    }

    public static d1 a() {
        ArrayList b10 = b();
        if (b10.isEmpty()) {
            return new d1("Google", "https://www.google.com/search?q=", "https://suggestqueries.google.com/complete/search?client=chrome&amp;q=");
        }
        return (d1) b10.get(Utilities.j(cz.f23395p0, b10.size() - 1, 0));
    }

    public static ArrayList b() {
        if (d == null) {
            d = new ArrayList();
            int i7 = 1;
            while (true) {
                String c10 = c(hd.O0("SearchEngine" + i7 + "Name"));
                if (c10 == null) {
                    break;
                }
                String c11 = c(hd.O0("SearchEngine" + i7 + "SearchURL"));
                String c12 = c(hd.O0("SearchEngine" + i7 + "AutocompleteURL"));
                c(hd.O0("SearchEngine" + i7 + "PrivacyPolicyURL"));
                d.add(new d1(c10, c11, c12));
                i7++;
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
