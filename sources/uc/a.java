package uc;

import c8.qd;
public final class a {
    public static final String[] f56401o = {"34", "37"};
    public static final String[] f56402p = {"60", "62", "64", "65"};
    public static final String[] f56403q = {"35"};
    public static final String[] f56404r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f56405s = {"4"};
    public static final String[] f56406t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f56407a;
    public final String f56408b;
    public final Integer f56409c;
    public final Integer d;
    public final String f56410e;
    public final String f56411f;
    public final String f56412g;
    public final String h;
    public final String f56413i;
    public final String f56414j;
    public final String f56415k;
    public String f56416l;
    public String f56417m;
    public final String f56418n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f56407a = qd.e(replaceAll);
        this.f56409c = num;
        this.d = num2;
        this.f56408b = qd.e(str2);
        this.f56410e = qd.e(str3);
        this.f56411f = qd.e(str4);
        this.f56412g = qd.e(str5);
        this.h = qd.e(str6);
        this.f56413i = qd.e(str7);
        this.f56414j = qd.e(str8);
        this.f56415k = qd.e(str9);
        this.f56417m = qd.a(str10) == null ? a() : str10;
        if (qd.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f56416l = str16;
        qd.e(str12);
        qd.b(str13);
        qd.e(str14);
        this.f56418n = qd.e(str15);
    }

    public final String a() {
        String str;
        if (qd.d(this.f56417m)) {
            String str2 = this.f56407a;
            if (!qd.d(str2)) {
                if (qd.c(str2, f56401o)) {
                    str = "American Express";
                } else if (qd.c(str2, f56402p)) {
                    str = "Discover";
                } else if (qd.c(str2, f56403q)) {
                    str = "JCB";
                } else if (qd.c(str2, f56404r)) {
                    str = "Diners Club";
                } else if (qd.c(str2, f56405s)) {
                    str = "Visa";
                } else if (qd.c(str2, f56406t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f56417m = str;
            }
        }
        return this.f56417m;
    }

    public final String b() {
        if (!qd.d(this.f56416l)) {
            return this.f56416l;
        }
        String str = this.f56407a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f56416l = substring;
            return substring;
        }
        return null;
    }
}
