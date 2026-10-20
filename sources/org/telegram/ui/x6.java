package org.telegram.ui;

import j$.util.Objects;
public final class x6 extends pg.a {
    public final int f43103c;
    public CharSequence d;
    public String e;
    public int f43104f;
    public long f43105g;
    public int h;
    public boolean f43106i;
    public boolean f43107j;

    public x6(int i10, String str) {
        super(i10, true);
        this.f43103c = -1;
        this.d = str;
    }

    public static x6 b(int i10, long j10, String str, int i11) {
        x6 x6Var = new x6(11);
        x6Var.f43104f = i10;
        x6Var.d = str;
        x6Var.f43105g = j10;
        x6Var.h = i11;
        x6Var.f43107j = false;
        return x6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && x6.class == obj.getClass()) {
                x6 x6Var = (x6) obj;
                int i10 = this.f44296a;
                if (i10 == x6Var.f44296a) {
                    if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                        if (i10 == 3) {
                            return Objects.equals(this.d, x6Var.d);
                        }
                        if (i10 == 1) {
                            return Objects.equals(this.e, x6Var.e);
                        }
                        if (i10 == 11) {
                            if (this.f43104f != x6Var.f43104f || this.f43105g != x6Var.f43105g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f43103c != x6Var.f43103c) {
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

    public x6(int i10, int i11) {
        super(7, true);
        this.f43103c = i10;
    }

    public x6(int i10) {
        super(i10, true);
        this.f43103c = -1;
    }
}
