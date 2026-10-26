package org.telegram.ui;
public final class xp implements Runnable {
    public final int f45829a;
    public final gq f45830b;
    public final long f45831c;

    public xp(gq gqVar, long j10, int i10) {
        this.f45829a = i10;
        this.f45830b = gqVar;
        this.f45831c = j10;
    }

    @Override
    public final void run() {
        switch (this.f45829a) {
            case 0:
                long j10 = this.f45831c;
                gq gqVar = this.f45830b;
                gqVar.f39753n = j10;
                gqVar.f39758r = true;
                gqVar.o0();
                return;
            default:
                gq.a0(this.f45830b, this.f45831c);
                return;
        }
    }
}
