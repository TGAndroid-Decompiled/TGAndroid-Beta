package org.telegram.ui;

import j$.util.Objects;
public final class s6 extends og.a {
    public final int f41626c;
    public CharSequence d;
    public String f41627e;
    public int f41628f;
    public long f41629g;
    public int h;
    public boolean f41630i;
    public boolean f41631j;

    public s6(int i10, String str) {
        super(i10, true);
        this.f41626c = -1;
        this.d = str;
    }

    public static s6 b(int i10, long j3, String str, int i11) {
        s6 s6Var = new s6(11);
        s6Var.f41628f = i10;
        s6Var.d = str;
        s6Var.f41629g = j3;
        s6Var.h = i11;
        s6Var.f41631j = false;
        return s6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && s6.class == obj.getClass()) {
                s6 s6Var = (s6) obj;
                int i10 = this.f17211a;
                if (i10 == s6Var.f17211a) {
                    if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                        if (i10 == 3) {
                            return Objects.equals(this.d, s6Var.d);
                        }
                        if (i10 == 1) {
                            return Objects.equals(this.f41627e, s6Var.f41627e);
                        }
                        if (i10 == 11) {
                            if (this.f41628f != s6Var.f41628f || this.f41629g != s6Var.f41629g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f41626c != s6Var.f41626c) {
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
        this.f41626c = i10;
    }

    public s6(int i10) {
        super(i10, true);
        this.f41626c = -1;
    }
}
