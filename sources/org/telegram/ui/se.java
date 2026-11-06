package org.telegram.ui;
public final class se implements Runnable {
    public final int f49753a;
    public final an f49754b;
    public final long f49755c;
    public final long d;

    public se(an anVar, long j3, long j10, int i7) {
        this.f49753a = i7;
        this.f49754b = anVar;
        this.f49755c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f49753a) {
            case 0:
                an.o0(this.f49754b, this.f49755c, this.d);
                return;
            default:
                an.F1(this.f49754b, this.f49755c, this.d);
                return;
        }
    }
}
