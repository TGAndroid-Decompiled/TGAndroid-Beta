package org.telegram.ui;

import j$.util.Objects;
public final class u6 extends og.a {
    public final int f37813c;
    public CharSequence d;
    public String e;
    public int f37814f;
    public long f37815g;
    public int h;
    public boolean f37816i;
    public boolean f37817j;

    public u6(int i10, String str) {
        super(i10, true);
        this.f37813c = -1;
        this.d = str;
    }

    public static u6 b(int i10, long j3, String str, int i11) {
        u6 u6Var = new u6(11);
        u6Var.f37814f = i10;
        u6Var.d = str;
        u6Var.f37815g = j3;
        u6Var.h = i11;
        u6Var.f37817j = false;
        return u6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u6.class == obj.getClass()) {
                u6 u6Var = (u6) obj;
                int i10 = this.f15531a;
                if (i10 == u6Var.f15531a) {
                    if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                        if (i10 == 3) {
                            return Objects.equals(this.d, u6Var.d);
                        }
                        if (i10 == 1) {
                            return Objects.equals(this.e, u6Var.e);
                        }
                        if (i10 == 11) {
                            if (this.f37814f != u6Var.f37814f || this.f37815g != u6Var.f37815g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f37813c != u6Var.f37813c) {
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

    public u6(int i10, int i11) {
        super(7, true);
        this.f37813c = i10;
    }

    public u6(int i10) {
        super(i10, true);
        this.f37813c = -1;
    }
}
