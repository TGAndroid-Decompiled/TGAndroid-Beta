package org.telegram.ui;

import j$.util.Objects;
public final class s6 extends zf.a {
    public final int f42282c;
    public CharSequence d;
    public String f42283e;
    public int f42284f;
    public long f42285g;
    public int h;
    public boolean f42286i;
    public boolean f42287j;

    public s6(int i10, String str) {
        super(i10, true);
        this.f42282c = -1;
        this.d = str;
    }

    public static s6 b(int i10, long j10, String str, int i11) {
        s6 s6Var = new s6(11);
        s6Var.f42284f = i10;
        s6Var.d = str;
        s6Var.f42285g = j10;
        s6Var.h = i11;
        s6Var.f42287j = false;
        return s6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && s6.class == obj.getClass()) {
                s6 s6Var = (s6) obj;
                int i10 = this.f50845a;
                if (i10 == s6Var.f50845a) {
                    if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                        if (i10 == 3) {
                            return Objects.equals(this.d, s6Var.d);
                        }
                        if (i10 == 1) {
                            return Objects.equals(this.f42283e, s6Var.f42283e);
                        }
                        if (i10 == 11) {
                            if (this.f42284f != s6Var.f42284f || this.f42285g != s6Var.f42285g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f42282c != s6Var.f42282c) {
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

    public s6(int i10, int i11) {
        super(7, true);
        this.f42282c = i10;
    }

    public s6(int i10) {
        super(i10, true);
        this.f42282c = -1;
    }
}
