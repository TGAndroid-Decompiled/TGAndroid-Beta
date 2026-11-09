package vf;

import org.telegram.messenger.l7;
public class b {
    public Runnable f57335a;
    public Runnable f57336b;
    public Runnable f57337c;

    public b(Runnable runnable, Runnable runnable2) {
        this.f57335a = runnable;
        this.f57337c = runnable2;
    }

    public final void a(boolean z9) {
        Runnable runnable = this.f57336b;
        if (runnable != null) {
            runnable.run();
        }
        c(z9);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z9) {
        Runnable runnable = this.f57337c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f57335a;
        if (runnable != null) {
            runnable.run();
            this.f57335a = null;
        }
    }

    public final void e(l7 l7Var) {
        this.f57336b = l7Var;
    }
}
