package org.telegram.ui;
public final class sn implements Runnable {
    public final int f51246a;
    public final ho f51247b;

    public sn(ho hoVar, int i7) {
        this.f51246a = i7;
        this.f51247b = hoVar;
    }

    @Override
    public final void run() {
        switch (this.f51246a) {
            case 0:
                ho hoVar = this.f51247b;
                hoVar.f47764d0 = true;
                hoVar.h0();
                return;
            case 1:
                ho hoVar2 = this.f51247b;
                hoVar2.Y = hoVar2.getMessagesController().M0(Long.valueOf(hoVar2.f47759a0));
                hoVar2.e0();
                return;
            case 2:
                this.f51247b.g0(false);
                return;
            case 3:
                ho hoVar3 = this.f51247b;
                hoVar3.f47764d0 = true;
                if (hoVar3.f47760b.length() > 0) {
                    hoVar3.c0(hoVar3.f47760b.getText().toString());
                }
                hoVar3.h0();
                return;
            case 4:
                this.f51247b.e0();
                return;
            default:
                this.f51247b.g0(true);
                return;
        }
    }
}
