package org.telegram.ui;
public final class tn implements Runnable {
    public final int f52306a;
    public final jo f52307b;

    public tn(jo joVar, int i7) {
        this.f52306a = i7;
        this.f52307b = joVar;
    }

    @Override
    public final void run() {
        switch (this.f52306a) {
            case 0:
                jo joVar = this.f52307b;
                joVar.f49001d0 = true;
                joVar.h0();
                return;
            case 1:
                jo joVar2 = this.f52307b;
                joVar2.Y = joVar2.getMessagesController().O0(Long.valueOf(joVar2.f48996a0));
                joVar2.e0();
                return;
            case 2:
                this.f52307b.g0(false);
                return;
            case 3:
                jo joVar3 = this.f52307b;
                joVar3.f49001d0 = true;
                if (joVar3.f48997b.length() > 0) {
                    joVar3.c0(joVar3.f48997b.getText().toString());
                }
                joVar3.h0();
                return;
            case 4:
                this.f52307b.e0();
                return;
            default:
                this.f52307b.g0(true);
                return;
        }
    }
}
