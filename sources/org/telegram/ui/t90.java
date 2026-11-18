package org.telegram.ui;

import android.text.TextUtils;
public final class t90 extends rg.a {
    public final CharSequence f52225c;
    public final int d;
    public final int f52226e;
    public final int f52227f;

    public t90(int i7, int i10, CharSequence charSequence, int i11, int i12) {
        super(i7, false);
        this.f52225c = charSequence;
        this.d = i10;
        this.f52226e = i11;
        this.f52227f = i12;
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
                int i7 = t90Var.f56589a;
                int i10 = this.f56589a;
                if (i7 == i10) {
                    if (i10 != 3 || t90Var.d == this.d) {
                        if (i10 != 5 || t90Var.f52227f == this.f52227f) {
                            if ((i10 != 3 && i10 != 4) || t90Var.f52226e == this.f52226e) {
                                if ((i10 == 0 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) && !TextUtils.equals(t90Var.f52225c, this.f52225c)) {
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
