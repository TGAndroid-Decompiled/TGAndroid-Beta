package org.telegram.ui;

import android.text.TextUtils;
public final class s90 extends rg.a {
    public final CharSequence f51161c;
    public final int d;
    public final int f51162e;
    public final int f51163f;

    public s90(int i7, int i10, CharSequence charSequence, int i11, int i12) {
        super(i7, false);
        this.f51161c = charSequence;
        this.d = i10;
        this.f51162e = i11;
        this.f51163f = i12;
    }

    public static s90 b(int i7, String str) {
        return new s90(4, 0, str, i7, 0);
    }

    public static s90 c(int i7, int i10, String str) {
        return new s90(3, i7, str, i10, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s90) {
                s90 s90Var = (s90) obj;
                int i7 = s90Var.f56015a;
                int i10 = this.f56015a;
                if (i7 == i10) {
                    if (i10 != 3 || s90Var.d == this.d) {
                        if (i10 != 5 || s90Var.f51163f == this.f51163f) {
                            if ((i10 != 3 && i10 != 4) || s90Var.f51162e == this.f51162e) {
                                if ((i10 == 0 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) && !TextUtils.equals(s90Var.f51161c, this.f51161c)) {
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
