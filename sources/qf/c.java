package qf;
public class c {
    public Runnable f47068a;
    public Runnable f47069b;
    public Runnable f47070c;

    public c(Runnable runnable, Runnable runnable2) {
        this.f47068a = runnable;
        this.f47070c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f47069b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f47070c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f47068a;
        if (runnable != null) {
            runnable.run();
            this.f47068a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f47069b = runnable;
    }
}
