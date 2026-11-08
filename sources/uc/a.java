package uc;

import c8.qd;
public final class a {
    public static final String[] f56494o = {"34", "37"};
    public static final String[] f56495p = {"60", "62", "64", "65"};
    public static final String[] f56496q = {"35"};
    public static final String[] f56497r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f56498s = {"4"};
    public static final String[] f56499t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f56500a;
    public final String f56501b;
    public final Integer f56502c;
    public final Integer d;
    public final String f56503e;
    public final String f56504f;
    public final String f56505g;
    public final String h;
    public final String f56506i;
    public final String f56507j;
    public final String f56508k;
    public String f56509l;
    public String f56510m;
    public final String f56511n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f56500a = qd.e(replaceAll);
        this.f56502c = num;
        this.d = num2;
        this.f56501b = qd.e(str2);
        this.f56503e = qd.e(str3);
        this.f56504f = qd.e(str4);
        this.f56505g = qd.e(str5);
        this.h = qd.e(str6);
        this.f56506i = qd.e(str7);
        this.f56507j = qd.e(str8);
        this.f56508k = qd.e(str9);
        this.f56510m = qd.a(str10) == null ? a() : str10;
        if (qd.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f56509l = str16;
        qd.e(str12);
        qd.b(str13);
        qd.e(str14);
        this.f56511n = qd.e(str15);
    }

    public final String a() {
        String str;
        if (qd.d(this.f56510m)) {
            String str2 = this.f56500a;
            if (!qd.d(str2)) {
                if (qd.c(str2, f56494o)) {
                    str = "American Express";
                } else if (qd.c(str2, f56495p)) {
                    str = "Discover";
                } else if (qd.c(str2, f56496q)) {
                    str = "JCB";
                } else if (qd.c(str2, f56497r)) {
                    str = "Diners Club";
                } else if (qd.c(str2, f56498s)) {
                    str = "Visa";
                } else if (qd.c(str2, f56499t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f56510m = str;
            }
        }
        return this.f56510m;
    }

    public final String b() {
        if (!qd.d(this.f56509l)) {
            return this.f56509l;
        }
        String str = this.f56500a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f56509l = substring;
            return substring;
        }
        return null;
    }
}
