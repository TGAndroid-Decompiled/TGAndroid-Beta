package vf;

import org.telegram.messenger.l7;
public class b {
    public Runnable f57323a;
    public Runnable f57324b;
    public Runnable f57325c;

    public b(Runnable runnable, Runnable runnable2) {
        this.f57323a = runnable;
        this.f57325c = runnable2;
    }

    public final void a(boolean z9) {
        Runnable runnable = this.f57324b;
        if (runnable != null) {
            runnable.run();
        }
        c(z9);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z9) {
        Runnable runnable = this.f57325c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f57323a;
        if (runnable != null) {
            runnable.run();
            this.f57323a = null;
        }
    }

    public final void e(l7 l7Var) {
        this.f57324b = l7Var;
    }
}
