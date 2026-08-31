package org.telegram.ui;

import android.text.TextUtils;
public final class zb0 extends cg.b {
    public final CharSequence f43887c;
    public final int d;
    public final int f43888e;
    public final int f43889f;

    public zb0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f43887c = charSequence;
        this.d = i11;
        this.f43888e = i12;
        this.f43889f = i13;
    }

    public static zb0 b(int i10, String str) {
        return new zb0(4, 0, str, i10, 0);
    }

    public static zb0 c(int i10, int i11, String str) {
        return new zb0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zb0) {
                zb0 zb0Var = (zb0) obj;
                int i10 = zb0Var.f2505a;
                int i11 = this.f2505a;
                if (i10 == i11) {
                    if (i11 != 3 || zb0Var.d == this.d) {
                        if (i11 != 5 || zb0Var.f43889f == this.f43889f) {
                            if ((i11 != 3 && i11 != 4) || zb0Var.f43888e == this.f43888e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(zb0Var.f43887c, this.f43887c)) {
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
