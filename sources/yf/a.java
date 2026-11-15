package yf;

import org.telegram.messenger.ns;
public final class a implements Runnable {
    public final int f60617a;
    public final c f60618b;

    public a(c cVar, int i7) {
        this.f60617a = i7;
        this.f60618b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f60617a) {
            case 0:
                this.f60618b.g(false);
                return;
            default:
                ns.f(this.f60618b.f60626c).k(307, new Object[0]);
                return;
        }
    }
}
