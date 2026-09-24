package org.telegram.ui;

import j$.util.Objects;
public final class t6 extends og.a {
    public final int f37956c;
    public CharSequence d;
    public String e;
    public int f37957f;
    public long f37958g;
    public int h;
    public boolean f37959i;
    public boolean f37960j;

    public t6(int i10, String str) {
        super(i10, true);
        this.f37956c = -1;
        this.d = str;
    }

    public static t6 b(int i10, long j3, String str, int i11) {
        t6 t6Var = new t6(11);
        t6Var.f37957f = i10;
        t6Var.d = str;
        t6Var.f37958g = j3;
        t6Var.h = i11;
        t6Var.f37960j = false;
        return t6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t6.class == obj.getClass()) {
                t6 t6Var = (t6) obj;
                int i10 = this.f15700a;
                if (i10 == t6Var.f15700a) {
                    if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                        if (i10 == 3) {
                            return Objects.equals(this.d, t6Var.d);
                        }
                        if (i10 == 1) {
                            return Objects.equals(this.e, t6Var.e);
                        }
                        if (i10 == 11) {
                            if (this.f37957f != t6Var.f37957f || this.f37958g != t6Var.f37958g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f37956c != t6Var.f37956c) {
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
        this.f37956c = i10;
    }

    public t6(int i10) {
        super(i10, true);
        this.f37956c = -1;
    }
}
