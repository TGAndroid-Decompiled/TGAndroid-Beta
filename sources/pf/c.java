package pf;
public class c {
    public Runnable f44284a;
    public Runnable f44285b;
    public Runnable f44286c;

    public c(Runnable runnable, Runnable runnable2) {
        this.f44284a = runnable;
        this.f44286c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f44285b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f44286c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f44284a;
        if (runnable != null) {
            runnable.run();
            this.f44284a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f44285b = runnable;
    }
}
