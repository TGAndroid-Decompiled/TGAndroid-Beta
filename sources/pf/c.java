package pf;
public class c {
    public Runnable f44706a;
    public Runnable f44707b;
    public Runnable f44708c;

    public c(Runnable runnable, Runnable runnable2) {
        this.f44706a = runnable;
        this.f44708c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f44707b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f44708c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f44706a;
        if (runnable != null) {
            runnable.run();
            this.f44706a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f44707b = runnable;
    }
}
