package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
public final class g1 {
    public static ArrayList d;
    public final String f51145a;
    public final String f51146b;
    public final String f51147c;

    public g1(String str, String str2, String str3) {
        this.f51145a = str;
        this.f51146b = str2;
        this.f51147c = str3;
    }

    public static g1 a() {
        ArrayList b10 = b();
        if (b10.isEmpty()) {
            return new g1("Google", "https://www.google.com/search?q=", "https://suggestqueries.google.com/complete/search?client=chrome&amp;q=");
        }
        return (g1) b10.get(Utilities.j(iz.f23398p0, b10.size() - 1, 0));
    }

    public static ArrayList b() {
        if (d == null) {
            d = new ArrayList();
            int i7 = 1;
            while (true) {
                String c10 = c(hd.N0("SearchEngine" + i7 + "Name"));
                if (c10 == null) {
                    break;
                }
                String c11 = c(hd.N0("SearchEngine" + i7 + "SearchURL"));
                String c12 = c(hd.N0("SearchEngine" + i7 + "AutocompleteURL"));
                c(hd.N0("SearchEngine" + i7 + "PrivacyPolicyURL"));
                d.add(new g1(c10, c11, c12));
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
