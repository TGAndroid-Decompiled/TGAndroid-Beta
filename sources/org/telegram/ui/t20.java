package org.telegram.ui;
public final class t20 extends g.o {
    public final s50 f41592c;

    public t20(s50 s50Var) {
        this.f41592c = s50Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f41592c.f40992o2.e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
