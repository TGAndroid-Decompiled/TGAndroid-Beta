package org.telegram.ui;

import android.text.TextUtils;
public final class t90 extends rg.a {
    public final CharSequence f50129c;
    public final int d;
    public final int f50130e;
    public final int f50131f;

    public t90(int i7, int i10, CharSequence charSequence, int i11, int i12) {
        super(i7, false);
        this.f50129c = charSequence;
        this.d = i10;
        this.f50130e = i11;
        this.f50131f = i12;
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
                int i7 = t90Var.f54544a;
                int i10 = this.f54544a;
                if (i7 == i10) {
                    if (i10 != 3 || t90Var.d == this.d) {
                        if (i10 != 5 || t90Var.f50131f == this.f50131f) {
                            if ((i10 != 3 && i10 != 4) || t90Var.f50130e == this.f50130e) {
                                if ((i10 == 0 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) && !TextUtils.equals(t90Var.f50129c, this.f50129c)) {
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
