package org.telegram.ui;
public final class wo implements Runnable {
    public final int f44217a;
    public final hp f44218b;

    public wo(hp hpVar, int i9) {
        this.f44217a = i9;
        this.f44218b = hpVar;
    }

    @Override
    public final void run() {
        switch (this.f44217a) {
            case 0:
                hp hpVar = this.f44218b;
                org.telegram.ui.ActionBar.c2 c2Var = hpVar.f38887r;
                if (c2Var != null) {
                    c2Var.setOnCancelListener(new eg(hpVar, 2));
                    hpVar.showDialog(hpVar.f38887r);
                    return;
                }
                return;
            case 1:
                hp hpVar2 = this.f44218b;
                hpVar2.getMessagesController().loadFullChat(hpVar2.A, 0, true);
                return;
            default:
                hp hpVar3 = this.f44218b;
                hpVar3.getMessagesController().loadFullChat(hpVar3.A, 0, true);
                return;
        }
    }
}
