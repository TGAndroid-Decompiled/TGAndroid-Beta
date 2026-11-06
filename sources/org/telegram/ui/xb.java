package org.telegram.ui;
public final class xb implements Runnable {
    public final int f51799a;
    public final rc f51800b;

    public xb(rc rcVar, int i7) {
        this.f51799a = i7;
        this.f51800b = rcVar;
    }

    @Override
    public final void run() {
        int i7 = this.f51799a;
        rc rcVar = this.f51800b;
        switch (i7) {
            case 0:
                rc.Z(rcVar);
                return;
            default:
                org.telegram.messenger.k5.o(null, 2131752260, org.telegram.ui.Components.hc.a0(rcVar), 2131623999, 36);
                return;
        }
    }
}
