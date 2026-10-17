package wc;

import w7.p9;
public final class a {
    public static final String[] f48922o = {"34", "37"};
    public static final String[] f48923p = {"60", "62", "64", "65"};
    public static final String[] f48924q = {"35"};
    public static final String[] f48925r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f48926s = {"4"};
    public static final String[] f48927t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f48928a;
    public final String f48929b;
    public final Integer f48930c;
    public final Integer d;
    public final String e;
    public final String f48931f;
    public final String f48932g;
    public final String h;
    public final String f48933i;
    public final String f48934j;
    public final String f48935k;
    public String f48936l;
    public String f48937m;
    public final String f48938n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.f48928a = p9.e(str == null ? null : str.trim().replaceAll("\\s+|-", ""));
        this.f48930c = num;
        this.d = num2;
        this.f48929b = p9.e(str2);
        this.e = p9.e(str3);
        this.f48931f = p9.e(str4);
        this.f48932g = p9.e(str5);
        this.h = p9.e(str6);
        this.f48933i = p9.e(str7);
        this.f48934j = p9.e(str8);
        this.f48935k = p9.e(str9);
        this.f48937m = p9.a(str10) == null ? a() : str10;
        this.f48936l = p9.e(str11) == null ? b() : str11;
        p9.e(str12);
        p9.b(str13);
        p9.e(str14);
        this.f48938n = p9.e(str15);
    }

    public final String a() {
        String str;
        if (p9.d(this.f48937m)) {
            String str2 = this.f48928a;
            if (!p9.d(str2)) {
                if (p9.c(str2, f48922o)) {
                    str = "American Express";
                } else if (p9.c(str2, f48923p)) {
                    str = "Discover";
                } else if (p9.c(str2, f48924q)) {
                    str = "JCB";
                } else if (p9.c(str2, f48925r)) {
                    str = "Diners Club";
                } else if (p9.c(str2, f48926s)) {
                    str = "Visa";
                } else if (p9.c(str2, f48927t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f48937m = str;
            }
        }
        return this.f48937m;
    }

    public final String b() {
        if (!p9.d(this.f48936l)) {
            return this.f48936l;
        }
        String str = this.f48928a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f48936l = substring;
            return substring;
        }
        return null;
    }
}
