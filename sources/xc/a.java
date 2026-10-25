package xc;

import a8.t0;
public final class a {
    public static final String[] f51707o = {"34", "37"};
    public static final String[] f51708p = {"60", "62", "64", "65"};
    public static final String[] f51709q = {"35"};
    public static final String[] f51710r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f51711s = {"4"};
    public static final String[] f51712t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f51713a;
    public final String f51714b;
    public final Integer f51715c;
    public final Integer d;
    public final String e;
    public final String f51716f;
    public final String f51717g;
    public final String h;
    public final String f51718i;
    public final String f51719j;
    public final String f51720k;
    public String f51721l;
    public String f51722m;
    public final String f51723n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.f51713a = t0.e(str == null ? null : str.trim().replaceAll("\\s+|-", ""));
        this.f51715c = num;
        this.d = num2;
        this.f51714b = t0.e(str2);
        this.e = t0.e(str3);
        this.f51716f = t0.e(str4);
        this.f51717g = t0.e(str5);
        this.h = t0.e(str6);
        this.f51718i = t0.e(str7);
        this.f51719j = t0.e(str8);
        this.f51720k = t0.e(str9);
        this.f51722m = t0.a(str10) == null ? a() : str10;
        this.f51721l = t0.e(str11) == null ? b() : str11;
        t0.e(str12);
        t0.b(str13);
        t0.e(str14);
        this.f51723n = t0.e(str15);
    }

    public final String a() {
        String str;
        if (t0.d(this.f51722m)) {
            String str2 = this.f51713a;
            if (!t0.d(str2)) {
                if (t0.c(str2, f51707o)) {
                    str = "American Express";
                } else if (t0.c(str2, f51708p)) {
                    str = "Discover";
                } else if (t0.c(str2, f51709q)) {
                    str = "JCB";
                } else if (t0.c(str2, f51710r)) {
                    str = "Diners Club";
                } else if (t0.c(str2, f51711s)) {
                    str = "Visa";
                } else if (t0.c(str2, f51712t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f51722m = str;
            }
        }
        return this.f51722m;
    }

    public final String b() {
        if (!t0.d(this.f51721l)) {
            return this.f51721l;
        }
        String str = this.f51713a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f51721l = substring;
            return substring;
        }
        return null;
    }
}
