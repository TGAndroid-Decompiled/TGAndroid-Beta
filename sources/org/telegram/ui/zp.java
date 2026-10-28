package org.telegram.ui;
public final class zp implements Runnable {
    public final int f46333a;
    public final iq f46334b;
    public final long f46335c;

    public zp(iq iqVar, long j10, int i10) {
        this.f46333a = i10;
        this.f46334b = iqVar;
        this.f46335c = j10;
    }

    @Override
    public final void run() {
        switch (this.f46333a) {
            case 0:
                long j10 = this.f46335c;
                iq iqVar = this.f46334b;
                iqVar.f40243n = j10;
                iqVar.f40248r = true;
                iqVar.o0();
                return;
            default:
                iq.a0(this.f46334b, this.f46335c);
                return;
        }
    }
}
