package org.telegram.ui;

import j$.util.Objects;
public final class w6 extends og.a {
    public final int f43047c;
    public CharSequence d;
    public String f43048e;
    public int f43049f;
    public long f43050g;
    public int h;
    public boolean f43051i;
    public boolean f43052j;

    public w6(int i10, String str) {
        super(i10, true);
        this.f43047c = -1;
        this.d = str;
    }

    public static w6 b(int i10, long j3, String str, int i11) {
        w6 w6Var = new w6(11);
        w6Var.f43049f = i10;
        w6Var.d = str;
        w6Var.f43050g = j3;
        w6Var.h = i11;
        w6Var.f43052j = false;
        return w6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && w6.class == obj.getClass()) {
                w6 w6Var = (w6) obj;
                int i10 = this.f16877a;
                if (i10 == w6Var.f16877a) {
                    if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                        if (i10 == 3) {
                            return Objects.equals(this.d, w6Var.d);
                        }
                        if (i10 == 1) {
                            return Objects.equals(this.f43048e, w6Var.f43048e);
                        }
                        if (i10 == 11) {
                            if (this.f43049f != w6Var.f43049f || this.f43050g != w6Var.f43050g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f43047c != w6Var.f43047c) {
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

    public w6(int i10, int i11) {
        super(7, true);
        this.f43047c = i10;
    }

    public w6(int i10) {
        super(i10, true);
        this.f43047c = -1;
    }
}
