package yf;

import org.telegram.messenger.qs;
public final class a implements Runnable {
    public final int f59313a;
    public final c f59314b;

    public a(c cVar, int i7) {
        this.f59313a = i7;
        this.f59314b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f59313a) {
            case 0:
                this.f59314b.g(false);
                return;
            default:
                qs.f(this.f59314b.f59322c).k(307, new Object[0]);
                return;
        }
    }
}
