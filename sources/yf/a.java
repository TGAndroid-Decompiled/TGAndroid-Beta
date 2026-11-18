package yf;

import org.telegram.messenger.ks;
public final class a implements Runnable {
    public final int f61183a;
    public final c f61184b;

    public a(c cVar, int i7) {
        this.f61183a = i7;
        this.f61184b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f61183a) {
            case 0:
                this.f61184b.g(false);
                return;
            default:
                ks.f(this.f61184b.f61192c).k(310, new Object[0]);
                return;
        }
    }
}
