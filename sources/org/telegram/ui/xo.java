package org.telegram.ui;
public final class xo implements Runnable {
    public final int f43254a;
    public final ip f43255b;

    public xo(ip ipVar, int i10) {
        this.f43254a = i10;
        this.f43255b = ipVar;
    }

    @Override
    public final void run() {
        switch (this.f43254a) {
            case 0:
                ip ipVar = this.f43255b;
                org.telegram.ui.ActionBar.b2 b2Var = ipVar.f38074r;
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new hg(ipVar, 2));
                    ipVar.showDialog(ipVar.f38074r);
                    return;
                }
                return;
            case 1:
                ip ipVar2 = this.f43255b;
                ipVar2.getMessagesController().loadFullChat(ipVar2.E, 0, true);
                return;
            default:
                ip ipVar3 = this.f43255b;
                ipVar3.getMessagesController().loadFullChat(ipVar3.E, 0, true);
                return;
        }
    }
}
