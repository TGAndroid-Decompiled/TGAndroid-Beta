package org.telegram.ui;

import j$.util.Objects;
public final class t6 extends wf.a {
    public final int f42863c;
    public CharSequence d;
    public String f42864e;
    public int f42865f;
    public long f42866g;
    public int h;
    public boolean f42867i;
    public boolean f42868j;

    public t6(int i9, String str) {
        super(i9, true);
        this.f42863c = -1;
        this.d = str;
    }

    public static t6 b(int i9, long j10, String str, int i10) {
        t6 t6Var = new t6(11);
        t6Var.f42865f = i9;
        t6Var.d = str;
        t6Var.f42866g = j10;
        t6Var.h = i10;
        t6Var.f42868j = false;
        return t6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t6.class == obj.getClass()) {
                t6 t6Var = (t6) obj;
                int i9 = this.f48814a;
                if (i9 == t6Var.f48814a) {
                    if (i9 != 9 && i9 != 10 && i9 != 8 && i9 != 4 && i9 != 2 && i9 != 0 && i9 != 13) {
                        if (i9 == 3) {
                            return Objects.equals(this.d, t6Var.d);
                        }
                        if (i9 == 1) {
                            return Objects.equals(this.f42864e, t6Var.f42864e);
                        }
                        if (i9 == 11) {
                            if (this.f42865f != t6Var.f42865f || this.f42866g != t6Var.f42866g) {
                                return false;
                            }
                        } else if (i9 != 7 || this.f42863c != t6Var.f42863c) {
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

    public t6(int i9, int i10) {
        super(7, true);
        this.f42863c = i9;
    }

    public t6(int i9) {
        super(i9, true);
        this.f42863c = -1;
    }
}
