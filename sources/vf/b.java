package vf;

import org.telegram.messenger.l7;
public class b {
    public Runnable f57331a;
    public Runnable f57332b;
    public Runnable f57333c;

    public b(Runnable runnable, Runnable runnable2) {
        this.f57331a = runnable;
        this.f57333c = runnable2;
    }

    public final void a(boolean z9) {
        Runnable runnable = this.f57332b;
        if (runnable != null) {
            runnable.run();
        }
        c(z9);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z9) {
        Runnable runnable = this.f57333c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f57331a;
        if (runnable != null) {
            runnable.run();
            this.f57331a = null;
        }
    }

    public final void e(l7 l7Var) {
        this.f57332b = l7Var;
    }
}
