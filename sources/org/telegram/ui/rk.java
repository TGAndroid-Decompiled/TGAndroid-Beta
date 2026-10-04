package org.telegram.ui;
public final class rk extends org.telegram.ui.Components.bl0 {
    public final yn f40151l;

    public rk(yn ynVar, sj sjVar, vj vjVar) {
        super(sjVar, vjVar);
        this.f40151l = ynVar;
    }

    public final void f(int i10) {
        if (this.f40151l.Na) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.f24994b = i10;
    }
}
