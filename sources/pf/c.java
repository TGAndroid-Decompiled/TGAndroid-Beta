package pf;
public class c {
    public Runnable f42897a;
    public Runnable f42898b;
    public Runnable f42899c;

    public c(Runnable runnable, Runnable runnable2) {
        this.f42897a = runnable;
        this.f42899c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f42898b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f42899c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f42897a;
        if (runnable != null) {
            runnable.run();
            this.f42897a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f42898b = runnable;
    }
}
