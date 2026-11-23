package yf;

import org.telegram.messenger.ls;
public final class a implements Runnable {
    public final int f61228a;
    public final c f61229b;

    public a(c cVar, int i7) {
        this.f61228a = i7;
        this.f61229b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f61228a) {
            case 0:
                this.f61229b.g(false);
                return;
            default:
                ls.f(this.f61229b.f61237c).k(310, new Object[0]);
                return;
        }
    }
}
