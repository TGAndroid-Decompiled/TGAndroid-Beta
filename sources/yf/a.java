package yf;

import org.telegram.messenger.qs;
public final class a implements Runnable {
    public final int f59402a;
    public final d f59403b;

    public a(d dVar, int i7) {
        this.f59402a = i7;
        this.f59403b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f59402a) {
            case 0:
                this.f59403b.g(false);
                return;
            default:
                qs.f(this.f59403b.f59414c).k(307, new Object[0]);
                return;
        }
    }
}
