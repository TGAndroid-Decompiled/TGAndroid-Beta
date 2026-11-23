package yf;

import org.telegram.messenger.ks;
public final class a implements Runnable {
    public final int f61312a;
    public final c f61313b;

    public a(c cVar, int i7) {
        this.f61312a = i7;
        this.f61313b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f61312a) {
            case 0:
                this.f61313b.g(false);
                return;
            default:
                ks.f(this.f61313b.f61321c).k(310, new Object[0]);
                return;
        }
    }
}
