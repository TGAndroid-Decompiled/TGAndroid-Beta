package org.telegram.ui;

import j$.util.Objects;
public final class y6 extends qg.a {
    public final int f45966c;
    public CharSequence d;
    public String e;
    public int f45967f;
    public long f45968g;
    public int h;
    public boolean f45969i;
    public boolean f45970j;

    public y6(int i10, String str) {
        super(i10, true);
        this.f45966c = -1;
        this.d = str;
    }

    public static y6 b(int i10, long j10, String str, int i11) {
        y6 y6Var = new y6(11);
        y6Var.f45967f = i10;
        y6Var.d = str;
        y6Var.f45968g = j10;
        y6Var.h = i11;
        y6Var.f45970j = false;
        return y6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && y6.class == obj.getClass()) {
                y6 y6Var = (y6) obj;
                int i10 = this.f47037a;
                if (i10 == y6Var.f47037a) {
                    if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                        if (i10 == 3) {
                            return Objects.equals(this.d, y6Var.d);
                        }
                        if (i10 == 1) {
                            return Objects.equals(this.e, y6Var.e);
                        }
                        if (i10 == 11) {
                            if (this.f45967f != y6Var.f45967f || this.f45968g != y6Var.f45968g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f45966c != y6Var.f45966c) {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public y6(int i10, int i11) {
        super(7, true);
        this.f45966c = i10;
    }

    public y6(int i10) {
        super(i10, true);
        this.f45966c = -1;
    }
}
