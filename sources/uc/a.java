package uc;

import w7.s8;
public final class a {
    public static final String[] f43661o = {"34", "37"};
    public static final String[] f43662p = {"60", "62", "64", "65"};
    public static final String[] f43663q = {"35"};
    public static final String[] f43664r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f43665s = {"4"};
    public static final String[] f43666t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f43667a;
    public final String f43668b;
    public final Integer f43669c;
    public final Integer d;
    public final String e;
    public final String f43670f;
    public final String f43671g;
    public final String h;
    public final String f43672i;
    public final String f43673j;
    public final String f43674k;
    public String f43675l;
    public String f43676m;
    public final String f43677n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f43667a = s8.e(replaceAll);
        this.f43669c = num;
        this.d = num2;
        this.f43668b = s8.e(str2);
        this.e = s8.e(str3);
        this.f43670f = s8.e(str4);
        this.f43671g = s8.e(str5);
        this.h = s8.e(str6);
        this.f43672i = s8.e(str7);
        this.f43673j = s8.e(str8);
        this.f43674k = s8.e(str9);
        this.f43676m = s8.a(str10) == null ? a() : str10;
        if (s8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f43675l = str16;
        s8.e(str12);
        s8.b(str13);
        s8.e(str14);
        this.f43677n = s8.e(str15);
    }

    public final String a() {
        String str;
        if (s8.d(this.f43676m)) {
            String str2 = this.f43667a;
            if (!s8.d(str2)) {
                if (s8.c(str2, f43661o)) {
                    str = "American Express";
                } else if (s8.c(str2, f43662p)) {
                    str = "Discover";
                } else if (s8.c(str2, f43663q)) {
                    str = "JCB";
                } else if (s8.c(str2, f43664r)) {
                    str = "Diners Club";
                } else if (s8.c(str2, f43665s)) {
                    str = "Visa";
                } else if (s8.c(str2, f43666t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f43676m = str;
            }
        }
        return this.f43676m;
    }

    public final String b() {
        if (!s8.d(this.f43675l)) {
            return this.f43675l;
        }
        String str = this.f43667a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f43675l = substring;
            return substring;
        }
        return null;
    }
}
