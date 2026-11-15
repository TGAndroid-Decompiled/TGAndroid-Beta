package org.telegram.ui;
public final class wb implements Runnable {
    public final int f52528a;
    public final qc f52529b;

    public wb(qc qcVar, int i7) {
        this.f52528a = i7;
        this.f52529b = qcVar;
    }

    @Override
    public final void run() {
        int i7 = this.f52528a;
        qc qcVar = this.f52529b;
        switch (i7) {
            case 0:
                qc.Z(qcVar);
                return;
            default:
                org.telegram.messenger.k5.n(null, 2131752260, org.telegram.ui.Components.cc.a0(qcVar), 2131624000, 36);
                return;
        }
    }
}
