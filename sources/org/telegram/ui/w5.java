package org.telegram.ui;
public final class w5 extends rg.a {
    public final org.telegram.messenger.s2 f50901c;

    public w5(int i7, org.telegram.messenger.s2 s2Var) {
        super(i7, false);
        this.f50901c = s2Var;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.s2 s2Var;
        if (this == obj) {
            return true;
        }
        if (obj == null || w5.class != obj.getClass()) {
            return false;
        }
        w5 w5Var = (w5) obj;
        if (this.f54531a != w5Var.f54531a) {
            return false;
        }
        org.telegram.messenger.s2 s2Var2 = this.f50901c;
        if (s2Var2 == null || (s2Var = w5Var.f50901c) == null || s2Var2.f25407a == s2Var.f25407a) {
            return true;
        }
        return false;
    }
}
