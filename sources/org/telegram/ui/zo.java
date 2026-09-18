package org.telegram.ui;
public final class zo implements Runnable {
    public final int f40294a;
    public final kp f40295b;

    public zo(kp kpVar, int i10) {
        this.f40294a = i10;
        this.f40295b = kpVar;
    }

    @Override
    public final void run() {
        switch (this.f40294a) {
            case 0:
                kp kpVar = this.f40295b;
                kpVar.f35327c0 = true;
                kpVar.b0();
                return;
            case 1:
                kp kpVar2 = this.f40295b;
                kpVar2.X = kpVar2.getMessagesController().getChat(Long.valueOf(kpVar2.Z));
                kpVar2.Y();
                return;
            case 2:
                this.f40295b.a0(false);
                return;
            case 3:
                kp kpVar3 = this.f40295b;
                kpVar3.f35327c0 = true;
                if (kpVar3.f35322a.length() > 0) {
                    kpVar3.W(kpVar3.f35322a.getText().toString());
                }
                kpVar3.b0();
                return;
            case 4:
                this.f40295b.Y();
                return;
            default:
                this.f40295b.a0(true);
                return;
        }
    }
}
