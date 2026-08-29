package org.telegram.ui;
public final class zo implements Runnable {
    public final int f45265a;
    public final kp f45266b;

    public zo(kp kpVar, int i10) {
        this.f45265a = i10;
        this.f45266b = kpVar;
    }

    @Override
    public final void run() {
        switch (this.f45265a) {
            case 0:
                kp kpVar = this.f45266b;
                org.telegram.ui.ActionBar.c2 c2Var = kpVar.f39983r;
                if (c2Var != null) {
                    c2Var.setOnCancelListener(new cg(kpVar, 2));
                    kpVar.showDialog(kpVar.f39983r);
                    return;
                }
                return;
            case 1:
                kp kpVar2 = this.f45266b;
                kpVar2.getMessagesController().loadFullChat(kpVar2.A, 0, true);
                return;
            default:
                kp kpVar3 = this.f45266b;
                kpVar3.getMessagesController().loadFullChat(kpVar3.A, 0, true);
                return;
        }
    }
}
