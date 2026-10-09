package org.telegram.ui;

import j$.util.Objects;
public final class t6 extends og.a {
    public final int f41862c;
    public CharSequence d;
    public String f41863e;
    public int f41864f;
    public long f41865g;
    public int h;
    public boolean f41866i;
    public boolean f41867j;

    public t6(int i10, String str) {
        super(i10, true);
        this.f41862c = -1;
        this.d = str;
    }

    public static t6 b(int i10, long j3, String str, int i11) {
        t6 t6Var = new t6(11);
        t6Var.f41864f = i10;
        t6Var.d = str;
        t6Var.f41865g = j3;
        t6Var.h = i11;
        t6Var.f41867j = false;
        return t6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t6.class == obj.getClass()) {
                t6 t6Var = (t6) obj;
                int i10 = this.f17125a;
                if (i10 == t6Var.f17125a) {
                    if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                        if (i10 == 3) {
                            return Objects.equals(this.d, t6Var.d);
                        }
                        if (i10 == 1) {
                            return Objects.equals(this.f41863e, t6Var.f41863e);
                        }
                        if (i10 == 11) {
                            if (this.f41864f != t6Var.f41864f || this.f41865g != t6Var.f41865g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f41862c != t6Var.f41862c) {
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
        this.f41862c = i10;
    }

    public t6(int i10) {
        super(i10, true);
        this.f41862c = -1;
    }
}
