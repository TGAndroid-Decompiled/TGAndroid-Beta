package pf;
public class c {
    public Runnable f43196a;
    public Runnable f43197b;
    public Runnable f43198c;

    public c(Runnable runnable, Runnable runnable2) {
        this.f43196a = runnable;
        this.f43198c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f43197b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f43198c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f43196a;
        if (runnable != null) {
            runnable.run();
            this.f43196a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f43197b = runnable;
    }
}
