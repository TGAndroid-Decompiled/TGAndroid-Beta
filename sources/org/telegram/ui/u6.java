package org.telegram.ui;

import j$.util.Objects;
public final class u6 extends hg.b {
    public final int f41830c;
    public CharSequence d;
    public String e;
    public int f41831f;
    public long f41832g;
    public int h;
    public boolean f41833i;
    public boolean f41834j;

    public u6(int i10, String str) {
        super(i10, true);
        this.f41830c = -1;
        this.d = str;
    }

    public static u6 b(int i10, long j10, String str, int i11) {
        u6 u6Var = new u6(11);
        u6Var.f41831f = i10;
        u6Var.d = str;
        u6Var.f41832g = j10;
        u6Var.h = i11;
        u6Var.f41834j = false;
        return u6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u6.class == obj.getClass()) {
                u6 u6Var = (u6) obj;
                int i10 = this.f7681a;
                if (i10 == u6Var.f7681a) {
                    if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                        if (i10 == 3) {
                            return Objects.equals(this.d, u6Var.d);
                        }
                        if (i10 == 1) {
                            return Objects.equals(this.e, u6Var.e);
                        }
                        if (i10 == 11) {
                            if (this.f41831f != u6Var.f41831f || this.f41832g != u6Var.f41832g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f41830c != u6Var.f41830c) {
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
        this.f41830c = i10;
    }

    public u6(int i10) {
        super(i10, true);
        this.f41830c = -1;
    }
}
