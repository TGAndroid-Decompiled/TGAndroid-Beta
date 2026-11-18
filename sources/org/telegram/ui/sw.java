package org.telegram.ui;
public final class sw implements Runnable {
    public final int f52090a = 1;
    public final tw f52091b;
    public final org.telegram.messenger.ro f52092c;
    public final boolean d;

    public sw(tw twVar, org.telegram.messenger.ro roVar, boolean z10) {
        this.f52091b = twVar;
        this.f52092c = roVar;
        this.d = z10;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.h2 kzVar;
        switch (this.f52090a) {
            case 0:
                cx cxVar = this.f52091b.f52368b;
                if (this.d) {
                    kzVar = new FiltersSetupActivity();
                } else {
                    kzVar = new kz(this.f52092c, null);
                }
                cxVar.presentFragment(kzVar);
                return;
            default:
                this.f52091b.f52368b.getMessagesController().U4(this.f52092c, !this.d);
                return;
        }
    }

    public sw(tw twVar, boolean z10, org.telegram.messenger.ro roVar) {
        this.f52091b = twVar;
        this.d = z10;
        this.f52092c = roVar;
    }
}
