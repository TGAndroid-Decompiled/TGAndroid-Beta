package vf;

import org.telegram.messenger.l7;
public class b {
    public Runnable f59379a;
    public Runnable f59380b;
    public Runnable f59381c;

    public b(Runnable runnable, Runnable runnable2) {
        this.f59379a = runnable;
        this.f59381c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f59380b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f59381c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f59379a;
        if (runnable != null) {
            runnable.run();
            this.f59379a = null;
        }
    }

    public final void e(l7 l7Var) {
        this.f59380b = l7Var;
    }
}
