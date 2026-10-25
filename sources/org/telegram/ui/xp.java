package org.telegram.ui;
public final class xp implements Runnable {
    public final int f45826a;
    public final gq f45827b;
    public final long f45828c;

    public xp(gq gqVar, long j10, int i10) {
        this.f45826a = i10;
        this.f45827b = gqVar;
        this.f45828c = j10;
    }

    @Override
    public final void run() {
        switch (this.f45826a) {
            case 0:
                long j10 = this.f45828c;
                gq gqVar = this.f45827b;
                gqVar.f39750n = j10;
                gqVar.f39755r = true;
                gqVar.o0();
                return;
            default:
                gq.a0(this.f45827b, this.f45828c);
                return;
        }
    }
}
