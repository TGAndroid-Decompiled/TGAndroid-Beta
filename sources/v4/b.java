package v4;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import h5.d0;
import java.util.Arrays;
public final class b implements j3.g {
    public static final b E = new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
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
    public static final String V;
    public static final s0.b W;
    public final float B;
    public final int C;
    public final float D;
    public final CharSequence f45598a;
    public final Layout.Alignment f45599b;
    public final Layout.Alignment f45600c;
    public final Bitmap d;
    public final float e;
    public final int f45601f;
    public final int h;
    public final float f45602n;
    public final int f45603r;
    public final float f45604s;
    public final float v;
    public final boolean f45605w;
    public final int f45606x;
    public final int f45607y;

    static {
        int i10 = d0.f6937a;
        F = Integer.toString(0, 36);
        G = Integer.toString(1, 36);
        H = Integer.toString(2, 36);
        I = Integer.toString(3, 36);
        J = Integer.toString(4, 36);
        K = Integer.toString(5, 36);
        L = Integer.toString(6, 36);
        M = Integer.toString(7, 36);
        N = Integer.toString(8, 36);
        O = Integer.toString(9, 36);
        P = Integer.toString(10, 36);
        Q = Integer.toString(11, 36);
        R = Integer.toString(12, 36);
        S = Integer.toString(13, 36);
        T = Integer.toString(14, 36);
        U = Integer.toString(15, 36);
        V = Integer.toString(16, 36);
        W = new s0.b(22);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z4, int i14, int i15, float f15) {
        boolean z10;
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            if (bitmap == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            h5.a.f(z10);
        }
        if (charSequence instanceof Spanned) {
            this.f45598a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f45598a = charSequence.toString();
        } else {
            this.f45598a = null;
        }
        this.f45599b = alignment;
        this.f45600c = alignment2;
        this.d = bitmap;
        this.e = f10;
        this.f45601f = i10;
        this.h = i11;
        this.f45602n = f11;
        this.f45603r = i12;
        this.f45604s = f13;
        this.v = f14;
        this.f45605w = z4;
        this.f45606x = i14;
        this.f45607y = i13;
        this.B = f12;
        this.C = i15;
        this.D = f15;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            Bitmap bitmap2 = bVar.d;
            if (TextUtils.equals(this.f45598a, bVar.f45598a) && this.f45599b == bVar.f45599b && this.f45600c == bVar.f45600c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == bVar.e && this.f45601f == bVar.f45601f && this.h == bVar.h && this.f45602n == bVar.f45602n && this.f45603r == bVar.f45603r && this.f45604s == bVar.f45604s && this.v == bVar.v && this.f45605w == bVar.f45605w && this.f45606x == bVar.f45606x && this.f45607y == bVar.f45607y && this.B == bVar.B && this.C == bVar.C && this.D == bVar.D) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45598a, this.f45599b, this.f45600c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f45601f), Integer.valueOf(this.h), Float.valueOf(this.f45602n), Integer.valueOf(this.f45603r), Float.valueOf(this.f45604s), Float.valueOf(this.v), Boolean.valueOf(this.f45605w), Integer.valueOf(this.f45606x), Integer.valueOf(this.f45607y), Float.valueOf(this.B), Integer.valueOf(this.C), Float.valueOf(this.D)});
    }
}
