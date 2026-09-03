package qh;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class m7 extends cg.b {
    public int f45754c;
    public Drawable d;
    public CharSequence f45755e;
    public CharSequence f45756f;
    public TLRPC.User f45757g;
    public TLRPC.Chat h;
    public int f45758i;
    public int f45759j;
    public boolean f45760k;
    public boolean f45761l;
    public boolean f45762m;
    public boolean f45763n;
    public int f45764o;
    public int f45765p;
    public int f45766q;

    public m7(int i10, boolean z4) {
        super(i10, z4);
        this.f45765p = -1;
    }

    public static m7 b(String str, CharSequence charSequence, int i10) {
        m7 m7Var = new m7(9, false);
        m7Var.f45755e = str;
        m7Var.f45756f = charSequence;
        m7Var.f45766q = i10;
        return m7Var;
    }

    public static m7 c() {
        return new m7(0, false);
    }

    public static m7 d() {
        m7 m7Var = new m7(-1, false);
        m7Var.f45764o = -1;
        return m7Var;
    }

    public static m7 e() {
        return new m7(1, false);
    }

    public static m7 f() {
        return new m7(2, false);
    }

    public static m7 g(CharSequence charSequence) {
        m7 m7Var = new m7(6, false);
        m7Var.f45755e = charSequence;
        return m7Var;
    }

    public static m7 h(int i10, int i11, boolean z4) {
        m7 m7Var = new m7(3, false);
        m7Var.f45758i = i10;
        m7Var.f45760k = z4;
        m7Var.f45759j = i11;
        return m7Var;
    }

    public static m7 i(TLRPC.User user, boolean z4, boolean z10) {
        m7 m7Var = new m7(3, true);
        m7Var.f45757g = user;
        m7Var.f45760k = z4;
        m7Var.f45761l = z10;
        return m7Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && m7.class == obj.getClass()) {
                m7 m7Var = (m7) obj;
                int i10 = this.f2505a;
                if (i10 == m7Var.f2505a) {
                    if (i10 != -1 || (this.f45764o == m7Var.f45764o && this.f45765p == m7Var.f45765p)) {
                        if (i10 != 3 || (this.f45757g == m7Var.f45757g && this.h == m7Var.h && this.f45758i == m7Var.f45758i && this.f45759j == m7Var.f45759j && this.f45760k == m7Var.f45760k && this.f45762m == m7Var.f45762m && this.f45763n == m7Var.f45763n)) {
                            if (i10 != 0 || this.f45754c == m7Var.f45754c) {
                                if (i10 != 2 || TextUtils.equals(this.f45755e, m7Var.f45755e)) {
                                    if (this.f2505a != 8 || TextUtils.equals(this.f45755e, m7Var.f45755e)) {
                                        int i11 = this.f2505a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.f45755e, m7Var.f45755e) && TextUtils.equals(this.f45756f, m7Var.f45756f))) {
                                            if (this.f2505a != 6 || (TextUtils.equals(this.f45755e, m7Var.f45755e) && this.f45754c == m7Var.f45754c)) {
                                                if (this.f2505a != 7 || (this.f45754c == m7Var.f45754c && TextUtils.equals(this.f45755e, m7Var.f45755e) && this.f45760k == m7Var.f45760k)) {
                                                    if (this.f2505a != 9 || (this.f45766q == m7Var.f45766q && this.d == m7Var.d && TextUtils.equals(this.f45755e, m7Var.f45755e) && TextUtils.equals(this.f45756f, m7Var.f45756f))) {
                                                        if (this.f2505a != 10 || this.f45766q == m7Var.f45766q) {
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
