package org.telegram.ui;

import j$.util.Objects;
public final class v6 extends sg.a {
    public final int f50399c;
    public CharSequence d;
    public String f50400e;
    public int f50401f;
    public long f50402g;
    public int h;
    public boolean f50403i;
    public boolean f50404j;

    public v6(int i3, String str) {
        super(i3, true);
        this.f50399c = -1;
        this.d = str;
    }

    public static v6 b(int i3, long j10, String str, int i10) {
        v6 v6Var = new v6(11);
        v6Var.f50401f = i3;
        v6Var.d = str;
        v6Var.f50402g = j10;
        v6Var.h = i10;
        v6Var.f50404j = false;
        return v6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v6.class == obj.getClass()) {
                v6 v6Var = (v6) obj;
                int i3 = this.f54715a;
                if (i3 == v6Var.f54715a) {
                    if (i3 != 9 && i3 != 10 && i3 != 8 && i3 != 4 && i3 != 2 && i3 != 0 && i3 != 13) {
                        if (i3 == 3) {
                            return Objects.equals(this.d, v6Var.d);
                        }
                        if (i3 == 1) {
                            return Objects.equals(this.f50400e, v6Var.f50400e);
                        }
                        if (i3 == 11) {
                            if (this.f50401f != v6Var.f50401f || this.f50402g != v6Var.f50402g) {
                                return false;
                            }
                        } else if (i3 != 7 || this.f50399c != v6Var.f50399c) {
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

    public v6(int i3, int i10) {
        super(7, true);
        this.f50399c = i3;
    }

    public v6(int i3) {
        super(i3, true);
        this.f50399c = -1;
    }
}
