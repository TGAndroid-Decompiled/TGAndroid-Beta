package org.telegram.ui;
public final class w5 extends rg.a {
    public final org.telegram.messenger.t2 f52974c;

    public w5(int i7, org.telegram.messenger.t2 t2Var) {
        super(i7, false);
        this.f52974c = t2Var;
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
        if (this.f56630a != w5Var.f56630a) {
            return false;
        }
        org.telegram.messenger.t2 t2Var2 = this.f52974c;
        if (t2Var2 == null || (t2Var = w5Var.f52974c) == null || t2Var2.f26960a == t2Var.f26960a) {
            return true;
        }
        return false;
    }
}
