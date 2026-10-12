package org.telegram.ui;

import j$.util.Objects;
public final class y6 extends pg.a {
    public final int f42045c;
    public CharSequence d;
    public String e;
    public int f42046f;
    public long f42047g;
    public int h;
    public boolean f42048i;
    public boolean f42049j;

    public y6(int i10, String str) {
        super(i10, true);
        this.f42045c = -1;
        this.d = str;
    }

    public static y6 b(int i10, long j10, String str, int i11) {
        y6 y6Var = new y6(11);
        y6Var.f42046f = i10;
        y6Var.d = str;
        y6Var.f42047g = j10;
        y6Var.h = i11;
        y6Var.f42049j = false;
        return y6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && y6.class == obj.getClass()) {
                y6 y6Var = (y6) obj;
                int i10 = this.f43203a;
                if (i10 == y6Var.f43203a) {
                    if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                        if (i10 == 3) {
                            return Objects.equals(this.d, y6Var.d);
                        }
                        if (i10 == 1) {
                            return Objects.equals(this.e, y6Var.e);
                        }
                        if (i10 == 11) {
                            if (this.f42046f != y6Var.f42046f || this.f42047g != y6Var.f42047g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f42045c != y6Var.f42045c) {
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
        this.f42045c = i10;
    }

    public y6(int i10) {
        super(i10, true);
        this.f42045c = -1;
    }
}
