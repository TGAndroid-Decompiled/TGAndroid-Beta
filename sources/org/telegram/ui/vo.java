package org.telegram.ui;
public final class vo implements Runnable {
    public final int f38436a;
    public final gp f38437b;

    public vo(gp gpVar, int i10) {
        this.f38436a = i10;
        this.f38437b = gpVar;
    }

    @Override
    public final void run() {
        switch (this.f38436a) {
            case 0:
                gp gpVar = this.f38437b;
                gpVar.f33608c0 = true;
                gpVar.b0();
                return;
            case 1:
                gp gpVar2 = this.f38437b;
                gpVar2.X = gpVar2.getMessagesController().getChat(Long.valueOf(gpVar2.Z));
                gpVar2.Y();
                return;
            case 2:
                this.f38437b.a0(false);
                return;
            case 3:
                gp gpVar3 = this.f38437b;
                gpVar3.f33608c0 = true;
                if (gpVar3.f33603a.length() > 0) {
                    gpVar3.W(gpVar3.f33603a.getText().toString());
                }
                gpVar3.b0();
                return;
            case 4:
                this.f38437b.Y();
                return;
            default:
                this.f38437b.a0(true);
                return;
        }
    }
}
