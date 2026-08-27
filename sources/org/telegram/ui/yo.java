package org.telegram.ui;

public final class yo implements Runnable {

    public final int f44859a;

    public final jp f44860b;

    public yo(jp jpVar, int i10) {
        this.f44859a = i10;
        this.f44860b = jpVar;
    }

    @Override
    public final void run() {
        switch (this.f44859a) {
            case 0:
                jp jpVar = this.f44860b;
                org.telegram.ui.ActionBar.b2 b2Var = jpVar.f39456r;
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new fg(jpVar, 2));
                    jpVar.showDialog(jpVar.f39456r);
                    break;
                }
                break;
            case 1:
                jp jpVar2 = this.f44860b;
                jpVar2.getMessagesController().loadFullChat(jpVar2.A, 0, true);
                break;
            default:
                jp jpVar3 = this.f44860b;
                jpVar3.getMessagesController().loadFullChat(jpVar3.A, 0, true);
                break;
        }
    }
}
