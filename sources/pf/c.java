package pf;
public class c {
    public Runnable f44307a;
    public Runnable f44308b;
    public Runnable f44309c;

    public c(Runnable runnable, Runnable runnable2) {
        this.f44307a = runnable;
        this.f44309c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f44308b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f44309c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f44307a;
        if (runnable != null) {
            runnable.run();
            this.f44307a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f44308b = runnable;
    }
}
