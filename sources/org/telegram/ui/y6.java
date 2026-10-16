package org.telegram.ui;

import j$.util.Objects;
public final class y6 extends pg.a {
    public final int f41748c;
    public CharSequence d;
    public String e;
    public int f41749f;
    public long f41750g;
    public int h;
    public boolean f41751i;
    public boolean f41752j;

    public y6(int i10, String str) {
        super(i10, true);
        this.f41748c = -1;
        this.d = str;
    }

    public static y6 b(int i10, long j10, String str, int i11) {
        y6 y6Var = new y6(11);
        y6Var.f41749f = i10;
        y6Var.d = str;
        y6Var.f41750g = j10;
        y6Var.h = i11;
        y6Var.f41752j = false;
        return y6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && y6.class == obj.getClass()) {
                y6 y6Var = (y6) obj;
                int i10 = this.f42904a;
                if (i10 == y6Var.f42904a) {
                    if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                        if (i10 == 3) {
                            return Objects.equals(this.d, y6Var.d);
                        }
                        if (i10 == 1) {
                            return Objects.equals(this.e, y6Var.e);
                        }
                        if (i10 == 11) {
                            if (this.f41749f != y6Var.f41749f || this.f41750g != y6Var.f41750g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f41748c != y6Var.f41748c) {
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
        this.f41748c = i10;
    }

    public y6(int i10) {
        super(i10, true);
        this.f41748c = -1;
    }
}
