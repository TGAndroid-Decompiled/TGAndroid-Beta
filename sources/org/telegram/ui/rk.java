package org.telegram.ui;
public final class rk extends org.telegram.ui.Components.cl0 {
    public final wn f37466l;

    public rk(wn wnVar, rj rjVar, uj ujVar) {
        super(rjVar, ujVar);
        this.f37466l = wnVar;
    }

    public final void f(int i10) {
        if (this.f37466l.Pa) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.f23356b = i10;
    }
}
