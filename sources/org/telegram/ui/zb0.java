package org.telegram.ui;

import android.text.TextUtils;
public final class zb0 extends cg.b {
    public final CharSequence f43885c;
    public final int d;
    public final int f43886e;
    public final int f43887f;

    public zb0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f43885c = charSequence;
        this.d = i11;
        this.f43886e = i12;
        this.f43887f = i13;
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
                        if (i11 != 5 || zb0Var.f43887f == this.f43887f) {
                            if ((i11 != 3 && i11 != 4) || zb0Var.f43886e == this.f43886e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(zb0Var.f43885c, this.f43885c)) {
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
