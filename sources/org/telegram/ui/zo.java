package org.telegram.ui;
public final class zo implements Runnable {
    public final int f44188a;
    public final kp f44189b;

    public zo(kp kpVar, int i10) {
        this.f44188a = i10;
        this.f44189b = kpVar;
    }

    @Override
    public final void run() {
        switch (this.f44188a) {
            case 0:
                kp kpVar = this.f44189b;
                org.telegram.ui.ActionBar.c2 c2Var = kpVar.f38993r;
                if (c2Var != null) {
                    c2Var.setOnCancelListener(new gg(kpVar, 2));
                    kpVar.showDialog(kpVar.f38993r);
                    return;
                }
                return;
            case 1:
                kp kpVar2 = this.f44189b;
                kpVar2.getMessagesController().loadFullChat(kpVar2.E, 0, true);
                return;
            default:
                kp kpVar3 = this.f44189b;
                kpVar3.getMessagesController().loadFullChat(kpVar3.E, 0, true);
                return;
        }
    }
}
