package org.telegram.ui;

import j$.util.Objects;
public final class w6 extends og.a {
    public final int f41939c;
    public CharSequence d;
    public String f41940e;
    public int f41941f;
    public long f41942g;
    public int h;
    public boolean f41943i;
    public boolean f41944j;

    public w6(int i10, String str) {
        super(i10, true);
        this.f41939c = -1;
        this.d = str;
    }

    public static w6 b(int i10, long j3, String str, int i11) {
        w6 w6Var = new w6(11);
        w6Var.f41941f = i10;
        w6Var.d = str;
        w6Var.f41942g = j3;
        w6Var.h = i11;
        w6Var.f41944j = false;
        return w6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && w6.class == obj.getClass()) {
                w6 w6Var = (w6) obj;
                int i10 = this.f17192a;
                if (i10 == w6Var.f17192a) {
                    if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                        if (i10 == 3) {
                            return Objects.equals(this.d, w6Var.d);
                        }
                        if (i10 == 1) {
                            return Objects.equals(this.f41940e, w6Var.f41940e);
                        }
                        if (i10 == 11) {
                            if (this.f41941f != w6Var.f41941f || this.f41942g != w6Var.f41942g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f41939c != w6Var.f41939c) {
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
        this.f41939c = i10;
    }

    public w6(int i10) {
        super(i10, true);
        this.f41939c = -1;
    }
}
