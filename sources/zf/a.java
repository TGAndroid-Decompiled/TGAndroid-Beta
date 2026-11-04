package zf;

import org.telegram.messenger.hs;
public final class a implements Runnable {
    public final int f60446a;
    public final c f60447b;

    public a(c cVar, int i3) {
        this.f60446a = i3;
        this.f60447b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f60446a) {
            case 0:
                this.f60447b.g(false);
                return;
            default:
                hs.f(this.f60447b.f60455c).k(307, new Object[0]);
                return;
        }
    }
}
