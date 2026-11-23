package org.telegram.ui;
public final class rw implements Runnable {
    public final int f51901a = 1;
    public final sw f51902b;
    public final org.telegram.messenger.ro f51903c;
    public final boolean d;

    public rw(sw swVar, org.telegram.messenger.ro roVar, boolean z10) {
        this.f51902b = swVar;
        this.f51903c = roVar;
        this.d = z10;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g2 jzVar;
        switch (this.f51901a) {
            case 0:
                bx bxVar = this.f51902b.f52164b;
                if (this.d) {
                    jzVar = new FiltersSetupActivity();
                } else {
                    jzVar = new jz(this.f51903c, null);
                }
                bxVar.presentFragment(jzVar);
                return;
            default:
                this.f51902b.f52164b.getMessagesController().U4(this.f51903c, !this.d);
                return;
        }
    }

    public rw(sw swVar, boolean z10, org.telegram.messenger.ro roVar) {
        this.f51902b = swVar;
        this.d = z10;
        this.f51903c = roVar;
    }
}
