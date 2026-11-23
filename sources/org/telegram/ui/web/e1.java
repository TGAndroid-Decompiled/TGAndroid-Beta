package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cz;
import org.telegram.messenger.hd;
public final class e1 {
    public static ArrayList d;
    public final String f53126a;
    public final String f53127b;
    public final String f53128c;

    public e1(String str, String str2, String str3) {
        this.f53126a = str;
        this.f53127b = str2;
        this.f53128c = str3;
    }

    public static e1 a() {
        ArrayList b10 = b();
        if (b10.isEmpty()) {
            return new e1("Google", "https://www.google.com/search?q=", "https://suggestqueries.google.com/complete/search?client=chrome&amp;q=");
        }
        return (e1) b10.get(Utilities.j(cz.f23431p0, b10.size() - 1, 0));
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
