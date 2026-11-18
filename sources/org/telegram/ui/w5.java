package org.telegram.ui;
public final class w5 extends rg.a {
    public final org.telegram.messenger.t2 f52938c;

    public w5(int i7, org.telegram.messenger.t2 t2Var) {
        super(i7, false);
        this.f52938c = t2Var;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.t2 t2Var;
        if (this == obj) {
            return true;
        }
        if (obj == null || w5.class != obj.getClass()) {
            return false;
        }
        w5 w5Var = (w5) obj;
        if (this.f56589a != w5Var.f56589a) {
            return false;
        }
        org.telegram.messenger.t2 t2Var2 = this.f52938c;
        if (t2Var2 == null || (t2Var = w5Var.f52938c) == null || t2Var2.f26934a == t2Var.f26934a) {
            return true;
        }
        return false;
    }
}
