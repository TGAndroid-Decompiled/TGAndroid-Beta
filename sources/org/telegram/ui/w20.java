package org.telegram.ui;
public final class w20 extends g.o {
    public final v50 f44958c;

    public w20(v50 v50Var) {
        this.f44958c = v50Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f44958c.f44668o2.e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
