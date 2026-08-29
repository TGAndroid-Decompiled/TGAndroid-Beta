package y4;

import a4.w;
import android.graphics.Color;
import i7.p7;
public final class d {
    public final String f50485a;
    public final int f50486b;
    public final Integer f50487c;
    public final Integer d;
    public final float f50488e;
    public final boolean f50489f;
    public final boolean f50490g;
    public final boolean h;
    public final boolean f50491i;
    public final int f50492j;

    public d(String str, int i10, Integer num, Integer num2, float f9, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f50485a = str;
        this.f50486b = i10;
        this.f50487c = num;
        this.d = num2;
        this.f50488e = f9;
        this.f50489f = z10;
        this.f50490g = z11;
        this.h = z12;
        this.f50491i = z13;
        this.f50492j = i11;
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
        w.v("Ignoring unknown alignment: ", str, "SsaStyle");
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
            f5.a.L("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
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
            f5.a.f(z10);
            int a2 = p7.a(((parseLong >> 24) & 255) ^ 255);
            int a10 = p7.a((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(a2, p7.a(parseLong & 255), p7.a((parseLong >> 8) & 255), a10));
        } catch (IllegalArgumentException e10) {
            f5.a.L("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}
