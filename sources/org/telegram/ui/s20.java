package org.telegram.ui;

public final class s20 extends f2.w {

    public final s50 f42397c;

    public s20(s50 s50Var) {
        this.f42397c = s50Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f42397c.f42454k2.f44703e.size();
        if (size > 1 && size != 2) {
            return (size != 3 || i10 == 0 || i10 == 1) ? 3 : 6;
        }
        return 6;
    }
}
