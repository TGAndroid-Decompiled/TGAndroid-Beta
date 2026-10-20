package pf;
public class c {
    public Runnable f44289a;
    public Runnable f44290b;
    public Runnable f44291c;

    public c(Runnable runnable, Runnable runnable2) {
        this.f44289a = runnable;
        this.f44291c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f44290b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f44291c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f44289a;
        if (runnable != null) {
            runnable.run();
            this.f44289a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f44290b = runnable;
    }
}
