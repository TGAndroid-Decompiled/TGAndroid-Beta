package vh;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class g6 extends hg.b {
    public int f51215c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f51216f;
    public TLRPC.User f51217g;
    public TLRPC.Chat h;
    public int f51218i;
    public int f51219j;
    public boolean f51220k;
    public boolean f51221l;
    public boolean f51222m;
    public boolean f51223n;
    public int f51224o;
    public int f51225p;
    public int f51226q;

    public g6(int i10, boolean z10) {
        super(i10, z10);
        this.f51225p = -1;
    }

    public static g6 b(String str, CharSequence charSequence, int i10) {
        g6 g6Var = new g6(9, false);
        g6Var.e = str;
        g6Var.f51216f = charSequence;
        g6Var.f51226q = i10;
        return g6Var;
    }

    public static g6 c() {
        return new g6(0, false);
    }

    public static g6 d() {
        g6 g6Var = new g6(-1, false);
        g6Var.f51224o = -1;
        return g6Var;
    }

    public static g6 e() {
        return new g6(1, false);
    }

    public static g6 f() {
        return new g6(2, false);
    }

    public static g6 g(CharSequence charSequence) {
        g6 g6Var = new g6(6, false);
        g6Var.e = charSequence;
        return g6Var;
    }

    public static g6 h(int i10, int i11, boolean z10) {
        g6 g6Var = new g6(3, false);
        g6Var.f51218i = i10;
        g6Var.f51220k = z10;
        g6Var.f51219j = i11;
        return g6Var;
    }

    public static g6 i(TLRPC.User user, boolean z10, boolean z11) {
        g6 g6Var = new g6(3, true);
        g6Var.f51217g = user;
        g6Var.f51220k = z10;
        g6Var.f51221l = z11;
        return g6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g6.class == obj.getClass()) {
                g6 g6Var = (g6) obj;
                int i10 = this.f7681a;
                if (i10 == g6Var.f7681a) {
                    if (i10 != -1 || (this.f51224o == g6Var.f51224o && this.f51225p == g6Var.f51225p)) {
                        if (i10 != 3 || (this.f51217g == g6Var.f51217g && this.h == g6Var.h && this.f51218i == g6Var.f51218i && this.f51219j == g6Var.f51219j && this.f51220k == g6Var.f51220k && this.f51222m == g6Var.f51222m && this.f51223n == g6Var.f51223n)) {
                            if (i10 != 0 || this.f51215c == g6Var.f51215c) {
                                if (i10 != 2 || TextUtils.equals(this.e, g6Var.e)) {
                                    if (this.f7681a != 8 || TextUtils.equals(this.e, g6Var.e)) {
                                        int i11 = this.f7681a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.e, g6Var.e) && TextUtils.equals(this.f51216f, g6Var.f51216f))) {
                                            if (this.f7681a != 6 || (TextUtils.equals(this.e, g6Var.e) && this.f51215c == g6Var.f51215c)) {
                                                if (this.f7681a != 7 || (this.f51215c == g6Var.f51215c && TextUtils.equals(this.e, g6Var.e) && this.f51220k == g6Var.f51220k)) {
                                                    if (this.f7681a != 9 || (this.f51226q == g6Var.f51226q && this.d == g6Var.d && TextUtils.equals(this.e, g6Var.e) && TextUtils.equals(this.f51216f, g6Var.f51216f))) {
                                                        if (this.f7681a != 10 || this.f51226q == g6Var.f51226q) {
                                                            return true;
                                                        }
                                                        return false;
                                                    }
                                                    return false;
                                                }
                                                return false;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
