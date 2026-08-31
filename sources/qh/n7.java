package qh;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class n7 extends cg.b {
    public int f45777c;
    public Drawable d;
    public CharSequence f45778e;
    public CharSequence f45779f;
    public TLRPC.User f45780g;
    public TLRPC.Chat h;
    public int f45781i;
    public int f45782j;
    public boolean f45783k;
    public boolean f45784l;
    public boolean f45785m;
    public boolean f45786n;
    public int f45787o;
    public int f45788p;
    public int f45789q;

    public n7(int i10, boolean z4) {
        super(i10, z4);
        this.f45788p = -1;
    }

    public static n7 b(String str, CharSequence charSequence, int i10) {
        n7 n7Var = new n7(9, false);
        n7Var.f45778e = str;
        n7Var.f45779f = charSequence;
        n7Var.f45789q = i10;
        return n7Var;
    }

    public static n7 c() {
        return new n7(0, false);
    }

    public static n7 d() {
        n7 n7Var = new n7(-1, false);
        n7Var.f45787o = -1;
        return n7Var;
    }

    public static n7 e() {
        return new n7(1, false);
    }

    public static n7 f() {
        return new n7(2, false);
    }

    public static n7 g(CharSequence charSequence) {
        n7 n7Var = new n7(6, false);
        n7Var.f45778e = charSequence;
        return n7Var;
    }

    public static n7 h(int i10, int i11, boolean z4) {
        n7 n7Var = new n7(3, false);
        n7Var.f45781i = i10;
        n7Var.f45783k = z4;
        n7Var.f45782j = i11;
        return n7Var;
    }

    public static n7 i(TLRPC.User user, boolean z4, boolean z10) {
        n7 n7Var = new n7(3, true);
        n7Var.f45780g = user;
        n7Var.f45783k = z4;
        n7Var.f45784l = z10;
        return n7Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n7.class == obj.getClass()) {
                n7 n7Var = (n7) obj;
                int i10 = this.f2505a;
                if (i10 == n7Var.f2505a) {
                    if (i10 != -1 || (this.f45787o == n7Var.f45787o && this.f45788p == n7Var.f45788p)) {
                        if (i10 != 3 || (this.f45780g == n7Var.f45780g && this.h == n7Var.h && this.f45781i == n7Var.f45781i && this.f45782j == n7Var.f45782j && this.f45783k == n7Var.f45783k && this.f45785m == n7Var.f45785m && this.f45786n == n7Var.f45786n)) {
                            if (i10 != 0 || this.f45777c == n7Var.f45777c) {
                                if (i10 != 2 || TextUtils.equals(this.f45778e, n7Var.f45778e)) {
                                    if (this.f2505a != 8 || TextUtils.equals(this.f45778e, n7Var.f45778e)) {
                                        int i11 = this.f2505a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.f45778e, n7Var.f45778e) && TextUtils.equals(this.f45779f, n7Var.f45779f))) {
                                            if (this.f2505a != 6 || (TextUtils.equals(this.f45778e, n7Var.f45778e) && this.f45777c == n7Var.f45777c)) {
                                                if (this.f2505a != 7 || (this.f45777c == n7Var.f45777c && TextUtils.equals(this.f45778e, n7Var.f45778e) && this.f45783k == n7Var.f45783k)) {
                                                    if (this.f2505a != 9 || (this.f45789q == n7Var.f45789q && this.d == n7Var.d && TextUtils.equals(this.f45778e, n7Var.f45778e) && TextUtils.equals(this.f45779f, n7Var.f45779f))) {
                                                        if (this.f2505a != 10 || this.f45789q == n7Var.f45789q) {
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
