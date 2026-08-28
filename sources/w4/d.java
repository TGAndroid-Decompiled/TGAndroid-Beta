package w4;

import android.graphics.Color;
import g7.r6;
public final class d {
    public final String f48752a;
    public final int f48753b;
    public final Integer f48754c;
    public final Integer d;
    public final float f48755e;
    public final boolean f48756f;
    public final boolean f48757g;
    public final boolean h;
    public final boolean f48758i;
    public final int f48759j;

    public d(String str, int i9, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i10) {
        this.f48752a = str;
        this.f48753b = i9;
        this.f48754c = num;
        this.d = num2;
        this.f48755e = f10;
        this.f48756f = z10;
        this.f48757g = z11;
        this.h = z12;
        this.f48758i = z13;
        this.f48759j = i10;
    }

    public static int a(String str) {
        boolean z10;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z10 = true;
                    break;
                default:
                    z10 = false;
                    break;
            }
            if (z10) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        ta.b.i("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e10) {
            d5.a.L("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static Integer c(String str) {
        long parseLong;
        boolean z10;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z10 = true;
            } else {
                z10 = false;
            }
            d5.a.f(z10);
            int a2 = r6.a(((parseLong >> 24) & 255) ^ 255);
            int a3 = r6.a((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(a2, r6.a(parseLong & 255), r6.a((parseLong >> 8) & 255), a3));
        } catch (IllegalArgumentException e10) {
            d5.a.L("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}
