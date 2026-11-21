package org.telegram.ui;
public final class tn implements Runnable {
    public final int f52352a;
    public final jo f52353b;

    public tn(jo joVar, int i7) {
        this.f52352a = i7;
        this.f52353b = joVar;
    }

    @Override
    public final void run() {
        switch (this.f52352a) {
            case 0:
                jo joVar = this.f52353b;
                joVar.f49034d0 = true;
                joVar.h0();
                return;
            case 1:
                jo joVar2 = this.f52353b;
                joVar2.Y = joVar2.getMessagesController().O0(Long.valueOf(joVar2.f49029a0));
                joVar2.e0();
                return;
            case 2:
                this.f52353b.g0(false);
                return;
            case 3:
                jo joVar3 = this.f52353b;
                joVar3.f49034d0 = true;
                if (joVar3.f49030b.length() > 0) {
                    joVar3.c0(joVar3.f49030b.getText().toString());
                }
                joVar3.h0();
                return;
            case 4:
                this.f52353b.e0();
                return;
            default:
                this.f52353b.g0(true);
                return;
        }
    }
}
