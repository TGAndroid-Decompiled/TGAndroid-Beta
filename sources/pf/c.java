package pf;
public class c {
    public Runnable f44327a;
    public Runnable f44328b;
    public Runnable f44329c;

    public c(Runnable runnable, Runnable runnable2) {
        this.f44327a = runnable;
        this.f44329c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f44328b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f44329c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f44327a;
        if (runnable != null) {
            runnable.run();
            this.f44327a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f44328b = runnable;
    }
}
