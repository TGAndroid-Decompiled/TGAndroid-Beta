package org.telegram.ui;
public final class zo implements Runnable {
    public final int f52719a;
    public final ip f52720b;
    public final long f52721c;

    public zo(ip ipVar, long j10, int i3) {
        this.f52719a = i3;
        this.f52720b = ipVar;
        this.f52721c = j10;
    }

    @Override
    public final void run() {
        switch (this.f52719a) {
            case 0:
                long j10 = this.f52721c;
                ip ipVar = this.f52720b;
                ipVar.f46343n = j10;
                ipVar.f46348r = true;
                ipVar.s0();
                return;
            default:
                ip.e0(this.f52720b, this.f52721c);
                return;
        }
    }
}
