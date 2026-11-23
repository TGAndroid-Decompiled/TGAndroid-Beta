package org.telegram.ui;
public final class xj extends org.telegram.ui.ActionBar.k5 {
    public final bn f53814x;

    public xj(bn bnVar, bj bjVar, ej ejVar) {
        super(bjVar, ejVar);
        this.f53814x = bnVar;
    }

    public final void m(int i7) {
        if (this.f53814x.f46085nb) {
            if (i7 == 0) {
                i7 = 1;
            } else if (i7 == 1) {
                i7 = 0;
            }
        }
        this.f29152b = i7;
    }
}
