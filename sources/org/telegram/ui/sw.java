package org.telegram.ui;
public final class sw implements Runnable {
    public final int f52140a = 1;
    public final tw f52141b;
    public final org.telegram.messenger.ro f52142c;
    public final boolean d;

    public sw(tw twVar, org.telegram.messenger.ro roVar, boolean z10) {
        this.f52141b = twVar;
        this.f52142c = roVar;
        this.d = z10;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g2 kzVar;
        switch (this.f52140a) {
            case 0:
                cx cxVar = this.f52141b.f52401b;
                if (this.d) {
                    kzVar = new FiltersSetupActivity();
                } else {
                    kzVar = new kz(this.f52142c, null);
                }
                cxVar.presentFragment(kzVar);
                return;
            default:
                this.f52141b.f52401b.getMessagesController().U4(this.f52142c, !this.d);
                return;
        }
    }

    public sw(tw twVar, boolean z10, org.telegram.messenger.ro roVar) {
        this.f52141b = twVar;
        this.d = z10;
        this.f52142c = roVar;
    }
}
