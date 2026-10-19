package pf;
public class c {
    public Runnable f44279a;
    public Runnable f44280b;
    public Runnable f44281c;

    public c(Runnable runnable, Runnable runnable2) {
        this.f44279a = runnable;
        this.f44281c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f44280b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f44281c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f44279a;
        if (runnable != null) {
            runnable.run();
            this.f44279a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f44280b = runnable;
    }
}
