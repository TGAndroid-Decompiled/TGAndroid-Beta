package org.telegram.ui;

import j$.util.Objects;
public final class w6 extends og.a {
    public final int f41923c;
    public CharSequence d;
    public String f41924e;
    public int f41925f;
    public long f41926g;
    public int h;
    public boolean f41927i;
    public boolean f41928j;

    public w6(int i10, String str) {
        super(i10, true);
        this.f41923c = -1;
        this.d = str;
    }

    public static w6 b(int i10, long j3, String str, int i11) {
        w6 w6Var = new w6(11);
        w6Var.f41925f = i10;
        w6Var.d = str;
        w6Var.f41926g = j3;
        w6Var.h = i11;
        w6Var.f41928j = false;
        return w6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && w6.class == obj.getClass()) {
                w6 w6Var = (w6) obj;
                int i10 = this.f17182a;
                if (i10 == w6Var.f17182a) {
                    if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                        if (i10 == 3) {
                            return Objects.equals(this.d, w6Var.d);
                        }
                        if (i10 == 1) {
                            return Objects.equals(this.f41924e, w6Var.f41924e);
                        }
                        if (i10 == 11) {
                            if (this.f41925f != w6Var.f41925f || this.f41926g != w6Var.f41926g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f41923c != w6Var.f41923c) {
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
        this.f41923c = i10;
    }

    public w6(int i10) {
        super(i10, true);
        this.f41923c = -1;
    }
}
