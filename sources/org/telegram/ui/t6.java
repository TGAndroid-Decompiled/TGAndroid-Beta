package org.telegram.ui;

import j$.util.Objects;
public final class t6 extends ng.a {
    public final int f36844c;
    public CharSequence d;
    public String e;
    public int f36845f;
    public long f36846g;
    public int h;
    public boolean f36847i;
    public boolean f36848j;

    public t6(int i10, String str) {
        super(i10, true);
        this.f36844c = -1;
        this.d = str;
    }

    public static t6 b(int i10, long j3, String str, int i11) {
        t6 t6Var = new t6(11);
        t6Var.f36845f = i10;
        t6Var.d = str;
        t6Var.f36846g = j3;
        t6Var.h = i11;
        t6Var.f36848j = false;
        return t6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t6.class == obj.getClass()) {
                t6 t6Var = (t6) obj;
                int i10 = this.f14046a;
                if (i10 == t6Var.f14046a) {
                    if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                        if (i10 == 3) {
                            return Objects.equals(this.d, t6Var.d);
                        }
                        if (i10 == 1) {
                            return Objects.equals(this.e, t6Var.e);
                        }
                        if (i10 == 11) {
                            if (this.f36845f != t6Var.f36845f || this.f36846g != t6Var.f36846g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f36844c != t6Var.f36844c) {
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

    public t6(int i10, int i11) {
        super(7, true);
        this.f36844c = i10;
    }

    public t6(int i10) {
        super(i10, true);
        this.f36844c = -1;
    }
}
