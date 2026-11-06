package org.telegram.ui;

import android.text.TextUtils;
public final class r90 extends rg.a {
    public final CharSequence f49392c;
    public final int d;
    public final int f49393e;
    public final int f49394f;

    public r90(int i7, int i10, CharSequence charSequence, int i11, int i12) {
        super(i7, false);
        this.f49392c = charSequence;
        this.d = i10;
        this.f49393e = i11;
        this.f49394f = i12;
    }

    public static r90 b(int i7, String str) {
        return new r90(4, 0, str, i7, 0);
    }

    public static r90 c(int i7, int i10, String str) {
        return new r90(3, i7, str, i10, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r90) {
                r90 r90Var = (r90) obj;
                int i7 = r90Var.f54415a;
                int i10 = this.f54415a;
                if (i7 == i10) {
                    if (i10 != 3 || r90Var.d == this.d) {
                        if (i10 != 5 || r90Var.f49394f == this.f49394f) {
                            if ((i10 != 3 && i10 != 4) || r90Var.f49393e == this.f49393e) {
                                if ((i10 == 0 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) && !TextUtils.equals(r90Var.f49392c, this.f49392c)) {
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
