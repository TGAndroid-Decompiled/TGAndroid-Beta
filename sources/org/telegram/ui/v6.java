package org.telegram.ui;

import j$.util.Objects;
public final class v6 extends og.a {
    public final int f38299c;
    public CharSequence d;
    public String e;
    public int f38300f;
    public long f38301g;
    public int h;
    public boolean f38302i;
    public boolean f38303j;

    public v6(int i10, String str) {
        super(i10, true);
        this.f38299c = -1;
        this.d = str;
    }

    public static v6 b(int i10, long j3, String str, int i11) {
        v6 v6Var = new v6(11);
        v6Var.f38300f = i10;
        v6Var.d = str;
        v6Var.f38301g = j3;
        v6Var.h = i11;
        v6Var.f38303j = false;
        return v6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v6.class == obj.getClass()) {
                v6 v6Var = (v6) obj;
                int i10 = this.f15543a;
                if (i10 == v6Var.f15543a) {
                    if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                        if (i10 == 3) {
                            return Objects.equals(this.d, v6Var.d);
                        }
                        if (i10 == 1) {
                            return Objects.equals(this.e, v6Var.e);
                        }
                        if (i10 == 11) {
                            if (this.f38300f != v6Var.f38300f || this.f38301g != v6Var.f38301g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f38299c != v6Var.f38299c) {
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

    public v6(int i10, int i11) {
        super(7, true);
        this.f38299c = i10;
    }

    public v6(int i10) {
        super(i10, true);
        this.f38299c = -1;
    }
}
