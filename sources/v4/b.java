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
    public static final sg.a W;
    public final float B;
    public final int C;
    public final float D;
    public final CharSequence f48928a;
    public final Layout.Alignment f48929b;
    public final Layout.Alignment f48930c;
    public final Bitmap d;
    public final float f48931e;
    public final int f48932f;
    public final int h;
    public final float f48933n;
    public final int f48934r;
    public final float f48935s;
    public final float v;
    public final boolean f48936w;
    public final int f48937x;
    public final int f48938y;

    static {
        int i10 = d0.f7237a;
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
        W = new sg.a(18);
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
            this.f48928a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f48928a = charSequence.toString();
        } else {
            this.f48928a = null;
        }
        this.f48929b = alignment;
        this.f48930c = alignment2;
        this.d = bitmap;
        this.f48931e = f10;
        this.f48932f = i10;
        this.h = i11;
        this.f48933n = f11;
        this.f48934r = i12;
        this.f48935s = f13;
        this.v = f14;
        this.f48936w = z4;
        this.f48937x = i14;
        this.f48938y = i13;
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
            if (TextUtils.equals(this.f48928a, bVar.f48928a) && this.f48929b == bVar.f48929b && this.f48930c == bVar.f48930c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f48931e == bVar.f48931e && this.f48932f == bVar.f48932f && this.h == bVar.h && this.f48933n == bVar.f48933n && this.f48934r == bVar.f48934r && this.f48935s == bVar.f48935s && this.v == bVar.v && this.f48936w == bVar.f48936w && this.f48937x == bVar.f48937x && this.f48938y == bVar.f48938y && this.B == bVar.B && this.C == bVar.C && this.D == bVar.D) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48928a, this.f48929b, this.f48930c, this.d, Float.valueOf(this.f48931e), Integer.valueOf(this.f48932f), Integer.valueOf(this.h), Float.valueOf(this.f48933n), Integer.valueOf(this.f48934r), Float.valueOf(this.f48935s), Float.valueOf(this.v), Boolean.valueOf(this.f48936w), Integer.valueOf(this.f48937x), Integer.valueOf(this.f48938y), Float.valueOf(this.B), Integer.valueOf(this.C), Float.valueOf(this.D)});
    }
}
