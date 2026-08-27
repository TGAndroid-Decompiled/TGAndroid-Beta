package org.telegram.ui;

public final class xk implements Runnable {

    public final int f44474a;

    public final yk f44475b;

    public xk(yk ykVar, int i10) {
        this.f44474a = i10;
        this.f44475b = ykVar;
    }

    @Override
    public final void run() {
        switch (this.f44474a) {
            case 0:
                ck ckVar = this.f44475b.D.U;
                if (ckVar != null) {
                    ckVar.P0 = false;
                    org.telegram.ui.Components.qf qfVar = ckVar.Q0;
                    if (qfVar != null) {
                        qfVar.v(false);
                    }
                }
                break;
            default:
                ck ckVar2 = this.f44475b.D.U;
                if (ckVar2 != null) {
                    ckVar2.H0();
                }
                break;
        }
    }
}
