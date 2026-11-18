package yf;

import org.telegram.messenger.ks;
public final class a implements Runnable {
    public final int f61182a;
    public final c f61183b;

    public a(c cVar, int i7) {
        this.f61182a = i7;
        this.f61183b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f61182a) {
            case 0:
                this.f61183b.g(false);
                return;
            default:
                ks.f(this.f61183b.f61191c).k(309, new Object[0]);
                return;
        }
    }
}
