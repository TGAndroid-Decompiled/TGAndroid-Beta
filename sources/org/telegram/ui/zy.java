package org.telegram.ui;
public final class zy implements Runnable {
    public final int f52695a;
    public final az f52696b;

    public zy(az azVar, int i7) {
        this.f52695a = i7;
        this.f52696b = azVar;
    }

    @Override
    public final void run() {
        switch (this.f52695a) {
            case 0:
                this.f52696b.d();
                return;
            case 1:
                this.f52696b.a();
                return;
            default:
                az azVar = this.f52696b;
                azVar.b(azVar.D);
                return;
        }
    }
}
