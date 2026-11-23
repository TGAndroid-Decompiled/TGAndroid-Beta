package org.telegram.ui;
public final class tn implements Runnable {
    public final int f52430a;
    public final io f52431b;

    public tn(io ioVar, int i7) {
        this.f52430a = i7;
        this.f52431b = ioVar;
    }

    @Override
    public final void run() {
        switch (this.f52430a) {
            case 0:
                io ioVar = this.f52431b;
                ioVar.f48867d0 = true;
                ioVar.h0();
                return;
            case 1:
                io ioVar2 = this.f52431b;
                ioVar2.Y = ioVar2.getMessagesController().O0(Long.valueOf(ioVar2.f48862a0));
                ioVar2.e0();
                return;
            case 2:
                this.f52431b.g0(false);
                return;
            case 3:
                io ioVar3 = this.f52431b;
                ioVar3.f48867d0 = true;
                if (ioVar3.f48863b.length() > 0) {
                    ioVar3.c0(ioVar3.f48863b.getText().toString());
                }
                ioVar3.h0();
                return;
            case 4:
                this.f52431b.e0();
                return;
            default:
                this.f52431b.g0(true);
                return;
        }
    }
}
