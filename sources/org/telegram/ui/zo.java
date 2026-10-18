package org.telegram.ui;
public final class zo implements Runnable {
    public final int f43809a;
    public final kp f43810b;

    public zo(kp kpVar, int i10) {
        this.f43809a = i10;
        this.f43810b = kpVar;
    }

    @Override
    public final void run() {
        switch (this.f43809a) {
            case 0:
                kp kpVar = this.f43810b;
                org.telegram.ui.ActionBar.b2 b2Var = kpVar.f38633r;
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new jg(kpVar, 2));
                    kpVar.showDialog(kpVar.f38633r);
                    return;
                }
                return;
            case 1:
                kp kpVar2 = this.f43810b;
                kpVar2.getMessagesController().loadFullChat(kpVar2.E, 0, true);
                return;
            default:
                kp kpVar3 = this.f43810b;
                kpVar3.getMessagesController().loadFullChat(kpVar3.E, 0, true);
                return;
        }
    }
}
