package org.telegram.ui;
public final class sn implements Runnable {
    public final int f51247a;
    public final ho f51248b;

    public sn(ho hoVar, int i7) {
        this.f51247a = i7;
        this.f51248b = hoVar;
    }

    @Override
    public final void run() {
        switch (this.f51247a) {
            case 0:
                ho hoVar = this.f51248b;
                hoVar.f47754d0 = true;
                hoVar.h0();
                return;
            case 1:
                ho hoVar2 = this.f51248b;
                hoVar2.Y = hoVar2.getMessagesController().M0(Long.valueOf(hoVar2.f47749a0));
                hoVar2.e0();
                return;
            case 2:
                this.f51248b.g0(false);
                return;
            case 3:
                ho hoVar3 = this.f51248b;
                hoVar3.f47754d0 = true;
                if (hoVar3.f47750b.length() > 0) {
                    hoVar3.c0(hoVar3.f47750b.getText().toString());
                }
                hoVar3.h0();
                return;
            case 4:
                this.f51248b.e0();
                return;
            default:
                this.f51248b.g0(true);
                return;
        }
    }
}
