package org.telegram.ui;
public final class uo implements Runnable {
    public final int f38894a;
    public final fp f38895b;

    public uo(fp fpVar, int i10) {
        this.f38894a = i10;
        this.f38895b = fpVar;
    }

    @Override
    public final void run() {
        switch (this.f38894a) {
            case 0:
                fp fpVar = this.f38895b;
                fpVar.Z = true;
                fpVar.b0();
                return;
            case 1:
                fp fpVar2 = this.f38895b;
                fpVar2.U = fpVar2.getMessagesController().getChat(Long.valueOf(fpVar2.W));
                fpVar2.Y();
                return;
            case 2:
                this.f38895b.a0(false);
                return;
            case 3:
                fp fpVar3 = this.f38895b;
                fpVar3.Z = true;
                if (fpVar3.f34177a.length() > 0) {
                    fpVar3.W(fpVar3.f34177a.getText().toString());
                }
                fpVar3.b0();
                return;
            case 4:
                this.f38895b.Y();
                return;
            default:
                this.f38895b.a0(true);
                return;
        }
    }
}
