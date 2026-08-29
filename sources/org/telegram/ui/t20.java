package org.telegram.ui;
public final class t20 extends f2.v {
    public final r50 f42530c;

    public t20(r50 r50Var) {
        this.f42530c = r50Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f42530c.f41912k2.f44470e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
