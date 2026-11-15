package vf;

import org.telegram.messenger.l7;
public class b {
    public Runnable f58804a;
    public Runnable f58805b;
    public Runnable f58806c;

    public b(Runnable runnable, Runnable runnable2) {
        this.f58804a = runnable;
        this.f58806c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f58805b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f58806c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f58804a;
        if (runnable != null) {
            runnable.run();
            this.f58804a = null;
        }
    }

    public final void e(l7 l7Var) {
        this.f58805b = l7Var;
    }
}
