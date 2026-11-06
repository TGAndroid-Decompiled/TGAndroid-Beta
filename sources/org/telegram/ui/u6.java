package org.telegram.ui;

import j$.util.Objects;
public final class u6 extends rg.a {
    public final int f50242c;
    public CharSequence d;
    public String f50243e;
    public int f50244f;
    public long f50245g;
    public int h;
    public boolean f50246i;
    public boolean f50247j;

    public u6(int i7, String str) {
        super(i7, true);
        this.f50242c = -1;
        this.d = str;
    }

    public static u6 b(int i7, long j3, String str, int i10) {
        u6 u6Var = new u6(11);
        u6Var.f50244f = i7;
        u6Var.d = str;
        u6Var.f50245g = j3;
        u6Var.h = i10;
        u6Var.f50247j = false;
        return u6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u6.class == obj.getClass()) {
                u6 u6Var = (u6) obj;
                int i7 = this.f54440a;
                if (i7 == u6Var.f54440a) {
                    if (i7 != 9 && i7 != 10 && i7 != 8 && i7 != 4 && i7 != 2 && i7 != 0 && i7 != 13) {
                        if (i7 == 3) {
                            return Objects.equals(this.d, u6Var.d);
                        }
                        if (i7 == 1) {
                            return Objects.equals(this.f50243e, u6Var.f50243e);
                        }
                        if (i7 == 11) {
                            if (this.f50244f != u6Var.f50244f || this.f50245g != u6Var.f50245g) {
                                return false;
                            }
                        } else if (i7 != 7 || this.f50242c != u6Var.f50242c) {
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

    public u6(int i7, int i10) {
        super(7, true);
        this.f50242c = i7;
    }

    public u6(int i7) {
        super(i7, true);
        this.f50242c = -1;
    }
}
