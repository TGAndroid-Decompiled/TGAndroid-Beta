package org.telegram.ui;

import android.text.TextUtils;
public final class yb0 extends bg.b {
    public final CharSequence f40468c;
    public final int d;
    public final int e;
    public final int f40469f;

    public yb0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f40468c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f40469f = i13;
    }

    public static yb0 b(int i10, String str) {
        return new yb0(4, 0, str, i10, 0);
    }

    public static yb0 c(int i10, int i11, String str) {
        return new yb0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yb0) {
                yb0 yb0Var = (yb0) obj;
                int i10 = yb0Var.f1808a;
                int i11 = this.f1808a;
                if (i10 == i11) {
                    if (i11 != 3 || yb0Var.d == this.d) {
                        if (i11 != 5 || yb0Var.f40469f == this.f40469f) {
                            if ((i11 != 3 && i11 != 4) || yb0Var.e == this.e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(yb0Var.f40468c, this.f40468c)) {
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
