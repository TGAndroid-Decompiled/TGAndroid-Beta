package org.telegram.ui;

import android.text.TextUtils;
public final class wa0 extends hg.b {
    public final CharSequence f42912c;
    public final int d;
    public final int e;
    public final int f42913f;

    public wa0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f42912c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f42913f = i13;
    }

    public static wa0 b(int i10, String str) {
        return new wa0(4, 0, str, i10, 0);
    }

    public static wa0 c(int i10, int i11, String str) {
        return new wa0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wa0) {
                wa0 wa0Var = (wa0) obj;
                int i10 = wa0Var.f7680a;
                int i11 = this.f7680a;
                if (i10 == i11) {
                    if (i11 != 3 || wa0Var.d == this.d) {
                        if (i11 != 5 || wa0Var.f42913f == this.f42913f) {
                            if ((i11 != 3 && i11 != 4) || wa0Var.e == this.e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(wa0Var.f42912c, this.f42912c)) {
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
