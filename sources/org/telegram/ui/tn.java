package org.telegram.ui;
public final class tn implements Runnable {
    public final int f50204a;
    public final io f50205b;

    public tn(io ioVar, int i7) {
        this.f50204a = i7;
        this.f50205b = ioVar;
    }

    @Override
    public final void run() {
        switch (this.f50204a) {
            case 0:
                io ioVar = this.f50205b;
                ioVar.f46713c0 = true;
                ioVar.h0();
                return;
            case 1:
                io ioVar2 = this.f50205b;
                ioVar2.X = ioVar2.getMessagesController().M0(Long.valueOf(ioVar2.Z));
                ioVar2.e0();
                return;
            case 2:
                this.f50205b.g0(false);
                return;
            case 3:
                io ioVar3 = this.f50205b;
                ioVar3.f46713c0 = true;
                if (ioVar3.f46710b.length() > 0) {
                    ioVar3.c0(ioVar3.f46710b.getText().toString());
                }
                ioVar3.h0();
                return;
            case 4:
                this.f50205b.e0();
                return;
            default:
                this.f50205b.g0(true);
                return;
        }
    }
}
