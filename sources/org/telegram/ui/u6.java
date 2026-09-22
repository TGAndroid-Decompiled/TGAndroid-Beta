package org.telegram.ui;

import j$.util.Objects;
public final class u6 extends og.a {
    public final int f37969c;
    public CharSequence d;
    public String e;
    public int f37970f;
    public long f37971g;
    public int h;
    public boolean f37972i;
    public boolean f37973j;

    public u6(int i10, String str) {
        super(i10, true);
        this.f37969c = -1;
        this.d = str;
    }

    public static u6 b(int i10, long j3, String str, int i11) {
        u6 u6Var = new u6(11);
        u6Var.f37970f = i10;
        u6Var.d = str;
        u6Var.f37971g = j3;
        u6Var.h = i11;
        u6Var.f37973j = false;
        return u6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u6.class == obj.getClass()) {
                u6 u6Var = (u6) obj;
                int i10 = this.f15719a;
                if (i10 == u6Var.f15719a) {
                    if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                        if (i10 == 3) {
                            return Objects.equals(this.d, u6Var.d);
                        }
                        if (i10 == 1) {
                            return Objects.equals(this.e, u6Var.e);
                        }
                        if (i10 == 11) {
                            if (this.f37970f != u6Var.f37970f || this.f37971g != u6Var.f37971g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f37969c != u6Var.f37969c) {
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
        this.f37969c = i10;
    }

    public u6(int i10) {
        super(i10, true);
        this.f37969c = -1;
    }
}
