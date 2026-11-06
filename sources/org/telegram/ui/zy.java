package org.telegram.ui;
public final class zy implements Runnable {
    public final int f52669a;
    public final az f52670b;

    public zy(az azVar, int i7) {
        this.f52669a = i7;
        this.f52670b = azVar;
    }

    @Override
    public final void run() {
        switch (this.f52669a) {
            case 0:
                this.f52670b.d();
                return;
            case 1:
                this.f52670b.a();
                return;
            default:
                az azVar = this.f52670b;
                azVar.b(azVar.D);
                return;
        }
    }
}
