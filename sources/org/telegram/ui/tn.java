package org.telegram.ui;
public final class tn implements Runnable {
    public final int f52302a;
    public final io f52303b;

    public tn(io ioVar, int i7) {
        this.f52302a = i7;
        this.f52303b = ioVar;
    }

    @Override
    public final void run() {
        switch (this.f52302a) {
            case 0:
                io ioVar = this.f52303b;
                ioVar.f48783d0 = true;
                ioVar.h0();
                return;
            case 1:
                io ioVar2 = this.f52303b;
                ioVar2.Y = ioVar2.getMessagesController().O0(Long.valueOf(ioVar2.f48778a0));
                ioVar2.e0();
                return;
            case 2:
                this.f52303b.g0(false);
                return;
            case 3:
                io ioVar3 = this.f52303b;
                ioVar3.f48783d0 = true;
                if (ioVar3.f48779b.length() > 0) {
                    ioVar3.c0(ioVar3.f48779b.getText().toString());
                }
                ioVar3.h0();
                return;
            case 4:
                this.f52303b.e0();
                return;
            default:
                this.f52303b.g0(true);
                return;
        }
    }
}
