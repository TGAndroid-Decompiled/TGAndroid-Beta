package yf;

import org.telegram.messenger.qs;
public final class a implements Runnable {
    public final int f59403a;
    public final d f59404b;

    public a(d dVar, int i7) {
        this.f59403a = i7;
        this.f59404b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f59403a) {
            case 0:
                this.f59404b.g(false);
                return;
            default:
                qs.f(this.f59404b.f59415c).k(307, new Object[0]);
                return;
        }
    }
}
