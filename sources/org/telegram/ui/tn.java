package org.telegram.ui;
public final class tn implements Runnable {
    public final int f52356a;
    public final jo f52357b;

    public tn(jo joVar, int i7) {
        this.f52356a = i7;
        this.f52357b = joVar;
    }

    @Override
    public final void run() {
        switch (this.f52356a) {
            case 0:
                jo joVar = this.f52357b;
                joVar.f49038d0 = true;
                joVar.h0();
                return;
            case 1:
                jo joVar2 = this.f52357b;
                joVar2.Y = joVar2.getMessagesController().O0(Long.valueOf(joVar2.f49033a0));
                joVar2.e0();
                return;
            case 2:
                this.f52357b.g0(false);
                return;
            case 3:
                jo joVar3 = this.f52357b;
                joVar3.f49038d0 = true;
                if (joVar3.f49034b.length() > 0) {
                    joVar3.c0(joVar3.f49034b.getText().toString());
                }
                joVar3.h0();
                return;
            case 4:
                this.f52357b.e0();
                return;
            default:
                this.f52357b.g0(true);
                return;
        }
    }
}
