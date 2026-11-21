package org.telegram.ui;

import j$.util.Objects;
public final class t6 extends rg.a {
    public final int f52232c;
    public CharSequence d;
    public String f52233e;
    public int f52234f;
    public long f52235g;
    public int h;
    public boolean f52236i;
    public boolean f52237j;

    public t6(int i7, String str) {
        super(i7, true);
        this.f52232c = -1;
        this.d = str;
    }

    public static t6 b(int i7, long j3, String str, int i10) {
        t6 t6Var = new t6(11);
        t6Var.f52234f = i7;
        t6Var.d = str;
        t6Var.f52235g = j3;
        t6Var.h = i10;
        t6Var.f52237j = false;
        return t6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t6.class == obj.getClass()) {
                t6 t6Var = (t6) obj;
                int i7 = this.f56630a;
                if (i7 == t6Var.f56630a) {
                    if (i7 != 9 && i7 != 10 && i7 != 8 && i7 != 4 && i7 != 2 && i7 != 0 && i7 != 13) {
                        if (i7 == 3) {
                            return Objects.equals(this.d, t6Var.d);
                        }
                        if (i7 == 1) {
                            return Objects.equals(this.f52233e, t6Var.f52233e);
                        }
                        if (i7 == 11) {
                            if (this.f52234f != t6Var.f52234f || this.f52235g != t6Var.f52235g) {
                                return false;
                            }
                        } else if (i7 != 7 || this.f52232c != t6Var.f52232c) {
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

    public t6(int i7, int i10) {
        super(7, true);
        this.f52232c = i7;
    }

    public t6(int i7) {
        super(i7, true);
        this.f52232c = -1;
    }
}
