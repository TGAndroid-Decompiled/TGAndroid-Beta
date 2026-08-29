package org.telegram.ui;
public final class xa extends org.telegram.ui.ActionBar.o1 {
    public final ob f44534o;

    public xa(ob obVar, wa waVar) {
        super(waVar, -2, -2);
        this.f44534o = obVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ob obVar = this.f44534o;
        if (obVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.mc.e();
        obVar.F0 = null;
    }
}
