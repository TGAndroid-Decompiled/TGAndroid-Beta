package org.telegram.ui;
public final class y20 extends g.o {
    public final x50 f45826c;

    public y20(x50 x50Var) {
        this.f45826c = x50Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f45826c.f45549o2.e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
