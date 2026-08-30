package org.telegram.ui;

import j$.util.Objects;
public final class w6 extends bg.b {
    public final int f39341c;
    public CharSequence d;
    public String e;
    public int f39342f;
    public long f39343g;
    public int h;
    public boolean f39344i;
    public boolean f39345j;

    public w6(int i10, String str) {
        super(i10, true);
        this.f39341c = -1;
        this.d = str;
    }

    public static w6 b(int i10, long j10, String str, int i11) {
        w6 w6Var = new w6(11);
        w6Var.f39342f = i10;
        w6Var.d = str;
        w6Var.f39343g = j10;
        w6Var.h = i11;
        w6Var.f39345j = false;
        return w6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && w6.class == obj.getClass()) {
                w6 w6Var = (w6) obj;
                int i10 = this.f1808a;
                if (i10 == w6Var.f1808a) {
                    if (i10 != 9 && i10 != 10 && i10 != 8 && i10 != 4 && i10 != 2 && i10 != 0 && i10 != 13) {
                        if (i10 == 3) {
                            return Objects.equals(this.d, w6Var.d);
                        }
                        if (i10 == 1) {
                            return Objects.equals(this.e, w6Var.e);
                        }
                        if (i10 == 11) {
                            if (this.f39342f != w6Var.f39342f || this.f39343g != w6Var.f39343g) {
                                return false;
                            }
                        } else if (i10 != 7 || this.f39341c != w6Var.f39341c) {
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
        this.f39341c = i10;
    }

    public w6(int i10) {
        super(i10, true);
        this.f39341c = -1;
    }
}
