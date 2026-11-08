package org.telegram.ui;
public final class zy implements Runnable {
    public final int f52697a;
    public final az f52698b;

    public zy(az azVar, int i7) {
        this.f52697a = i7;
        this.f52698b = azVar;
    }

    @Override
    public final void run() {
        switch (this.f52697a) {
            case 0:
                this.f52698b.d();
                return;
            case 1:
                this.f52698b.a();
                return;
            default:
                az azVar = this.f52698b;
                azVar.b(azVar.D);
                return;
        }
    }
}
