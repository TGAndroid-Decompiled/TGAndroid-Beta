package org.telegram.ui;
public final class wb implements Runnable {
    public final int f53276a;
    public final qc f53277b;

    public wb(qc qcVar, int i7) {
        this.f53276a = i7;
        this.f53277b = qcVar;
    }

    @Override
    public final void run() {
        int i7 = this.f53276a;
        qc qcVar = this.f53277b;
        switch (i7) {
            case 0:
                qc.Z(qcVar);
                return;
            default:
                org.telegram.messenger.f3.n(null, 2131752248, org.telegram.ui.Components.kc.b0(qcVar), 2131624000, 36);
                return;
        }
    }
}
