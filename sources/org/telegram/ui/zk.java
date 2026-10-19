package org.telegram.ui;
public final class zk implements Runnable {
    public final int f43762a;
    public final al f43763b;

    public zk(al alVar, int i10) {
        this.f43762a = i10;
        this.f43763b = alVar;
    }

    @Override
    public final void run() {
        switch (this.f43762a) {
            case 0:
                fk fkVar = this.f43763b.H.Y;
                if (fkVar != null) {
                    fkVar.T0 = false;
                    org.telegram.ui.Components.dg dgVar = fkVar.U0;
                    if (dgVar != null) {
                        dgVar.v(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                fk fkVar2 = this.f43763b.H.Y;
                if (fkVar2 != null) {
                    fkVar2.F0();
                    return;
                }
                return;
        }
    }
}
