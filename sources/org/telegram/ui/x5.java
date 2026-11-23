package org.telegram.ui;
public final class x5 extends rg.a {
    public final org.telegram.messenger.t2 f53856c;

    public x5(int i7, org.telegram.messenger.t2 t2Var) {
        super(i7, false);
        this.f53856c = t2Var;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.t2 t2Var;
        if (this == obj) {
            return true;
        }
        if (obj == null || x5.class != obj.getClass()) {
            return false;
        }
        x5 x5Var = (x5) obj;
        if (this.f56712a != x5Var.f56712a) {
            return false;
        }
        org.telegram.messenger.t2 t2Var2 = this.f53856c;
        if (t2Var2 == null || (t2Var = x5Var.f53856c) == null || t2Var2.f27031a == t2Var.f27031a) {
            return true;
        }
        return false;
    }
}
