package org.telegram.ui;
public final class rk extends org.telegram.ui.Components.bl0 {
    public final wn f37370l;

    public rk(wn wnVar, rj rjVar, uj ujVar) {
        super(rjVar, ujVar);
        this.f37370l = wnVar;
    }

    public final void e(int i10) {
        if (this.f37370l.Pa) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.f23042b = i10;
    }
}
