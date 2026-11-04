package org.telegram.ui;
public final class y5 extends sg.a {
    public final org.telegram.messenger.s2 f52193c;

    public y5(int i3, org.telegram.messenger.s2 s2Var) {
        super(i3, false);
        this.f52193c = s2Var;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.s2 s2Var;
        if (this == obj) {
            return true;
        }
        if (obj == null || y5.class != obj.getClass()) {
            return false;
        }
        y5 y5Var = (y5) obj;
        if (this.f54715a != y5Var.f54715a) {
            return false;
        }
        org.telegram.messenger.s2 s2Var2 = this.f52193c;
        if (s2Var2 == null || (s2Var = y5Var.f52193c) == null || s2Var2.f25268a == s2Var.f25268a) {
            return true;
        }
        return false;
    }
}
