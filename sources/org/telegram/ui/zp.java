package org.telegram.ui;
public final class zp implements Runnable {
    public final int f44208a;
    public final iq f44209b;
    public final long f44210c;

    public zp(iq iqVar, long j10, int i10) {
        this.f44208a = i10;
        this.f44209b = iqVar;
        this.f44210c = j10;
    }

    @Override
    public final void run() {
        switch (this.f44208a) {
            case 0:
                long j10 = this.f44210c;
                iq iqVar = this.f44209b;
                iqVar.f38311n = j10;
                iqVar.f38316r = true;
                iqVar.r0();
                return;
            default:
                iq.d0(this.f44209b, this.f44210c);
                return;
        }
    }
}
