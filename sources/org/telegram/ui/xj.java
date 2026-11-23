package org.telegram.ui;
public final class xj extends org.telegram.ui.ActionBar.k5 {
    public final bn f53892x;

    public xj(bn bnVar, bj bjVar, ej ejVar) {
        super(bjVar, ejVar);
        this.f53892x = bnVar;
    }

    public final void m(int i7) {
        if (this.f53892x.f46132nb) {
            if (i7 == 0) {
                i7 = 1;
            } else if (i7 == 1) {
                i7 = 0;
            }
        }
        this.f29186b = i7;
    }
}
