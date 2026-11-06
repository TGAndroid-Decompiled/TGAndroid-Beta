package yf;

import org.telegram.messenger.qs;
public final class a implements Runnable {
    public final int f59283a;
    public final c f59284b;

    public a(c cVar, int i7) {
        this.f59283a = i7;
        this.f59284b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f59283a) {
            case 0:
                this.f59284b.g(false);
                return;
            default:
                qs.f(this.f59284b.f59292c).k(307, new Object[0]);
                return;
        }
    }
}
