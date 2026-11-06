package yf;

import org.telegram.messenger.qs;
public final class a implements Runnable {
    public final int f59308a;
    public final c f59309b;

    public a(c cVar, int i7) {
        this.f59308a = i7;
        this.f59309b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f59308a) {
            case 0:
                this.f59309b.g(false);
                return;
            default:
                qs.f(this.f59309b.f59317c).k(307, new Object[0]);
                return;
        }
    }
}
