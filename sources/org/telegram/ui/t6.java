package org.telegram.ui;

import j$.util.Objects;
public final class t6 extends rg.a {
    public final int f52182c;
    public CharSequence d;
    public String f52183e;
    public int f52184f;
    public long f52185g;
    public int h;
    public boolean f52186i;
    public boolean f52187j;

    public t6(int i7, String str) {
        super(i7, true);
        this.f52182c = -1;
        this.d = str;
    }

    public static t6 b(int i7, long j3, String str, int i10) {
        t6 t6Var = new t6(11);
        t6Var.f52184f = i7;
        t6Var.d = str;
        t6Var.f52185g = j3;
        t6Var.h = i10;
        t6Var.f52187j = false;
        return t6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t6.class == obj.getClass()) {
                t6 t6Var = (t6) obj;
                int i7 = this.f56599a;
                if (i7 == t6Var.f56599a) {
                    if (i7 != 9 && i7 != 10 && i7 != 8 && i7 != 4 && i7 != 2 && i7 != 0 && i7 != 13) {
                        if (i7 == 3) {
                            return Objects.equals(this.d, t6Var.d);
                        }
                        if (i7 == 1) {
                            return Objects.equals(this.f52183e, t6Var.f52183e);
                        }
                        if (i7 == 11) {
                            if (this.f52184f != t6Var.f52184f || this.f52185g != t6Var.f52185g) {
                                return false;
                            }
                        } else if (i7 != 7 || this.f52182c != t6Var.f52182c) {
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
        this.f52182c = i7;
    }

    public t6(int i7) {
        super(i7, true);
        this.f52182c = -1;
    }
}
