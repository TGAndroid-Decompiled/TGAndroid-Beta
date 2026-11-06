package org.telegram.ui;
public final class zy implements Runnable {
    public final int f52693a;
    public final az f52694b;

    public zy(az azVar, int i7) {
        this.f52693a = i7;
        this.f52694b = azVar;
    }

    @Override
    public final void run() {
        switch (this.f52693a) {
            case 0:
                this.f52694b.d();
                return;
            case 1:
                this.f52694b.a();
                return;
            default:
                az azVar = this.f52694b;
                azVar.b(azVar.D);
                return;
        }
    }
}
