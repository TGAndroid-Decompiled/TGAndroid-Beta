package org.telegram.ui;
public final class rn implements Runnable {
    public final int f49516a;
    public final go f49517b;

    public rn(go goVar, int i7) {
        this.f49516a = i7;
        this.f49517b = goVar;
    }

    @Override
    public final void run() {
        switch (this.f49516a) {
            case 0:
                go goVar = this.f49517b;
                goVar.f46024c0 = true;
                goVar.h0();
                return;
            case 1:
                go goVar2 = this.f49517b;
                goVar2.X = goVar2.getMessagesController().M0(Long.valueOf(goVar2.Z));
                goVar2.e0();
                return;
            case 2:
                this.f49517b.g0(false);
                return;
            case 3:
                go goVar3 = this.f49517b;
                goVar3.f46024c0 = true;
                if (goVar3.f46021b.length() > 0) {
                    goVar3.c0(goVar3.f46021b.getText().toString());
                }
                goVar3.h0();
                return;
            case 4:
                this.f49517b.e0();
                return;
            default:
                this.f49517b.g0(true);
                return;
        }
    }
}
