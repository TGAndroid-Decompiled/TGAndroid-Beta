package org.telegram.ui;
public final class w5 extends rg.a {
    public final org.telegram.messenger.s2 f50952c;

    public w5(int i7, org.telegram.messenger.s2 s2Var) {
        super(i7, false);
        this.f50952c = s2Var;
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
        if (this.f54415a != w5Var.f54415a) {
            return false;
        }
        org.telegram.messenger.s2 s2Var2 = this.f50952c;
        if (s2Var2 == null || (s2Var = w5Var.f50952c) == null || s2Var2.f25403a == s2Var.f25403a) {
            return true;
        }
        return false;
    }
}
