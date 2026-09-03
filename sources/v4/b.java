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
    public final CharSequence f45662a;
    public final Layout.Alignment f45663b;
    public final Layout.Alignment f45664c;
    public final Bitmap d;
    public final float e;
    public final int f45665f;
    public final int h;
    public final float f45666n;
    public final int f45667r;
    public final float f45668s;
    public final float v;
    public final boolean f45669w;
    public final int f45670x;
    public final int f45671y;

    static {
        int i10 = d0.f6924a;
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
        W = new s0.b(23);
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
            this.f45662a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f45662a = charSequence.toString();
        } else {
            this.f45662a = null;
        }
        this.f45663b = alignment;
        this.f45664c = alignment2;
        this.d = bitmap;
        this.e = f10;
        this.f45665f = i10;
        this.h = i11;
        this.f45666n = f11;
        this.f45667r = i12;
        this.f45668s = f13;
        this.v = f14;
        this.f45669w = z4;
        this.f45670x = i14;
        this.f45671y = i13;
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
            if (TextUtils.equals(this.f45662a, bVar.f45662a) && this.f45663b == bVar.f45663b && this.f45664c == bVar.f45664c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == bVar.e && this.f45665f == bVar.f45665f && this.h == bVar.h && this.f45666n == bVar.f45666n && this.f45667r == bVar.f45667r && this.f45668s == bVar.f45668s && this.v == bVar.v && this.f45669w == bVar.f45669w && this.f45670x == bVar.f45670x && this.f45671y == bVar.f45671y && this.B == bVar.B && this.C == bVar.C && this.D == bVar.D) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45662a, this.f45663b, this.f45664c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f45665f), Integer.valueOf(this.h), Float.valueOf(this.f45666n), Integer.valueOf(this.f45667r), Float.valueOf(this.f45668s), Float.valueOf(this.v), Boolean.valueOf(this.f45669w), Integer.valueOf(this.f45670x), Integer.valueOf(this.f45671y), Float.valueOf(this.B), Integer.valueOf(this.C), Float.valueOf(this.D)});
    }
}
