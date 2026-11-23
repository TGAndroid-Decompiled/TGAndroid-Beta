package vf;

import org.telegram.messenger.l7;
public class b {
    public Runnable f59501a;
    public Runnable f59502b;
    public Runnable f59503c;

    public b(Runnable runnable, Runnable runnable2) {
        this.f59501a = runnable;
        this.f59503c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f59502b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f59503c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f59501a;
        if (runnable != null) {
            runnable.run();
            this.f59501a = null;
        }
    }

    public final void e(l7 l7Var) {
        this.f59502b = l7Var;
    }
}
