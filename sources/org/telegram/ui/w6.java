package org.telegram.ui;

import j$.util.Objects;
public final class w6 extends cg.b {
    public final int f42386c;
    public CharSequence d;
    public String f42387e;
    public int f42388f;
    public long f42389g;
    public int h;
    public boolean f42390i;
    public boolean f42391j;

    public w6(int i10, String str) {
        super(i10, true);
        this.f42386c = -1;
        this.d = str;
    }

    public static w6 b(int i10, long j10, String str, int i11) {
        w6 w6Var = new w6(11);
        w6Var.f42388f = i10;
        w6Var.d = str;
        w6Var.f42389g = j10;
        w6Var.h = i11;
        w6Var.f42391j = false;
        return w6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && w6.class == obj.getClass()) {
                w6 w6Var = (w6) obj;
                int i10 = this.f2505a;
                if (i10 == w6Var.f2505a) {
                    if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                        if (i10 == 3) {
                            return Objects.equals(this.d, w6Var.d);
                        }
                        if (i10 == 1) {
                            return Objects.equals(this.f42387e, w6Var.f42387e);
                        }
                        if (i10 == 11) {
                            if (this.f42388f != w6Var.f42388f || this.f42389g != w6Var.f42389g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f42386c != w6Var.f42386c) {
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
        this.f42386c = i10;
    }

    public w6(int i10) {
        super(i10, true);
        this.f42386c = -1;
    }
}
