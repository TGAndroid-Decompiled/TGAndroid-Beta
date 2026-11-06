package yf;

import org.telegram.messenger.qs;
public final class a implements Runnable {
    public final int f59307a;
    public final c f59308b;

    public a(c cVar, int i7) {
        this.f59307a = i7;
        this.f59308b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f59307a) {
            case 0:
                this.f59308b.g(false);
                return;
            default:
                qs.f(this.f59308b.f59316c).k(307, new Object[0]);
                return;
        }
    }
}
