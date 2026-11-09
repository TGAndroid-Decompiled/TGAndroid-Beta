package yf;

import org.telegram.messenger.qs;
public final class a implements Runnable {
    public final int f59412a;
    public final d f59413b;

    public a(d dVar, int i7) {
        this.f59412a = i7;
        this.f59413b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f59412a) {
            case 0:
                this.f59413b.g(false);
                return;
            default:
                qs.f(this.f59413b.f59424c).k(307, new Object[0]);
                return;
        }
    }
}
