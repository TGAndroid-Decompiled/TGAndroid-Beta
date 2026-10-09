package org.telegram.ui;
public final class xo implements Runnable {
    public final int f44085a;
    public final ip f44086b;

    public xo(ip ipVar, int i10) {
        this.f44085a = i10;
        this.f44086b = ipVar;
    }

    @Override
    public final void run() {
        switch (this.f44085a) {
            case 0:
                ip ipVar = this.f44086b;
                ipVar.f38713c0 = true;
                ipVar.b0();
                return;
            case 1:
                ip ipVar2 = this.f44086b;
                ipVar2.X = ipVar2.getMessagesController().getChat(Long.valueOf(ipVar2.Z));
                ipVar2.Y();
                return;
            case 2:
                this.f44086b.a0(false);
                return;
            case 3:
                ip ipVar3 = this.f44086b;
                ipVar3.f38713c0 = true;
                if (ipVar3.f38708a.length() > 0) {
                    ipVar3.W(ipVar3.f38708a.getText().toString());
                }
                ipVar3.b0();
                return;
            case 4:
                this.f44086b.Y();
                return;
            default:
                this.f44086b.a0(true);
                return;
        }
    }
}
