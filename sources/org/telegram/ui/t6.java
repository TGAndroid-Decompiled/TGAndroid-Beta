package org.telegram.ui;

import j$.util.Objects;
public final class t6 extends rg.a {
    public final int f52180c;
    public CharSequence d;
    public String f52181e;
    public int f52182f;
    public long f52183g;
    public int h;
    public boolean f52184i;
    public boolean f52185j;

    public t6(int i7, String str) {
        super(i7, true);
        this.f52180c = -1;
        this.d = str;
    }

    public static t6 b(int i7, long j3, String str, int i10) {
        t6 t6Var = new t6(11);
        t6Var.f52182f = i7;
        t6Var.d = str;
        t6Var.f52183g = j3;
        t6Var.h = i10;
        t6Var.f52185j = false;
        return t6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t6.class == obj.getClass()) {
                t6 t6Var = (t6) obj;
                int i7 = this.f56589a;
                if (i7 == t6Var.f56589a) {
                    if (i7 != 9 && i7 != 10 && i7 != 8 && i7 != 4 && i7 != 2 && i7 != 0 && i7 != 13) {
                        if (i7 == 3) {
                            return Objects.equals(this.d, t6Var.d);
                        }
                        if (i7 == 1) {
                            return Objects.equals(this.f52181e, t6Var.f52181e);
                        }
                        if (i7 == 11) {
                            if (this.f52182f != t6Var.f52182f || this.f52183g != t6Var.f52183g) {
                                return false;
                            }
                        } else if (i7 != 7 || this.f52180c != t6Var.f52180c) {
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
        this.f52180c = i7;
    }

    public t6(int i7) {
        super(i7, true);
        this.f52180c = -1;
    }
}
