package org.telegram.ui;

import android.text.TextUtils;
public final class r90 extends rg.a {
    public final CharSequence f49411c;
    public final int d;
    public final int f49412e;
    public final int f49413f;

    public r90(int i7, int i10, CharSequence charSequence, int i11, int i12) {
        super(i7, false);
        this.f49411c = charSequence;
        this.d = i10;
        this.f49412e = i11;
        this.f49413f = i12;
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
                int i7 = r90Var.f54439a;
                int i10 = this.f54439a;
                if (i7 == i10) {
                    if (i10 != 3 || r90Var.d == this.d) {
                        if (i10 != 5 || r90Var.f49413f == this.f49413f) {
                            if ((i10 != 3 && i10 != 4) || r90Var.f49412e == this.f49412e) {
                                if ((i10 == 0 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) && !TextUtils.equals(r90Var.f49411c, this.f49411c)) {
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
