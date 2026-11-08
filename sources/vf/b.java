package vf;

import org.telegram.messenger.l7;
public class b {
    public Runnable f57322a;
    public Runnable f57323b;
    public Runnable f57324c;

    public b(Runnable runnable, Runnable runnable2) {
        this.f57322a = runnable;
        this.f57324c = runnable2;
    }

    public final void a(boolean z9) {
        Runnable runnable = this.f57323b;
        if (runnable != null) {
            runnable.run();
        }
        c(z9);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z9) {
        Runnable runnable = this.f57324c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f57322a;
        if (runnable != null) {
            runnable.run();
            this.f57322a = null;
        }
    }

    public final void e(l7 l7Var) {
        this.f57323b = l7Var;
    }
}
