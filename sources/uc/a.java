package uc;

import w7.s8;
public final class a {
    public static final String[] f43609o = {"34", "37"};
    public static final String[] f43610p = {"60", "62", "64", "65"};
    public static final String[] f43611q = {"35"};
    public static final String[] f43612r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f43613s = {"4"};
    public static final String[] f43614t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f43615a;
    public final String f43616b;
    public final Integer f43617c;
    public final Integer d;
    public final String e;
    public final String f43618f;
    public final String f43619g;
    public final String h;
    public final String f43620i;
    public final String f43621j;
    public final String f43622k;
    public String f43623l;
    public String f43624m;
    public final String f43625n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f43615a = s8.e(replaceAll);
        this.f43617c = num;
        this.d = num2;
        this.f43616b = s8.e(str2);
        this.e = s8.e(str3);
        this.f43618f = s8.e(str4);
        this.f43619g = s8.e(str5);
        this.h = s8.e(str6);
        this.f43620i = s8.e(str7);
        this.f43621j = s8.e(str8);
        this.f43622k = s8.e(str9);
        this.f43624m = s8.a(str10) == null ? a() : str10;
        if (s8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f43623l = str16;
        s8.e(str12);
        s8.b(str13);
        s8.e(str14);
        this.f43625n = s8.e(str15);
    }

    public final String a() {
        String str;
        if (s8.d(this.f43624m)) {
            String str2 = this.f43615a;
            if (!s8.d(str2)) {
                if (s8.c(str2, f43609o)) {
                    str = "American Express";
                } else if (s8.c(str2, f43610p)) {
                    str = "Discover";
                } else if (s8.c(str2, f43611q)) {
                    str = "JCB";
                } else if (s8.c(str2, f43612r)) {
                    str = "Diners Club";
                } else if (s8.c(str2, f43613s)) {
                    str = "Visa";
                } else if (s8.c(str2, f43614t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f43624m = str;
            }
        }
        return this.f43624m;
    }

    public final String b() {
        if (!s8.d(this.f43623l)) {
            return this.f43623l;
        }
        String str = this.f43615a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f43623l = substring;
            return substring;
        }
        return null;
    }
}
