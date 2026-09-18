package org.telegram.ui;
public final class xo implements Runnable {
    public final int f39534a;
    public final ip f39535b;

    public xo(ip ipVar, int i10) {
        this.f39534a = i10;
        this.f39535b = ipVar;
    }

    @Override
    public final void run() {
        switch (this.f39534a) {
            case 0:
                ip ipVar = this.f39535b;
                ipVar.f34575c0 = true;
                ipVar.b0();
                return;
            case 1:
                ip ipVar2 = this.f39535b;
                ipVar2.X = ipVar2.getMessagesController().getChat(Long.valueOf(ipVar2.Z));
                ipVar2.Y();
                return;
            case 2:
                this.f39535b.a0(false);
                return;
            case 3:
                ip ipVar3 = this.f39535b;
                ipVar3.f34575c0 = true;
                if (ipVar3.f34570a.length() > 0) {
                    ipVar3.W(ipVar3.f34570a.getText().toString());
                }
                ipVar3.b0();
                return;
            case 4:
                this.f39535b.Y();
                return;
            default:
                this.f39535b.a0(true);
                return;
        }
    }
}
