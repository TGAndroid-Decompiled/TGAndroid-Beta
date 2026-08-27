package org.telegram.ui;

import android.text.TextUtils;

public final class rb0 extends xf.a {

    public final CharSequence f41893c;
    public final int d;

    public final int f41894e;

    public final int f41895f;

    public rb0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f41893c = charSequence;
        this.d = i11;
        this.f41894e = i12;
        this.f41895f = i13;
    }

    public static rb0 b(int i10, String str) {
        return new rb0(4, 0, str, i10, 0);
    }

    public static rb0 c(int i10, int i11, String str) {
        return new rb0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb0)) {
            return false;
        }
        rb0 rb0Var = (rb0) obj;
        int i10 = rb0Var.f49413a;
        int i11 = this.f49413a;
        if (i10 != i11) {
            return false;
        }
        if (i11 == 3 && rb0Var.d != this.d) {
            return false;
        }
        if (i11 == 5 && rb0Var.f41895f != this.f41895f) {
            return false;
        }
        if ((i11 == 3 || i11 == 4) && rb0Var.f41894e != this.f41894e) {
            return false;
        }
        return !(i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) || TextUtils.equals(rb0Var.f41893c, this.f41893c);
    }
}
