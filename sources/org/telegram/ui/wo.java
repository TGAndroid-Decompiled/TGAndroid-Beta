package org.telegram.ui;
public final class wo implements Runnable {
    public final int f42553a;
    public final hp f42554b;

    public wo(hp hpVar, int i10) {
        this.f42553a = i10;
        this.f42554b = hpVar;
    }

    @Override
    public final void run() {
        switch (this.f42553a) {
            case 0:
                hp hpVar = this.f42554b;
                hpVar.f37135c0 = true;
                hpVar.b0();
                return;
            case 1:
                hp hpVar2 = this.f42554b;
                hpVar2.X = hpVar2.getMessagesController().getChat(Long.valueOf(hpVar2.Z));
                hpVar2.X();
                return;
            case 2:
                this.f42554b.Z(false);
                return;
            case 3:
                hp hpVar3 = this.f42554b;
                hpVar3.f37135c0 = true;
                if (hpVar3.f37130a.length() > 0) {
                    hpVar3.U(hpVar3.f37130a.getText().toString());
                }
                hpVar3.b0();
                return;
            case 4:
                this.f42554b.X();
                return;
            default:
                this.f42554b.Z(true);
                return;
        }
    }
}
