package vf;

import org.telegram.messenger.l7;
public class b {
    public Runnable f59416a;
    public Runnable f59417b;
    public Runnable f59418c;

    public b(Runnable runnable, Runnable runnable2) {
        this.f59416a = runnable;
        this.f59418c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f59417b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f59418c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f59416a;
        if (runnable != null) {
            runnable.run();
            this.f59416a = null;
        }
    }

    public final void e(l7 l7Var) {
        this.f59417b = l7Var;
    }
}
