package uc;

import c8.qd;
public final class a {
    public static final String[] f56506o = {"34", "37"};
    public static final String[] f56507p = {"60", "62", "64", "65"};
    public static final String[] f56508q = {"35"};
    public static final String[] f56509r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f56510s = {"4"};
    public static final String[] f56511t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f56512a;
    public final String f56513b;
    public final Integer f56514c;
    public final Integer d;
    public final String f56515e;
    public final String f56516f;
    public final String f56517g;
    public final String h;
    public final String f56518i;
    public final String f56519j;
    public final String f56520k;
    public String f56521l;
    public String f56522m;
    public final String f56523n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f56512a = qd.e(replaceAll);
        this.f56514c = num;
        this.d = num2;
        this.f56513b = qd.e(str2);
        this.f56515e = qd.e(str3);
        this.f56516f = qd.e(str4);
        this.f56517g = qd.e(str5);
        this.h = qd.e(str6);
        this.f56518i = qd.e(str7);
        this.f56519j = qd.e(str8);
        this.f56520k = qd.e(str9);
        this.f56522m = qd.a(str10) == null ? a() : str10;
        if (qd.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f56521l = str16;
        qd.e(str12);
        qd.b(str13);
        qd.e(str14);
        this.f56523n = qd.e(str15);
    }

    public final String a() {
        String str;
        if (qd.d(this.f56522m)) {
            String str2 = this.f56512a;
            if (!qd.d(str2)) {
                if (qd.c(str2, f56506o)) {
                    str = "American Express";
                } else if (qd.c(str2, f56507p)) {
                    str = "Discover";
                } else if (qd.c(str2, f56508q)) {
                    str = "JCB";
                } else if (qd.c(str2, f56509r)) {
                    str = "Diners Club";
                } else if (qd.c(str2, f56510s)) {
                    str = "Visa";
                } else if (qd.c(str2, f56511t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f56522m = str;
            }
        }
        return this.f56522m;
    }

    public final String b() {
        if (!qd.d(this.f56521l)) {
            return this.f56521l;
        }
        String str = this.f56512a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f56521l = substring;
            return substring;
        }
        return null;
    }
}
