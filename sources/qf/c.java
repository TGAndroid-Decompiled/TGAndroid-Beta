package qf;
public class c {
    public Runnable f47033a;
    public Runnable f47034b;
    public Runnable f47035c;

    public c(Runnable runnable, Runnable runnable2) {
        this.f47033a = runnable;
        this.f47035c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f47034b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f47035c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f47033a;
        if (runnable != null) {
            runnable.run();
            this.f47033a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f47034b = runnable;
    }
}
