package vf;

import org.telegram.messenger.k7;
public class b {
    public Runnable f57206a;
    public Runnable f57207b;
    public Runnable f57208c;

    public b(Runnable runnable, Runnable runnable2) {
        this.f57206a = runnable;
        this.f57208c = runnable2;
    }

    public final void a(boolean z9) {
        Runnable runnable = this.f57207b;
        if (runnable != null) {
            runnable.run();
        }
        c(z9);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z9) {
        Runnable runnable = this.f57208c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f57206a;
        if (runnable != null) {
            runnable.run();
            this.f57206a = null;
        }
    }

    public final void e(k7 k7Var) {
        this.f57207b = k7Var;
    }
}
