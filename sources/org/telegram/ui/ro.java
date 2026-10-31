package org.telegram.ui;
public final class ro implements Runnable {
    public final int f41259a;
    public final cp f41260b;

    public ro(cp cpVar, int i10) {
        this.f41259a = i10;
        this.f41260b = cpVar;
    }

    @Override
    public final void run() {
        switch (this.f41259a) {
            case 0:
                cp cpVar = this.f41260b;
                cpVar.f36501c0 = true;
                cpVar.g0();
                return;
            case 1:
                cp cpVar2 = this.f41260b;
                cpVar2.X = cpVar2.getMessagesController().L0(Long.valueOf(cpVar2.Z));
                cpVar2.d0();
                return;
            case 2:
                this.f41260b.f0(false);
                return;
            case 3:
                cp cpVar3 = this.f41260b;
                cpVar3.f36501c0 = true;
                if (cpVar3.f36498b.length() > 0) {
                    cpVar3.b0(cpVar3.f36498b.getText().toString());
                }
                cpVar3.g0();
                return;
            case 4:
                this.f41260b.d0();
                return;
            default:
                this.f41260b.f0(true);
                return;
        }
    }
}
