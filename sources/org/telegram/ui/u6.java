package org.telegram.ui;

import j$.util.Objects;
public final class u6 extends pg.a {
    public final int f40942c;
    public CharSequence d;
    public String f40943e;
    public int f40944f;
    public long f40945g;
    public int h;
    public boolean f40946i;
    public boolean f40947j;

    public u6(int i10, String str) {
        super(i10, true);
        this.f40942c = -1;
        this.d = str;
    }

    public static u6 b(int i10, long j3, String str, int i11) {
        u6 u6Var = new u6(11);
        u6Var.f40944f = i10;
        u6Var.d = str;
        u6Var.f40945g = j3;
        u6Var.h = i11;
        u6Var.f40947j = false;
        return u6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u6.class == obj.getClass()) {
                u6 u6Var = (u6) obj;
                int i10 = this.f44072a;
                if (i10 == u6Var.f44072a) {
                    if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                        if (i10 == 3) {
                            return Objects.equals(this.d, u6Var.d);
                        }
                        if (i10 == 1) {
                            return Objects.equals(this.f40943e, u6Var.f40943e);
                        }
                        if (i10 == 11) {
                            if (this.f40944f != u6Var.f40944f || this.f40945g != u6Var.f40945g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f40942c != u6Var.f40942c) {
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

    public u6(int i10, int i11) {
        super(7, true);
        this.f40942c = i10;
    }

    public u6(int i10) {
        super(i10, true);
        this.f40942c = -1;
    }
}
