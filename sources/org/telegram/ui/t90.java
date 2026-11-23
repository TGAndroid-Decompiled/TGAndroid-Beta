package org.telegram.ui;

import android.text.TextUtils;
public final class t90 extends rg.a {
    public final CharSequence f52314c;
    public final int d;
    public final int f52315e;
    public final int f52316f;

    public t90(int i7, int i10, CharSequence charSequence, int i11, int i12) {
        super(i7, false);
        this.f52314c = charSequence;
        this.d = i10;
        this.f52315e = i11;
        this.f52316f = i12;
    }

    public static t90 b(int i7, String str) {
        return new t90(4, 0, str, i7, 0);
    }

    public static t90 c(int i7, int i10, String str) {
        return new t90(3, i7, str, i10, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t90) {
                t90 t90Var = (t90) obj;
                int i7 = t90Var.f56712a;
                int i10 = this.f56712a;
                if (i7 == i10) {
                    if (i10 != 3 || t90Var.d == this.d) {
                        if (i10 != 5 || t90Var.f52316f == this.f52316f) {
                            if ((i10 != 3 && i10 != 4) || t90Var.f52315e == this.f52315e) {
                                if ((i10 == 0 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) && !TextUtils.equals(t90Var.f52314c, this.f52314c)) {
                                    return false;
                                }
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
        return true;
    }
}
