package org.telegram.ui;

import j$.util.Objects;
public final class y6 extends bg.b {
    public final int f40152c;
    public CharSequence d;
    public String e;
    public int f40153f;
    public long f40154g;
    public int h;
    public boolean f40155i;
    public boolean f40156j;

    public y6(int i10, String str) {
        super(i10, true);
        this.f40152c = -1;
        this.d = str;
    }

    public static y6 b(int i10, long j10, String str, int i11) {
        y6 y6Var = new y6(11);
        y6Var.f40153f = i10;
        y6Var.d = str;
        y6Var.f40154g = j10;
        y6Var.h = i11;
        y6Var.f40156j = false;
        return y6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && y6.class == obj.getClass()) {
                y6 y6Var = (y6) obj;
                int i10 = this.f1830a;
                if (i10 == y6Var.f1830a) {
                    if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                        if (i10 == 3) {
                            return Objects.equals(this.d, y6Var.d);
                        }
                        if (i10 == 1) {
                            return Objects.equals(this.e, y6Var.e);
                        }
                        if (i10 == 11) {
                            if (this.f40153f != y6Var.f40153f || this.f40154g != y6Var.f40154g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f40152c != y6Var.f40152c) {
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

    public y6(int i10, int i11) {
        super(7, true);
        this.f40152c = i10;
    }

    public y6(int i10) {
        super(i10, true);
        this.f40152c = -1;
    }
}
