package we;

public class d {

    public Runnable f49292a;

    public Runnable f49293b;

    public Runnable f49294c;

    public d(Runnable runnable, Runnable runnable2) {
        this.f49292a = runnable;
        this.f49294c = runnable2;
    }

    public final void a(boolean z10) {
        Runnable runnable = this.f49293b;
        if (runnable != null) {
            runnable.run();
        }
        c(z10);
    }

    public void b() {
        c(false);
    }

    public void c(boolean z10) {
        Runnable runnable = this.f49294c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d() {
        Runnable runnable = this.f49292a;
        if (runnable != null) {
            runnable.run();
            this.f49292a = null;
        }
    }

    public final void e(Runnable runnable) {
        this.f49293b = runnable;
    }
}
