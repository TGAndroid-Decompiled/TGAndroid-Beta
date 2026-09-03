package org.telegram.ui;

import j$.util.Objects;
public final class w6 extends cg.b {
    public final int f42293c;
    public CharSequence d;
    public String f42294e;
    public int f42295f;
    public long f42296g;
    public int h;
    public boolean f42297i;
    public boolean f42298j;

    public w6(int i10, String str) {
        super(i10, true);
        this.f42293c = -1;
        this.d = str;
    }

    public static w6 b(int i10, long j10, String str, int i11) {
        w6 w6Var = new w6(11);
        w6Var.f42295f = i10;
        w6Var.d = str;
        w6Var.f42296g = j10;
        w6Var.h = i11;
        w6Var.f42298j = false;
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
                            return Objects.equals(this.f42294e, w6Var.f42294e);
                        }
                        if (i10 == 11) {
                            if (this.f42295f != w6Var.f42295f || this.f42296g != w6Var.f42296g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f42293c != w6Var.f42293c) {
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
        this.f42293c = i10;
    }

    public w6(int i10) {
        super(i10, true);
        this.f42293c = -1;
    }
}
