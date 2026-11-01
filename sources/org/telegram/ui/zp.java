package org.telegram.ui;
public final class zp implements Runnable {
    public final int f44034a;
    public final iq f44035b;
    public final long f44036c;

    public zp(iq iqVar, long j10, int i10) {
        this.f44034a = i10;
        this.f44035b = iqVar;
        this.f44036c = j10;
    }

    @Override
    public final void run() {
        switch (this.f44034a) {
            case 0:
                long j10 = this.f44036c;
                iq iqVar = this.f44035b;
                iqVar.f38137n = j10;
                iqVar.f38142r = true;
                iqVar.s0();
                return;
            default:
                iq.e0(this.f44035b, this.f44036c);
                return;
        }
    }
}
