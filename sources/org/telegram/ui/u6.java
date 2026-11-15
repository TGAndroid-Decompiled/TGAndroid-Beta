package org.telegram.ui;

import j$.util.Objects;
public final class u6 extends rg.a {
    public final int f51773c;
    public CharSequence d;
    public String f51774e;
    public int f51775f;
    public long f51776g;
    public int h;
    public boolean f51777i;
    public boolean f51778j;

    public u6(int i7, String str) {
        super(i7, true);
        this.f51773c = -1;
        this.d = str;
    }

    public static u6 b(int i7, long j3, String str, int i10) {
        u6 u6Var = new u6(11);
        u6Var.f51775f = i7;
        u6Var.d = str;
        u6Var.f51776g = j3;
        u6Var.h = i10;
        u6Var.f51778j = false;
        return u6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u6.class == obj.getClass()) {
                u6 u6Var = (u6) obj;
                int i7 = this.f56015a;
                if (i7 == u6Var.f56015a) {
                    if (i7 != 9 && i7 != 10 && i7 != 8 && i7 != 4 && i7 != 2 && i7 != 0 && i7 != 13) {
                        if (i7 == 3) {
                            return Objects.equals(this.d, u6Var.d);
                        }
                        if (i7 == 1) {
                            return Objects.equals(this.f51774e, u6Var.f51774e);
                        }
                        if (i7 == 11) {
                            if (this.f51775f != u6Var.f51775f || this.f51776g != u6Var.f51776g) {
                                return false;
                            }
                        } else if (i7 != 7 || this.f51773c != u6Var.f51773c) {
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

    public u6(int i7, int i10) {
        super(7, true);
        this.f51773c = i7;
    }

    public u6(int i7) {
        super(i7, true);
        this.f51773c = -1;
    }
}
