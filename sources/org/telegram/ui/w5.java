package org.telegram.ui;
public final class w5 extends hg.b {
    public final org.telegram.messenger.w2 f42879c;

    public w5(int i10, org.telegram.messenger.w2 w2Var) {
        super(i10, false);
        this.f42879c = w2Var;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.w2 w2Var;
        if (this == obj) {
            return true;
        }
        if (obj == null || w5.class != obj.getClass()) {
            return false;
        }
        w5 w5Var = (w5) obj;
        if (this.f7680a != w5Var.f7680a) {
            return false;
        }
        org.telegram.messenger.w2 w2Var2 = this.f42879c;
        if (w2Var2 == null || (w2Var = w5Var.f42879c) == null || w2Var2.f19043a == w2Var.f19043a) {
            return true;
        }
        return false;
    }
}
