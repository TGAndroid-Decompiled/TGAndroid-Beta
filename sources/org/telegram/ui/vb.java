package org.telegram.ui;
public final class vb implements Runnable {
    public final int f50439a;
    public final pc f50440b;

    public vb(pc pcVar, int i3) {
        this.f50439a = i3;
        this.f50440b = pcVar;
    }

    @Override
    public final void run() {
        int i3 = this.f50439a;
        pc pcVar = this.f50440b;
        switch (i3) {
            case 0:
                pc.Z(pcVar);
                return;
            default:
                org.telegram.messenger.k5.o(null, 2131752260, org.telegram.ui.Components.fc.a0(pcVar), 2131623999, 36);
                return;
        }
    }
}
