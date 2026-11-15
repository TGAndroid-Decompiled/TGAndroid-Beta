package org.telegram.ui;
public final class wb implements Runnable {
    public final int f52525a;
    public final qc f52526b;

    public wb(qc qcVar, int i7) {
        this.f52525a = i7;
        this.f52526b = qcVar;
    }

    @Override
    public final void run() {
        int i7 = this.f52525a;
        qc qcVar = this.f52526b;
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
