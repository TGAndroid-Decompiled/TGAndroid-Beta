package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
public final class e1 {
    public static ArrayList d;
    public final String f53079a;
    public final String f53080b;
    public final String f53081c;

    public e1(String str, String str2, String str3) {
        this.f53079a = str;
        this.f53080b = str2;
        this.f53081c = str3;
    }

    public static e1 a() {
        ArrayList b10 = b();
        if (b10.isEmpty()) {
            return new e1("Google", "https://www.google.com/search?q=", "https://suggestqueries.google.com/complete/search?client=chrome&amp;q=");
        }
        return (e1) b10.get(Utilities.j(bz.f23186p0, b10.size() - 1, 0));
    }

    public static ArrayList b() {
        if (d == null) {
            d = new ArrayList();
            int i7 = 1;
            while (true) {
                String c10 = c(gd.N0("SearchEngine" + i7 + "Name"));
                if (c10 == null) {
                    break;
                }
                String c11 = c(gd.N0("SearchEngine" + i7 + "SearchURL"));
                String c12 = c(gd.N0("SearchEngine" + i7 + "AutocompleteURL"));
                c(gd.N0("SearchEngine" + i7 + "PrivacyPolicyURL"));
                d.add(new e1(c10, c11, c12));
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
