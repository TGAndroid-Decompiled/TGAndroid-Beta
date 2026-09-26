package org.telegram.ui;
public final class rk extends org.telegram.ui.Components.al0 {
    public final wn f37369l;

    public rk(wn wnVar, rj rjVar, uj ujVar) {
        super(rjVar, ujVar);
        this.f37369l = wnVar;
    }

    public final void e(int i10) {
        if (this.f37369l.Pa) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.f22685b = i10;
    }
}
