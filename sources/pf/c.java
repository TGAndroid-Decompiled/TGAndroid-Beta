package pf;
public class c {
    public Runnable f44705a;
    public Runnable f44706b;
    public Runnable f44707c;

    public c(Runnable runnable, Runnable runnable2) {
        this.f44705a = runnable;
        this.f44707c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f44706b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f44707c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f44705a;
        if (runnable != null) {
            runnable.run();
            this.f44705a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f44706b = runnable;
    }
}
