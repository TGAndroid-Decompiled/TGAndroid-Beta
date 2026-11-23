package org.telegram.ui;
public final class sw implements Runnable {
    public final int f52144a = 1;
    public final tw f52145b;
    public final org.telegram.messenger.so f52146c;
    public final boolean d;

    public sw(tw twVar, org.telegram.messenger.so soVar, boolean z10) {
        this.f52145b = twVar;
        this.f52146c = soVar;
        this.d = z10;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g2 kzVar;
        switch (this.f52144a) {
            case 0:
                cx cxVar = this.f52145b.f52405b;
                if (this.d) {
                    kzVar = new FiltersSetupActivity();
                } else {
                    kzVar = new kz(this.f52146c, null);
                }
                cxVar.presentFragment(kzVar);
                return;
            default:
                this.f52145b.f52405b.getMessagesController().U4(this.f52146c, !this.d);
                return;
        }
    }

    public sw(tw twVar, boolean z10, org.telegram.messenger.so soVar) {
        this.f52145b = twVar;
        this.d = z10;
        this.f52146c = soVar;
    }
}
