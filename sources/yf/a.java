package yf;

import org.telegram.messenger.ls;
public final class a implements Runnable {
    public final int f61193a;
    public final c f61194b;

    public a(c cVar, int i7) {
        this.f61193a = i7;
        this.f61194b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f61193a) {
            case 0:
                this.f61194b.g(false);
                return;
            default:
                ls.f(this.f61194b.f61202c).k(310, new Object[0]);
                return;
        }
    }
}
