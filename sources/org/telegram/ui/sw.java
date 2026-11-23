package org.telegram.ui;
public final class sw implements Runnable {
    public final int f52092a = 1;
    public final tw f52093b;
    public final org.telegram.messenger.so f52094c;
    public final boolean d;

    public sw(tw twVar, org.telegram.messenger.so soVar, boolean z10) {
        this.f52093b = twVar;
        this.f52094c = soVar;
        this.d = z10;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g2 kzVar;
        switch (this.f52092a) {
            case 0:
                cx cxVar = this.f52093b.f52369b;
                if (this.d) {
                    kzVar = new FiltersSetupActivity();
                } else {
                    kzVar = new kz(this.f52094c, null);
                }
                cxVar.presentFragment(kzVar);
                return;
            default:
                this.f52093b.f52369b.getMessagesController().U4(this.f52094c, !this.d);
                return;
        }
    }

    public sw(tw twVar, boolean z10, org.telegram.messenger.so soVar) {
        this.f52093b = twVar;
        this.d = z10;
        this.f52094c = soVar;
    }
}
