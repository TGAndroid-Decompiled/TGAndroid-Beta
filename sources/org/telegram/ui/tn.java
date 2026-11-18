package org.telegram.ui;
public final class tn implements Runnable {
    public final int f52311a;
    public final jo f52312b;

    public tn(jo joVar, int i7) {
        this.f52311a = i7;
        this.f52312b = joVar;
    }

    @Override
    public final void run() {
        switch (this.f52311a) {
            case 0:
                jo joVar = this.f52312b;
                joVar.f49024d0 = true;
                joVar.h0();
                return;
            case 1:
                jo joVar2 = this.f52312b;
                joVar2.Y = joVar2.getMessagesController().O0(Long.valueOf(joVar2.f49019a0));
                joVar2.e0();
                return;
            case 2:
                this.f52312b.g0(false);
                return;
            case 3:
                jo joVar3 = this.f52312b;
                joVar3.f49024d0 = true;
                if (joVar3.f49020b.length() > 0) {
                    joVar3.c0(joVar3.f49020b.getText().toString());
                }
                joVar3.h0();
                return;
            case 4:
                this.f52312b.e0();
                return;
            default:
                this.f52312b.g0(true);
                return;
        }
    }
}
