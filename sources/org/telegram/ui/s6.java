package org.telegram.ui;

import j$.util.Objects;
public final class s6 extends og.a {
    public final int f41592c;
    public CharSequence d;
    public String f41593e;
    public int f41594f;
    public long f41595g;
    public int h;
    public boolean f41596i;
    public boolean f41597j;

    public s6(int i10, String str) {
        super(i10, true);
        this.f41592c = -1;
        this.d = str;
    }

    public static s6 b(int i10, long j3, String str, int i11) {
        s6 s6Var = new s6(11);
        s6Var.f41594f = i10;
        s6Var.d = str;
        s6Var.f41595g = j3;
        s6Var.h = i11;
        s6Var.f41597j = false;
        return s6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && s6.class == obj.getClass()) {
                s6 s6Var = (s6) obj;
                int i10 = this.f17175a;
                if (i10 == s6Var.f17175a) {
                    if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                        if (i10 == 3) {
                            return Objects.equals(this.d, s6Var.d);
                        }
                        if (i10 == 1) {
                            return Objects.equals(this.f41593e, s6Var.f41593e);
                        }
                        if (i10 == 11) {
                            if (this.f41594f != s6Var.f41594f || this.f41595g != s6Var.f41595g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f41592c != s6Var.f41592c) {
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
        this.f41592c = i10;
    }

    public s6(int i10) {
        super(i10, true);
        this.f41592c = -1;
    }
}
