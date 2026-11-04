package sf;

import org.telegram.messenger.k7;
public class b {
    public Runnable f54707a;
    public Runnable f54708b;
    public Runnable f54709c;

    public b(Runnable runnable, Runnable runnable2) {
        this.f54707a = runnable;
        this.f54709c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f54708b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f54709c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f54707a;
        if (runnable != null) {
            runnable.run();
            this.f54707a = null;
        }
    }

    public final void e(k7 k7Var) {
        this.f54708b = k7Var;
    }
}
