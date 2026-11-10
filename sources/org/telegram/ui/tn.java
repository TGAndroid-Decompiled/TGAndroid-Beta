package org.telegram.ui;
public final class tn implements Runnable {
    public final int f50307a;
    public final io f50308b;

    public tn(io ioVar, int i7) {
        this.f50307a = i7;
        this.f50308b = ioVar;
    }

    @Override
    public final void run() {
        switch (this.f50307a) {
            case 0:
                io ioVar = this.f50308b;
                ioVar.f46686c0 = true;
                ioVar.h0();
                return;
            case 1:
                io ioVar2 = this.f50308b;
                ioVar2.X = ioVar2.getMessagesController().M0(Long.valueOf(ioVar2.Z));
                ioVar2.e0();
                return;
            case 2:
                this.f50308b.g0(false);
                return;
            case 3:
                io ioVar3 = this.f50308b;
                ioVar3.f46686c0 = true;
                if (ioVar3.f46683b.length() > 0) {
                    ioVar3.c0(ioVar3.f46683b.getText().toString());
                }
                ioVar3.h0();
                return;
            case 4:
                this.f50308b.e0();
                return;
            default:
                this.f50308b.g0(true);
                return;
        }
    }
}
