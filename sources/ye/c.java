package ye;
public class c {
    public Runnable f50514a;
    public Runnable f50515b;
    public Runnable f50516c;

    public c(Runnable runnable, Runnable runnable2) {
        this.f50514a = runnable;
        this.f50516c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f50515b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f50516c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f50514a;
        if (runnable != null) {
            runnable.run();
            this.f50514a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f50515b = runnable;
    }
}
