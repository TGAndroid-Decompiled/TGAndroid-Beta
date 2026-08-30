package ph;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class p7 extends bg.b {
    public int f42169c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f42170f;
    public TLRPC.User f42171g;
    public TLRPC.Chat h;
    public int f42172i;
    public int f42173j;
    public boolean f42174k;
    public boolean f42175l;
    public boolean f42176m;
    public boolean f42177n;
    public int f42178o;
    public int f42179p;
    public int f42180q;

    public p7(int i10, boolean z4) {
        super(i10, z4);
        this.f42179p = -1;
    }

    public static p7 b(String str, CharSequence charSequence, int i10) {
        p7 p7Var = new p7(9, false);
        p7Var.e = str;
        p7Var.f42170f = charSequence;
        p7Var.f42180q = i10;
        return p7Var;
    }

    public static p7 c() {
        return new p7(0, false);
    }

    public static p7 d() {
        p7 p7Var = new p7(-1, false);
        p7Var.f42178o = -1;
        return p7Var;
    }

    public static p7 e() {
        return new p7(1, false);
    }

    public static p7 f() {
        return new p7(2, false);
    }

    public static p7 g(CharSequence charSequence) {
        p7 p7Var = new p7(6, false);
        p7Var.e = charSequence;
        return p7Var;
    }

    public static p7 h(int i10, int i11, boolean z4) {
        p7 p7Var = new p7(3, false);
        p7Var.f42172i = i10;
        p7Var.f42174k = z4;
        p7Var.f42173j = i11;
        return p7Var;
    }

    public static p7 i(TLRPC.User user, boolean z4, boolean z10) {
        p7 p7Var = new p7(3, true);
        p7Var.f42171g = user;
        p7Var.f42174k = z4;
        p7Var.f42175l = z10;
        return p7Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && p7.class == obj.getClass()) {
                p7 p7Var = (p7) obj;
                int i10 = this.f1808a;
                if (i10 == p7Var.f1808a) {
                    if (i10 != -1 || (this.f42178o == p7Var.f42178o && this.f42179p == p7Var.f42179p)) {
                        if (i10 != 3 || (this.f42171g == p7Var.f42171g && this.h == p7Var.h && this.f42172i == p7Var.f42172i && this.f42173j == p7Var.f42173j && this.f42174k == p7Var.f42174k && this.f42176m == p7Var.f42176m && this.f42177n == p7Var.f42177n)) {
                            if (i10 != 0 || this.f42169c == p7Var.f42169c) {
                                if (i10 != 2 || TextUtils.equals(this.e, p7Var.e)) {
                                    if (this.f1808a != 8 || TextUtils.equals(this.e, p7Var.e)) {
                                        int i11 = this.f1808a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.e, p7Var.e) && TextUtils.equals(this.f42170f, p7Var.f42170f))) {
                                            if (this.f1808a != 6 || (TextUtils.equals(this.e, p7Var.e) && this.f42169c == p7Var.f42169c)) {
                                                if (this.f1808a != 7 || (this.f42169c == p7Var.f42169c && TextUtils.equals(this.e, p7Var.e) && this.f42174k == p7Var.f42174k)) {
                                                    if (this.f1808a != 9 || (this.f42180q == p7Var.f42180q && this.d == p7Var.d && TextUtils.equals(this.e, p7Var.e) && TextUtils.equals(this.f42170f, p7Var.f42170f))) {
                                                        if (this.f1808a != 10 || this.f42180q == p7Var.f42180q) {
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
