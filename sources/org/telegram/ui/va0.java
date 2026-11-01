package org.telegram.ui;

import android.text.TextUtils;
public final class va0 extends hg.b {
    public final CharSequence f42464c;
    public final int d;
    public final int e;
    public final int f42465f;

    public va0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f42464c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f42465f = i13;
    }

    public static va0 b(int i10, String str) {
        return new va0(4, 0, str, i10, 0);
    }

    public static va0 c(int i10, int i11, String str) {
        return new va0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof va0) {
                va0 va0Var = (va0) obj;
                int i10 = va0Var.f7681a;
                int i11 = this.f7681a;
                if (i10 == i11) {
                    if (i11 != 3 || va0Var.d == this.d) {
                        if (i11 != 5 || va0Var.f42465f == this.f42465f) {
                            if ((i11 != 3 && i11 != 4) || va0Var.e == this.e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(va0Var.f42464c, this.f42464c)) {
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
