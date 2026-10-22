package pf;
public class c {
    public Runnable f44292a;
    public Runnable f44293b;
    public Runnable f44294c;

    public c(Runnable runnable, Runnable runnable2) {
        this.f44292a = runnable;
        this.f44294c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f44293b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f44294c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f44292a;
        if (runnable != null) {
            runnable.run();
            this.f44292a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f44293b = runnable;
    }
}
