package org.telegram.ui;
public final class ro implements Runnable {
    public final int f43093a;
    public final cp f43094b;

    public ro(cp cpVar, int i10) {
        this.f43093a = i10;
        this.f43094b = cpVar;
    }

    @Override
    public final void run() {
        switch (this.f43093a) {
            case 0:
                cp cpVar = this.f43094b;
                cpVar.f38406c0 = true;
                cpVar.d0();
                return;
            case 1:
                cp cpVar2 = this.f43094b;
                cpVar2.X = cpVar2.getMessagesController().getChat(Long.valueOf(cpVar2.Z));
                cpVar2.a0();
                return;
            case 2:
                this.f43094b.c0(false);
                return;
            case 3:
                cp cpVar3 = this.f43094b;
                cpVar3.f38406c0 = true;
                if (cpVar3.f38403b.length() > 0) {
                    cpVar3.Y(cpVar3.f38403b.getText().toString());
                }
                cpVar3.d0();
                return;
            case 4:
                this.f43094b.a0();
                return;
            default:
                this.f43094b.c0(true);
                return;
        }
    }
}
