package ph;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class o7 extends bg.b {
    public int f42103c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f42104f;
    public TLRPC.User f42105g;
    public TLRPC.Chat h;
    public int f42106i;
    public int f42107j;
    public boolean f42108k;
    public boolean f42109l;
    public boolean f42110m;
    public boolean f42111n;
    public int f42112o;
    public int f42113p;
    public int f42114q;

    public o7(int i10, boolean z4) {
        super(i10, z4);
        this.f42113p = -1;
    }

    public static o7 b(String str, CharSequence charSequence, int i10) {
        o7 o7Var = new o7(9, false);
        o7Var.e = str;
        o7Var.f42104f = charSequence;
        o7Var.f42114q = i10;
        return o7Var;
    }

    public static o7 c() {
        return new o7(0, false);
    }

    public static o7 d() {
        o7 o7Var = new o7(-1, false);
        o7Var.f42112o = -1;
        return o7Var;
    }

    public static o7 e() {
        return new o7(1, false);
    }

    public static o7 f() {
        return new o7(2, false);
    }

    public static o7 g(CharSequence charSequence) {
        o7 o7Var = new o7(6, false);
        o7Var.e = charSequence;
        return o7Var;
    }

    public static o7 h(int i10, int i11, boolean z4) {
        o7 o7Var = new o7(3, false);
        o7Var.f42106i = i10;
        o7Var.f42108k = z4;
        o7Var.f42107j = i11;
        return o7Var;
    }

    public static o7 i(TLRPC.User user, boolean z4, boolean z10) {
        o7 o7Var = new o7(3, true);
        o7Var.f42105g = user;
        o7Var.f42108k = z4;
        o7Var.f42109l = z10;
        return o7Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && o7.class == obj.getClass()) {
                o7 o7Var = (o7) obj;
                int i10 = this.f1830a;
                if (i10 == o7Var.f1830a) {
                    if (i10 != -1 || (this.f42112o == o7Var.f42112o && this.f42113p == o7Var.f42113p)) {
                        if (i10 != 3 || (this.f42105g == o7Var.f42105g && this.h == o7Var.h && this.f42106i == o7Var.f42106i && this.f42107j == o7Var.f42107j && this.f42108k == o7Var.f42108k && this.f42110m == o7Var.f42110m && this.f42111n == o7Var.f42111n)) {
                            if (i10 != 0 || this.f42103c == o7Var.f42103c) {
                                if (i10 != 2 || TextUtils.equals(this.e, o7Var.e)) {
                                    if (this.f1830a != 8 || TextUtils.equals(this.e, o7Var.e)) {
                                        int i11 = this.f1830a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.e, o7Var.e) && TextUtils.equals(this.f42104f, o7Var.f42104f))) {
                                            if (this.f1830a != 6 || (TextUtils.equals(this.e, o7Var.e) && this.f42103c == o7Var.f42103c)) {
                                                if (this.f1830a != 7 || (this.f42103c == o7Var.f42103c && TextUtils.equals(this.e, o7Var.e) && this.f42108k == o7Var.f42108k)) {
                                                    if (this.f1830a != 9 || (this.f42114q == o7Var.f42114q && this.d == o7Var.d && TextUtils.equals(this.e, o7Var.e) && TextUtils.equals(this.f42104f, o7Var.f42104f))) {
                                                        if (this.f1830a != 10 || this.f42114q == o7Var.f42114q) {
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
