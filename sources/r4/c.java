package r4;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import d5.g0;
import java.util.Arrays;

public final class c implements h3.g {
    public static final c D = new c("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final a V;
    public final float A;
    public final int B;
    public final float C;

    public final CharSequence f46736a;

    public final Layout.Alignment f46737b;

    public final Layout.Alignment f46738c;
    public final Bitmap d;

    public final float f46739e;

    public final int f46740f;
    public final int h;

    public final float f46741n;

    public final int f46742r;

    public final float f46743s;
    public final float v;

    public final boolean f46744w;

    public final int f46745x;

    public final int f46746y;

    static {
        int i10 = g0.f4795a;
        E = Integer.toString(0, 36);
        F = Integer.toString(1, 36);
        G = Integer.toString(2, 36);
        H = Integer.toString(3, 36);
        I = Integer.toString(4, 36);
        J = Integer.toString(5, 36);
        K = Integer.toString(6, 36);
        L = Integer.toString(7, 36);
        M = Integer.toString(8, 36);
        N = Integer.toString(9, 36);
        O = Integer.toString(10, 36);
        P = Integer.toString(11, 36);
        Q = Integer.toString(12, 36);
        R = Integer.toString(13, 36);
        S = Integer.toString(14, 36);
        T = Integer.toString(15, 36);
        U = Integer.toString(16, 36);
        V = new a(0);
    }

    public c(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            d5.a.f(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f46736a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f46736a = charSequence.toString();
        } else {
            this.f46736a = null;
        }
        this.f46737b = alignment;
        this.f46738c = alignment2;
        this.d = bitmap;
        this.f46739e = f10;
        this.f46740f = i10;
        this.h = i11;
        this.f46741n = f11;
        this.f46742r = i12;
        this.f46743s = f13;
        this.v = f14;
        this.f46744w = z10;
        this.f46745x = i14;
        this.f46746y = i13;
        this.A = f12;
        this.B = i15;
        this.C = f15;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            Bitmap bitmap2 = cVar.d;
            if (TextUtils.equals(this.f46736a, cVar.f46736a) && this.f46737b == cVar.f46737b && this.f46738c == cVar.f46738c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f46739e == cVar.f46739e && this.f46740f == cVar.f46740f && this.h == cVar.h && this.f46741n == cVar.f46741n && this.f46742r == cVar.f46742r && this.f46743s == cVar.f46743s && this.v == cVar.v && this.f46744w == cVar.f46744w && this.f46745x == cVar.f46745x && this.f46746y == cVar.f46746y && this.A == cVar.A && this.B == cVar.B && this.C == cVar.C) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46736a, this.f46737b, this.f46738c, this.d, Float.valueOf(this.f46739e), Integer.valueOf(this.f46740f), Integer.valueOf(this.h), Float.valueOf(this.f46741n), Integer.valueOf(this.f46742r), Float.valueOf(this.f46743s), Float.valueOf(this.v), Boolean.valueOf(this.f46744w), Integer.valueOf(this.f46745x), Integer.valueOf(this.f46746y), Float.valueOf(this.A), Integer.valueOf(this.B), Float.valueOf(this.C)});
    }
}
