package org.telegram.ui;
public final class wb implements Runnable {
    public final int f53002a;
    public final qc f53003b;

    public wb(qc qcVar, int i7) {
        this.f53002a = i7;
        this.f53003b = qcVar;
    }

    @Override
    public final void run() {
        int i7 = this.f53002a;
        qc qcVar = this.f53003b;
        switch (i7) {
            case 0:
                qc.Z(qcVar);
                return;
            default:
                org.telegram.messenger.f3.n(null, 2131752249, org.telegram.ui.Components.lc.b0(qcVar), 2131624000, 36);
                return;
        }
    }
}
