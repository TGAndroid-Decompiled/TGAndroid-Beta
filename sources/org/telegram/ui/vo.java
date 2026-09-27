package org.telegram.ui;
public final class vo implements Runnable {
    public final int f38653a;
    public final gp f38654b;

    public vo(gp gpVar, int i10) {
        this.f38653a = i10;
        this.f38654b = gpVar;
    }

    @Override
    public final void run() {
        switch (this.f38653a) {
            case 0:
                gp gpVar = this.f38654b;
                gpVar.f33990c0 = true;
                gpVar.b0();
                return;
            case 1:
                gp gpVar2 = this.f38654b;
                gpVar2.X = gpVar2.getMessagesController().getChat(Long.valueOf(gpVar2.Z));
                gpVar2.Y();
                return;
            case 2:
                this.f38654b.a0(false);
                return;
            case 3:
                gp gpVar3 = this.f38654b;
                gpVar3.f33990c0 = true;
                if (gpVar3.f33985a.length() > 0) {
                    gpVar3.W(gpVar3.f33985a.getText().toString());
                }
                gpVar3.b0();
                return;
            case 4:
                this.f38654b.Y();
                return;
            default:
                this.f38654b.a0(true);
                return;
        }
    }
}
