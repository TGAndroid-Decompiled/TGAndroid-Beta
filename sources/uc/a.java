package uc;

import c8.qd;
public final class a {
    public static final String[] f56493o = {"34", "37"};
    public static final String[] f56494p = {"60", "62", "64", "65"};
    public static final String[] f56495q = {"35"};
    public static final String[] f56496r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f56497s = {"4"};
    public static final String[] f56498t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f56499a;
    public final String f56500b;
    public final Integer f56501c;
    public final Integer d;
    public final String f56502e;
    public final String f56503f;
    public final String f56504g;
    public final String h;
    public final String f56505i;
    public final String f56506j;
    public final String f56507k;
    public String f56508l;
    public String f56509m;
    public final String f56510n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f56499a = qd.e(replaceAll);
        this.f56501c = num;
        this.d = num2;
        this.f56500b = qd.e(str2);
        this.f56502e = qd.e(str3);
        this.f56503f = qd.e(str4);
        this.f56504g = qd.e(str5);
        this.h = qd.e(str6);
        this.f56505i = qd.e(str7);
        this.f56506j = qd.e(str8);
        this.f56507k = qd.e(str9);
        this.f56509m = qd.a(str10) == null ? a() : str10;
        if (qd.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f56508l = str16;
        qd.e(str12);
        qd.b(str13);
        qd.e(str14);
        this.f56510n = qd.e(str15);
    }

    public final String a() {
        String str;
        if (qd.d(this.f56509m)) {
            String str2 = this.f56499a;
            if (!qd.d(str2)) {
                if (qd.c(str2, f56493o)) {
                    str = "American Express";
                } else if (qd.c(str2, f56494p)) {
                    str = "Discover";
                } else if (qd.c(str2, f56495q)) {
                    str = "JCB";
                } else if (qd.c(str2, f56496r)) {
                    str = "Diners Club";
                } else if (qd.c(str2, f56497s)) {
                    str = "Visa";
                } else if (qd.c(str2, f56498t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f56509m = str;
            }
        }
        return this.f56509m;
    }

    public final String b() {
        if (!qd.d(this.f56508l)) {
            return this.f56508l;
        }
        String str = this.f56499a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f56508l = substring;
            return substring;
        }
        return null;
    }
}
