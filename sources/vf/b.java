package vf;

import org.telegram.messenger.l7;
public class b {
    public Runnable f59374a;
    public Runnable f59375b;
    public Runnable f59376c;

    public b(Runnable runnable, Runnable runnable2) {
        this.f59374a = runnable;
        this.f59376c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f59375b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f59376c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f59374a;
        if (runnable != null) {
            runnable.run();
            this.f59374a = null;
        }
    }

    public final void e(l7 l7Var) {
        this.f59375b = l7Var;
    }
}
