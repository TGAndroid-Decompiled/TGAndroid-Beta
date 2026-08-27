package org.telegram.ui;

public final class za extends org.telegram.ui.ActionBar.n1 {

    public final qb f45119o;

    public za(qb qbVar, ya yaVar) {
        super(yaVar, -2, -2);
        this.f45119o = qbVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        qb qbVar = this.f45119o;
        if (qbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.ec.e();
        qbVar.F0 = null;
    }
}
