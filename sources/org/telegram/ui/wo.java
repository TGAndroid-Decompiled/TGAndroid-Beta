package org.telegram.ui;
public final class wo implements Runnable {
    public final int f42620a;
    public final hp f42621b;

    public wo(hp hpVar, int i10) {
        this.f42620a = i10;
        this.f42621b = hpVar;
    }

    @Override
    public final void run() {
        switch (this.f42620a) {
            case 0:
                hp hpVar = this.f42621b;
                hpVar.f37136d0 = true;
                hpVar.b0();
                return;
            case 1:
                hp hpVar2 = this.f42621b;
                hpVar2.Y = hpVar2.getMessagesController().getChat(Long.valueOf(hpVar2.f37131a0));
                hpVar2.X();
                return;
            case 2:
                this.f42621b.Z(false);
                return;
            case 3:
                hp hpVar3 = this.f42621b;
                hpVar3.f37136d0 = true;
                if (hpVar3.f37132b.length() > 0) {
                    hpVar3.U(hpVar3.f37132b.getText().toString());
                }
                hpVar3.b0();
                return;
            case 4:
                this.f42621b.X();
                return;
            default:
                this.f42621b.Z(true);
                return;
        }
    }
}
