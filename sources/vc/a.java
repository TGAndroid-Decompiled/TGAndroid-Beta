package vc;

import w7.z8;
public final class a {
    public static final String[] f49606o = {"34", "37"};
    public static final String[] f49607p = {"60", "62", "64", "65"};
    public static final String[] f49608q = {"35"};
    public static final String[] f49609r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f49610s = {"4"};
    public static final String[] f49611t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f49612a;
    public final String f49613b;
    public final Integer f49614c;
    public final Integer d;
    public final String f49615e;
    public final String f49616f;
    public final String f49617g;
    public final String h;
    public final String f49618i;
    public final String f49619j;
    public final String f49620k;
    public String f49621l;
    public String f49622m;
    public final String f49623n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f49612a = z8.e(replaceAll);
        this.f49614c = num;
        this.d = num2;
        this.f49613b = z8.e(str2);
        this.f49615e = z8.e(str3);
        this.f49616f = z8.e(str4);
        this.f49617g = z8.e(str5);
        this.h = z8.e(str6);
        this.f49618i = z8.e(str7);
        this.f49619j = z8.e(str8);
        this.f49620k = z8.e(str9);
        this.f49622m = z8.a(str10) == null ? a() : str10;
        if (z8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f49621l = str16;
        z8.e(str12);
        z8.b(str13);
        z8.e(str14);
        this.f49623n = z8.e(str15);
    }

    public final String a() {
        String str;
        if (z8.d(this.f49622m)) {
            String str2 = this.f49612a;
            if (!z8.d(str2)) {
                if (z8.c(str2, f49606o)) {
                    str = "American Express";
                } else if (z8.c(str2, f49607p)) {
                    str = "Discover";
                } else if (z8.c(str2, f49608q)) {
                    str = "JCB";
                } else if (z8.c(str2, f49609r)) {
                    str = "Diners Club";
                } else if (z8.c(str2, f49610s)) {
                    str = "Visa";
                } else if (z8.c(str2, f49611t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f49622m = str;
            }
        }
        return this.f49622m;
    }

    public final String b() {
        if (!z8.d(this.f49621l)) {
            return this.f49621l;
        }
        String str = this.f49612a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f49621l = substring;
            return substring;
        }
        return null;
    }
}
