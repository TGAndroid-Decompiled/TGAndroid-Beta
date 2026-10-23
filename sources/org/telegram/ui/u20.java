package org.telegram.ui;
public final class u20 extends g.o {
    public final u50 f42143c;

    public u20(u50 u50Var) {
        this.f42143c = u50Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f42143c.f42229o2.e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
