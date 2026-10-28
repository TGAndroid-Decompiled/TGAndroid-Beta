package xc;

import a8.t0;
public final class a {
    public static final String[] f51768o = {"34", "37"};
    public static final String[] f51769p = {"60", "62", "64", "65"};
    public static final String[] f51770q = {"35"};
    public static final String[] f51771r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f51772s = {"4"};
    public static final String[] f51773t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f51774a;
    public final String f51775b;
    public final Integer f51776c;
    public final Integer d;
    public final String e;
    public final String f51777f;
    public final String f51778g;
    public final String h;
    public final String f51779i;
    public final String f51780j;
    public final String f51781k;
    public String f51782l;
    public String f51783m;
    public final String f51784n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.f51774a = t0.e(str == null ? null : str.trim().replaceAll("\\s+|-", ""));
        this.f51776c = num;
        this.d = num2;
        this.f51775b = t0.e(str2);
        this.e = t0.e(str3);
        this.f51777f = t0.e(str4);
        this.f51778g = t0.e(str5);
        this.h = t0.e(str6);
        this.f51779i = t0.e(str7);
        this.f51780j = t0.e(str8);
        this.f51781k = t0.e(str9);
        this.f51783m = t0.a(str10) == null ? a() : str10;
        this.f51782l = t0.e(str11) == null ? b() : str11;
        t0.e(str12);
        t0.b(str13);
        t0.e(str14);
        this.f51784n = t0.e(str15);
    }

    public final String a() {
        String str;
        if (t0.d(this.f51783m)) {
            String str2 = this.f51774a;
            if (!t0.d(str2)) {
                if (t0.c(str2, f51768o)) {
                    str = "American Express";
                } else if (t0.c(str2, f51769p)) {
                    str = "Discover";
                } else if (t0.c(str2, f51770q)) {
                    str = "JCB";
                } else if (t0.c(str2, f51771r)) {
                    str = "Diners Club";
                } else if (t0.c(str2, f51772s)) {
                    str = "Visa";
                } else if (t0.c(str2, f51773t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f51783m = str;
            }
        }
        return this.f51783m;
    }

    public final String b() {
        if (!t0.d(this.f51782l)) {
            return this.f51782l;
        }
        String str = this.f51774a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f51782l = substring;
            return substring;
        }
        return null;
    }
}
