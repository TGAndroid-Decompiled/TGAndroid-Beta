package org.telegram.ui;
public final class r20 extends g.o {
    public final q50 f41037c;

    public r20(q50 q50Var) {
        this.f41037c = q50Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f41037c.f40433o2.e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
