package vh;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class g6 extends hg.b {
    public int f51200c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f51201f;
    public TLRPC.User f51202g;
    public TLRPC.Chat h;
    public int f51203i;
    public int f51204j;
    public boolean f51205k;
    public boolean f51206l;
    public boolean f51207m;
    public boolean f51208n;
    public int f51209o;
    public int f51210p;
    public int f51211q;

    public g6(int i10, boolean z10) {
        super(i10, z10);
        this.f51210p = -1;
    }

    public static g6 b(String str, CharSequence charSequence, int i10) {
        g6 g6Var = new g6(9, false);
        g6Var.e = str;
        g6Var.f51201f = charSequence;
        g6Var.f51211q = i10;
        return g6Var;
    }

    public static g6 c() {
        return new g6(0, false);
    }

    public static g6 d() {
        g6 g6Var = new g6(-1, false);
        g6Var.f51209o = -1;
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
        g6Var.f51203i = i10;
        g6Var.f51205k = z10;
        g6Var.f51204j = i11;
        return g6Var;
    }

    public static g6 i(TLRPC.User user, boolean z10, boolean z11) {
        g6 g6Var = new g6(3, true);
        g6Var.f51202g = user;
        g6Var.f51205k = z10;
        g6Var.f51206l = z11;
        return g6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g6.class == obj.getClass()) {
                g6 g6Var = (g6) obj;
                int i10 = this.f7680a;
                if (i10 == g6Var.f7680a) {
                    if (i10 != -1 || (this.f51209o == g6Var.f51209o && this.f51210p == g6Var.f51210p)) {
                        if (i10 != 3 || (this.f51202g == g6Var.f51202g && this.h == g6Var.h && this.f51203i == g6Var.f51203i && this.f51204j == g6Var.f51204j && this.f51205k == g6Var.f51205k && this.f51207m == g6Var.f51207m && this.f51208n == g6Var.f51208n)) {
                            if (i10 != 0 || this.f51200c == g6Var.f51200c) {
                                if (i10 != 2 || TextUtils.equals(this.e, g6Var.e)) {
                                    if (this.f7680a != 8 || TextUtils.equals(this.e, g6Var.e)) {
                                        int i11 = this.f7680a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.e, g6Var.e) && TextUtils.equals(this.f51201f, g6Var.f51201f))) {
                                            if (this.f7680a != 6 || (TextUtils.equals(this.e, g6Var.e) && this.f51200c == g6Var.f51200c)) {
                                                if (this.f7680a != 7 || (this.f51200c == g6Var.f51200c && TextUtils.equals(this.e, g6Var.e) && this.f51205k == g6Var.f51205k)) {
                                                    if (this.f7680a != 9 || (this.f51211q == g6Var.f51211q && this.d == g6Var.d && TextUtils.equals(this.e, g6Var.e) && TextUtils.equals(this.f51201f, g6Var.f51201f))) {
                                                        if (this.f7680a != 10 || this.f51211q == g6Var.f51211q) {
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
