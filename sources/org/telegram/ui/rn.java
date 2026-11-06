package org.telegram.ui;
public final class rn implements Runnable {
    public final int f49536a;
    public final go f49537b;

    public rn(go goVar, int i7) {
        this.f49536a = i7;
        this.f49537b = goVar;
    }

    @Override
    public final void run() {
        switch (this.f49536a) {
            case 0:
                go goVar = this.f49537b;
                goVar.f46051c0 = true;
                goVar.h0();
                return;
            case 1:
                go goVar2 = this.f49537b;
                goVar2.X = goVar2.getMessagesController().M0(Long.valueOf(goVar2.Z));
                goVar2.e0();
                return;
            case 2:
                this.f49537b.g0(false);
                return;
            case 3:
                go goVar3 = this.f49537b;
                goVar3.f46051c0 = true;
                if (goVar3.f46048b.length() > 0) {
                    goVar3.c0(goVar3.f46048b.getText().toString());
                }
                goVar3.h0();
                return;
            case 4:
                this.f49537b.e0();
                return;
            default:
                this.f49537b.g0(true);
                return;
        }
    }
}
