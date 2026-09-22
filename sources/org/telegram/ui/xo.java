package org.telegram.ui;
public final class xo implements Runnable {
    public final int f39659a;
    public final ip f39660b;

    public xo(ip ipVar, int i10) {
        this.f39659a = i10;
        this.f39660b = ipVar;
    }

    @Override
    public final void run() {
        switch (this.f39659a) {
            case 0:
                ip ipVar = this.f39660b;
                ipVar.f34659c0 = true;
                ipVar.b0();
                return;
            case 1:
                ip ipVar2 = this.f39660b;
                ipVar2.X = ipVar2.getMessagesController().getChat(Long.valueOf(ipVar2.Z));
                ipVar2.Y();
                return;
            case 2:
                this.f39660b.a0(false);
                return;
            case 3:
                ip ipVar3 = this.f39660b;
                ipVar3.f34659c0 = true;
                if (ipVar3.f34654a.length() > 0) {
                    ipVar3.W(ipVar3.f34654a.getText().toString());
                }
                ipVar3.b0();
                return;
            case 4:
                this.f39660b.Y();
                return;
            default:
                this.f39660b.a0(true);
                return;
        }
    }
}
