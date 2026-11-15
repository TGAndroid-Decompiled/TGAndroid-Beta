package org.telegram.ui;
public final class x5 extends rg.a {
    public final org.telegram.messenger.s2 f53096c;

    public x5(int i7, org.telegram.messenger.s2 s2Var) {
        super(i7, false);
        this.f53096c = s2Var;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.s2 s2Var;
        if (this == obj) {
            return true;
        }
        if (obj == null || x5.class != obj.getClass()) {
            return false;
        }
        x5 x5Var = (x5) obj;
        if (this.f56015a != x5Var.f56015a) {
            return false;
        }
        org.telegram.messenger.s2 s2Var2 = this.f53096c;
        if (s2Var2 == null || (s2Var = x5Var.f53096c) == null || s2Var2.f26401a == s2Var.f26401a) {
            return true;
        }
        return false;
    }
}
