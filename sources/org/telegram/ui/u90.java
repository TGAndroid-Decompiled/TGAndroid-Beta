package org.telegram.ui;

import android.text.TextUtils;
public final class u90 extends rg.a {
    public final CharSequence f52465c;
    public final int d;
    public final int f52466e;
    public final int f52467f;

    public u90(int i7, int i10, CharSequence charSequence, int i11, int i12) {
        super(i7, false);
        this.f52465c = charSequence;
        this.d = i10;
        this.f52466e = i11;
        this.f52467f = i12;
    }

    public static u90 b(int i7, String str) {
        return new u90(4, 0, str, i7, 0);
    }

    public static u90 c(int i7, int i10, String str) {
        return new u90(3, i7, str, i10, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u90) {
                u90 u90Var = (u90) obj;
                int i7 = u90Var.f56589a;
                int i10 = this.f56589a;
                if (i7 == i10) {
                    if (i10 != 3 || u90Var.d == this.d) {
                        if (i10 != 5 || u90Var.f52467f == this.f52467f) {
                            if ((i10 != 3 && i10 != 4) || u90Var.f52466e == this.f52466e) {
                                if ((i10 == 0 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) && !TextUtils.equals(u90Var.f52465c, this.f52465c)) {
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
