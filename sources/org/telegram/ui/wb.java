package org.telegram.ui;
public final class wb implements Runnable {
    public final int f53048a;
    public final qc f53049b;

    public wb(qc qcVar, int i7) {
        this.f53048a = i7;
        this.f53049b = qcVar;
    }

    @Override
    public final void run() {
        int i7 = this.f53048a;
        qc qcVar = this.f53049b;
        switch (i7) {
            case 0:
                qc.Z(qcVar);
                return;
            default:
                org.telegram.messenger.f3.n(null, 2131752248, org.telegram.ui.Components.lc.b0(qcVar), 2131624000, 36);
                return;
        }
    }
}
