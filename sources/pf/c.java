package pf;
public class c {
    public Runnable f44281a;
    public Runnable f44282b;
    public Runnable f44283c;

    public c(Runnable runnable, Runnable runnable2) {
        this.f44281a = runnable;
        this.f44283c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f44282b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f44283c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f44281a;
        if (runnable != null) {
            runnable.run();
            this.f44281a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f44282b = runnable;
    }
}
