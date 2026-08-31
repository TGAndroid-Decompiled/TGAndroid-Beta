package org.telegram.ui;
public final class so implements Runnable {
    public final int f41331a;
    public final ep f41332b;

    public so(ep epVar, int i10) {
        this.f41331a = i10;
        this.f41332b = epVar;
    }

    @Override
    public final void run() {
        switch (this.f41331a) {
            case 0:
                ep epVar = this.f41332b;
                epVar.Z = true;
                epVar.b0();
                return;
            case 1:
                ep epVar2 = this.f41332b;
                epVar2.U = epVar2.getMessagesController().getChat(Long.valueOf(epVar2.W));
                epVar2.Y();
                return;
            case 2:
                this.f41332b.a0(false);
                return;
            case 3:
                ep epVar3 = this.f41332b;
                epVar3.Z = true;
                if (epVar3.f36629a.length() > 0) {
                    epVar3.W(epVar3.f36629a.getText().toString());
                }
                epVar3.b0();
                return;
            case 4:
                this.f41332b.Y();
                return;
            default:
                this.f41332b.a0(true);
                return;
        }
    }
}
