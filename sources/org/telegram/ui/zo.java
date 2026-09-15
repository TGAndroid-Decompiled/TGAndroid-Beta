package org.telegram.ui;
public final class zo implements Runnable {
    public final int f40254a;
    public final kp f40255b;

    public zo(kp kpVar, int i10) {
        this.f40254a = i10;
        this.f40255b = kpVar;
    }

    @Override
    public final void run() {
        switch (this.f40254a) {
            case 0:
                kp kpVar = this.f40255b;
                kpVar.f35215c0 = true;
                kpVar.b0();
                return;
            case 1:
                kp kpVar2 = this.f40255b;
                kpVar2.X = kpVar2.getMessagesController().getChat(Long.valueOf(kpVar2.Z));
                kpVar2.Y();
                return;
            case 2:
                this.f40255b.a0(false);
                return;
            case 3:
                kp kpVar3 = this.f40255b;
                kpVar3.f35215c0 = true;
                if (kpVar3.f35210a.length() > 0) {
                    kpVar3.W(kpVar3.f35210a.getText().toString());
                }
                kpVar3.b0();
                return;
            case 4:
                this.f40255b.Y();
                return;
            default:
                this.f40255b.a0(true);
                return;
        }
    }
}
