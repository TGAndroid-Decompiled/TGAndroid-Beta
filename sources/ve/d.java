package ve;
public class d {
    public Runnable f48381a;
    public Runnable f48382b;
    public Runnable f48383c;

    public d(Runnable runnable, Runnable runnable2) {
        this.f48381a = runnable;
        this.f48383c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f48382b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f48383c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f48381a;
        if (runnable != null) {
            runnable.run();
            this.f48381a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f48382b = runnable;
    }
}
