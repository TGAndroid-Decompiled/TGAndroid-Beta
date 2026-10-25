package qf;
public class c {
    public Runnable f47030a;
    public Runnable f47031b;
    public Runnable f47032c;

    public c(Runnable runnable, Runnable runnable2) {
        this.f47030a = runnable;
        this.f47032c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f47031b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f47032c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f47030a;
        if (runnable != null) {
            runnable.run();
            this.f47030a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f47031b = runnable;
    }
}
