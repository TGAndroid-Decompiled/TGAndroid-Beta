package org.telegram.ui;
public final class yk implements Runnable {
    public final int f44900a;
    public final zk f44901b;

    public yk(zk zkVar, int i10) {
        this.f44900a = i10;
        this.f44901b = zkVar;
    }

    @Override
    public final void run() {
        switch (this.f44900a) {
            case 0:
                dk dkVar = this.f44901b.D.U;
                if (dkVar != null) {
                    dkVar.P0 = false;
                    org.telegram.ui.Components.xf xfVar = dkVar.Q0;
                    if (xfVar != null) {
                        xfVar.u(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                dk dkVar2 = this.f44901b.D.U;
                if (dkVar2 != null) {
                    dkVar2.H0();
                    return;
                }
                return;
        }
    }
}
