package uc;

import c8.qd;
public final class a {
    public static final String[] f56505o = {"34", "37"};
    public static final String[] f56506p = {"60", "62", "64", "65"};
    public static final String[] f56507q = {"35"};
    public static final String[] f56508r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f56509s = {"4"};
    public static final String[] f56510t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f56511a;
    public final String f56512b;
    public final Integer f56513c;
    public final Integer d;
    public final String f56514e;
    public final String f56515f;
    public final String f56516g;
    public final String h;
    public final String f56517i;
    public final String f56518j;
    public final String f56519k;
    public String f56520l;
    public String f56521m;
    public final String f56522n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f56511a = qd.e(replaceAll);
        this.f56513c = num;
        this.d = num2;
        this.f56512b = qd.e(str2);
        this.f56514e = qd.e(str3);
        this.f56515f = qd.e(str4);
        this.f56516g = qd.e(str5);
        this.h = qd.e(str6);
        this.f56517i = qd.e(str7);
        this.f56518j = qd.e(str8);
        this.f56519k = qd.e(str9);
        this.f56521m = qd.a(str10) == null ? a() : str10;
        if (qd.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f56520l = str16;
        qd.e(str12);
        qd.b(str13);
        qd.e(str14);
        this.f56522n = qd.e(str15);
    }

    public final String a() {
        String str;
        if (qd.d(this.f56521m)) {
            String str2 = this.f56511a;
            if (!qd.d(str2)) {
                if (qd.c(str2, f56505o)) {
                    str = "American Express";
                } else if (qd.c(str2, f56506p)) {
                    str = "Discover";
                } else if (qd.c(str2, f56507q)) {
                    str = "JCB";
                } else if (qd.c(str2, f56508r)) {
                    str = "Diners Club";
                } else if (qd.c(str2, f56509s)) {
                    str = "Visa";
                } else if (qd.c(str2, f56510t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f56521m = str;
            }
        }
        return this.f56521m;
    }

    public final String b() {
        if (!qd.d(this.f56520l)) {
            return this.f56520l;
        }
        String str = this.f56511a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f56520l = substring;
            return substring;
        }
        return null;
    }
}
