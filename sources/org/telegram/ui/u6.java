package org.telegram.ui;

import j$.util.Objects;

public final class u6 extends xf.a {

    public final int f43127c;
    public CharSequence d;

    public String f43128e;

    public int f43129f;

    public long f43130g;
    public int h;

    public boolean f43131i;

    public boolean f43132j;

    public u6(int i10, String str) {
        super(i10, true);
        this.f43127c = -1;
        this.d = str;
    }

    public static u6 b(int i10, long j10, String str, int i11) {
        u6 u6Var = new u6(11);
        u6Var.f43129f = i10;
        u6Var.d = str;
        u6Var.f43130g = j10;
        u6Var.h = i11;
        u6Var.f43132j = false;
        return u6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || u6.class != obj.getClass()) {
                return false;
            }
            u6 u6Var = (u6) obj;
            int i10 = this.f49413a;
            if (i10 != u6Var.f49413a) {
                return false;
            }
            if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                if (i10 == 3) {
                    return Objects.equals(this.d, u6Var.d);
                }
                if (i10 == 1) {
                    return Objects.equals(this.f43128e, u6Var.f43128e);
                }
                if (i10 == 11) {
                    if (this.f43129f != u6Var.f43129f || this.f43130g != u6Var.f43130g) {
                        return false;
                    }
                } else if (i10 != 7 || this.f43127c != u6Var.f43127c) {
                    return false;
                }
            }
        }
        return true;
    }

    public u6(int i10, int i11) {
        super(7, true);
        this.f43127c = i10;
    }

    public u6(int i10) {
        super(i10, true);
        this.f43127c = -1;
    }
}
