package r4;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import d5.f0;
import java.util.Arrays;
import org.telegram.ui.fk0;
public final class b implements h3.g {
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
    public static final fk0 V;
    public final float A;
    public final int B;
    public final float C;
    public final CharSequence f47045a;
    public final Layout.Alignment f47046b;
    public final Layout.Alignment f47047c;
    public final Bitmap d;
    public final float f47048e;
    public final int f47049f;
    public final int h;
    public final float f47050n;
    public final int f47051r;
    public final float f47052s;
    public final float v;
    public final boolean f47053w;
    public final int f47054x;
    public final int f47055y;

    static {
        int i9 = f0.f4349a;
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
        V = new fk0(26);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i9, int i10, float f11, int i11, int i12, float f12, float f13, float f14, boolean z10, int i13, int i14, float f15) {
        boolean z11;
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            if (bitmap == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            d5.a.f(z11);
        }
        if (charSequence instanceof Spanned) {
            this.f47045a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f47045a = charSequence.toString();
        } else {
            this.f47045a = null;
        }
        this.f47046b = alignment;
        this.f47047c = alignment2;
        this.d = bitmap;
        this.f47048e = f10;
        this.f47049f = i9;
        this.h = i10;
        this.f47050n = f11;
        this.f47051r = i11;
        this.f47052s = f13;
        this.v = f14;
        this.f47053w = z10;
        this.f47054x = i13;
        this.f47055y = i12;
        this.A = f12;
        this.B = i14;
        this.C = f15;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            Bitmap bitmap2 = bVar.d;
            if (TextUtils.equals(this.f47045a, bVar.f47045a) && this.f47046b == bVar.f47046b && this.f47047c == bVar.f47047c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f47048e == bVar.f47048e && this.f47049f == bVar.f47049f && this.h == bVar.h && this.f47050n == bVar.f47050n && this.f47051r == bVar.f47051r && this.f47052s == bVar.f47052s && this.v == bVar.v && this.f47053w == bVar.f47053w && this.f47054x == bVar.f47054x && this.f47055y == bVar.f47055y && this.A == bVar.A && this.B == bVar.B && this.C == bVar.C) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47045a, this.f47046b, this.f47047c, this.d, Float.valueOf(this.f47048e), Integer.valueOf(this.f47049f), Integer.valueOf(this.h), Float.valueOf(this.f47050n), Integer.valueOf(this.f47051r), Float.valueOf(this.f47052s), Float.valueOf(this.v), Boolean.valueOf(this.f47053w), Integer.valueOf(this.f47054x), Integer.valueOf(this.f47055y), Float.valueOf(this.A), Integer.valueOf(this.B), Float.valueOf(this.C)});
    }
}
