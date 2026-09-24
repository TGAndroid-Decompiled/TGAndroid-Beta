package org.telegram.ui;
public final class uo implements Runnable {
    public final int f38495a;
    public final fp f38496b;

    public uo(fp fpVar, int i10) {
        this.f38495a = i10;
        this.f38496b = fpVar;
    }

    @Override
    public final void run() {
        switch (this.f38495a) {
            case 0:
                fp fpVar = this.f38496b;
                fpVar.f33699c0 = true;
                fpVar.b0();
                return;
            case 1:
                fp fpVar2 = this.f38496b;
                fpVar2.X = fpVar2.getMessagesController().getChat(Long.valueOf(fpVar2.Z));
                fpVar2.Y();
                return;
            case 2:
                this.f38496b.a0(false);
                return;
            case 3:
                fp fpVar3 = this.f38496b;
                fpVar3.f33699c0 = true;
                if (fpVar3.f33694a.length() > 0) {
                    fpVar3.W(fpVar3.f33694a.getText().toString());
                }
                fpVar3.b0();
                return;
            case 4:
                this.f38496b.Y();
                return;
            default:
                this.f38496b.a0(true);
                return;
        }
    }
}
