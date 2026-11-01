package org.telegram.ui;
public final class ro implements Runnable {
    public final int f41124a;
    public final cp f41125b;

    public ro(cp cpVar, int i10) {
        this.f41124a = i10;
        this.f41125b = cpVar;
    }

    @Override
    public final void run() {
        switch (this.f41124a) {
            case 0:
                cp cpVar = this.f41125b;
                cpVar.f36362c0 = true;
                cpVar.h0();
                return;
            case 1:
                cp cpVar2 = this.f41125b;
                cpVar2.X = cpVar2.getMessagesController().L0(Long.valueOf(cpVar2.Z));
                cpVar2.e0();
                return;
            case 2:
                this.f41125b.g0(false);
                return;
            case 3:
                cp cpVar3 = this.f41125b;
                cpVar3.f36362c0 = true;
                if (cpVar3.f36359b.length() > 0) {
                    cpVar3.c0(cpVar3.f36359b.getText().toString());
                }
                cpVar3.h0();
                return;
            case 4:
                this.f41125b.e0();
                return;
            default:
                this.f41125b.g0(true);
                return;
        }
    }
}
