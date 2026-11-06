package uc;

import c8.pd;
public final class a {
    public static final String[] f56377o = {"34", "37"};
    public static final String[] f56378p = {"60", "62", "64", "65"};
    public static final String[] f56379q = {"35"};
    public static final String[] f56380r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f56381s = {"4"};
    public static final String[] f56382t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f56383a;
    public final String f56384b;
    public final Integer f56385c;
    public final Integer d;
    public final String f56386e;
    public final String f56387f;
    public final String f56388g;
    public final String h;
    public final String f56389i;
    public final String f56390j;
    public final String f56391k;
    public String f56392l;
    public String f56393m;
    public final String f56394n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f56383a = pd.e(replaceAll);
        this.f56385c = num;
        this.d = num2;
        this.f56384b = pd.e(str2);
        this.f56386e = pd.e(str3);
        this.f56387f = pd.e(str4);
        this.f56388g = pd.e(str5);
        this.h = pd.e(str6);
        this.f56389i = pd.e(str7);
        this.f56390j = pd.e(str8);
        this.f56391k = pd.e(str9);
        this.f56393m = pd.a(str10) == null ? a() : str10;
        if (pd.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f56392l = str16;
        pd.e(str12);
        pd.b(str13);
        pd.e(str14);
        this.f56394n = pd.e(str15);
    }

    public final String a() {
        String str;
        if (pd.d(this.f56393m)) {
            String str2 = this.f56383a;
            if (!pd.d(str2)) {
                if (pd.c(str2, f56377o)) {
                    str = "American Express";
                } else if (pd.c(str2, f56378p)) {
                    str = "Discover";
                } else if (pd.c(str2, f56379q)) {
                    str = "JCB";
                } else if (pd.c(str2, f56380r)) {
                    str = "Diners Club";
                } else if (pd.c(str2, f56381s)) {
                    str = "Visa";
                } else if (pd.c(str2, f56382t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f56393m = str;
            }
        }
        return this.f56393m;
    }

    public final String b() {
        if (!pd.d(this.f56392l)) {
            return this.f56392l;
        }
        String str = this.f56383a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f56392l = substring;
            return substring;
        }
        return null;
    }
}
