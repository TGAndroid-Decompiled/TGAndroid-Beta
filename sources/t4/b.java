package t4;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import f5.d0;
import java.util.Arrays;
public final class b implements j3.g {
    public static final b D = new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
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
    public static final sg.j V;
    public final float A;
    public final int B;
    public final float C;
    public final CharSequence f48128a;
    public final Layout.Alignment f48129b;
    public final Layout.Alignment f48130c;
    public final Bitmap d;
    public final float f48131e;
    public final int f48132f;
    public final int h;
    public final float f48133n;
    public final int f48134r;
    public final float f48135s;
    public final float v;
    public final boolean f48136w;
    public final int f48137x;
    public final int f48138y;

    static {
        int i10 = d0.f6579a;
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
        V = new sg.j(4);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f9, int i10, int i11, float f10, int i12, int i13, float f11, float f12, float f13, boolean z10, int i14, int i15, float f14) {
        boolean z11;
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            if (bitmap == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            f5.a.f(z11);
        }
        if (charSequence instanceof Spanned) {
            this.f48128a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f48128a = charSequence.toString();
        } else {
            this.f48128a = null;
        }
        this.f48129b = alignment;
        this.f48130c = alignment2;
        this.d = bitmap;
        this.f48131e = f9;
        this.f48132f = i10;
        this.h = i11;
        this.f48133n = f10;
        this.f48134r = i12;
        this.f48135s = f12;
        this.v = f13;
        this.f48136w = z10;
        this.f48137x = i14;
        this.f48138y = i13;
        this.A = f11;
        this.B = i15;
        this.C = f14;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            Bitmap bitmap2 = bVar.d;
            if (TextUtils.equals(this.f48128a, bVar.f48128a) && this.f48129b == bVar.f48129b && this.f48130c == bVar.f48130c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f48131e == bVar.f48131e && this.f48132f == bVar.f48132f && this.h == bVar.h && this.f48133n == bVar.f48133n && this.f48134r == bVar.f48134r && this.f48135s == bVar.f48135s && this.v == bVar.v && this.f48136w == bVar.f48136w && this.f48137x == bVar.f48137x && this.f48138y == bVar.f48138y && this.A == bVar.A && this.B == bVar.B && this.C == bVar.C) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48128a, this.f48129b, this.f48130c, this.d, Float.valueOf(this.f48131e), Integer.valueOf(this.f48132f), Integer.valueOf(this.h), Float.valueOf(this.f48133n), Integer.valueOf(this.f48134r), Float.valueOf(this.f48135s), Float.valueOf(this.v), Boolean.valueOf(this.f48136w), Integer.valueOf(this.f48137x), Integer.valueOf(this.f48138y), Float.valueOf(this.A), Integer.valueOf(this.B), Float.valueOf(this.C)});
    }
}
