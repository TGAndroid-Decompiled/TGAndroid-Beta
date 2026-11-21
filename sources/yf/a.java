package yf;

import org.telegram.messenger.ks;
public final class a implements Runnable {
    public final int f61224a;
    public final c f61225b;

    public a(c cVar, int i7) {
        this.f61224a = i7;
        this.f61225b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f61224a) {
            case 0:
                this.f61225b.g(false);
                return;
            default:
                ks.f(this.f61225b.f61233c).k(310, new Object[0]);
                return;
        }
    }
}
