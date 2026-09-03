package ze;
public class c {
    public Runnable f47467a;
    public Runnable f47468b;
    public Runnable f47469c;

    public c(Runnable runnable, Runnable runnable2) {
        this.f47467a = runnable;
        this.f47469c = runnable2;
    }

    public final void a(boolean z4) {
        Runnable runnable = this.f47468b;
        if (runnable != null) {
            runnable.run();
        }
        c(z4);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z4) {
        Runnable runnable = this.f47469c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f47467a;
        if (runnable != null) {
            runnable.run();
            this.f47467a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f47468b = runnable;
    }
}
