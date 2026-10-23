package pf;
public class c {
    public Runnable f44293a;
    public Runnable f44294b;
    public Runnable f44295c;

    public c(Runnable runnable, Runnable runnable2) {
        this.f44293a = runnable;
        this.f44295c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f44294b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f44295c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f44293a;
        if (runnable != null) {
            runnable.run();
            this.f44293a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f44294b = runnable;
    }
}
