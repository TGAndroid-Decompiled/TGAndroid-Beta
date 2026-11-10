package yf;

import org.telegram.messenger.qs;
public final class a implements Runnable {
    public final int f59410a;
    public final d f59411b;

    public a(d dVar, int i7) {
        this.f59410a = i7;
        this.f59411b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f59410a) {
            case 0:
                this.f59411b.g(false);
                return;
            default:
                qs.f(this.f59411b.f59422c).k(307, new Object[0]);
                return;
        }
    }
}
