package vf;

import org.telegram.messenger.l7;
public class b {
    public Runnable f59373a;
    public Runnable f59374b;
    public Runnable f59375c;

    public b(Runnable runnable, Runnable runnable2) {
        this.f59373a = runnable;
        this.f59375c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f59374b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f59375c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f59373a;
        if (runnable != null) {
            runnable.run();
            this.f59373a = null;
        }
    }

    public final void e(l7 l7Var) {
        this.f59374b = l7Var;
    }
}
