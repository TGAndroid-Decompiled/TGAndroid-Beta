package vf;

import org.telegram.messenger.l7;
public class b {
    public Runnable f59412a;
    public Runnable f59413b;
    public Runnable f59414c;

    public b(Runnable runnable, Runnable runnable2) {
        this.f59412a = runnable;
        this.f59414c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f59413b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f59414c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f59412a;
        if (runnable != null) {
            runnable.run();
            this.f59412a = null;
        }
    }

    public final void e(l7 l7Var) {
        this.f59413b = l7Var;
    }
}
