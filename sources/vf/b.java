package vf;

import org.telegram.messenger.k7;
public class b {
    public Runnable f57230a;
    public Runnable f57231b;
    public Runnable f57232c;

    public b(Runnable runnable, Runnable runnable2) {
        this.f57230a = runnable;
        this.f57232c = runnable2;
    }

    public final void a(boolean z9) {
        Runnable runnable = this.f57231b;
        if (runnable != null) {
            runnable.run();
        }
        c(z9);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z9) {
        Runnable runnable = this.f57232c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f57230a;
        if (runnable != null) {
            runnable.run();
            this.f57230a = null;
        }
    }

    public final void e(k7 k7Var) {
        this.f57231b = k7Var;
    }
}
