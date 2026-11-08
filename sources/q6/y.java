package q6;

import android.os.Bundle;
public abstract class y {
    public Boolean f53953a;
    public boolean f53954b;
    public final d f53955c;
    public final int d;
    public final Bundle f53956e;
    public final d f53957f;

    public y(d dVar, int i7, Bundle bundle) {
        this.f53957f = dVar;
        Boolean bool = Boolean.TRUE;
        this.f53955c = dVar;
        this.f53953a = bool;
        this.f53954b = false;
        this.d = i7;
        this.f53956e = bundle;
    }

    public abstract boolean a();

    public abstract void b(n6.a aVar);

    public final void c() {
        d();
        d dVar = this.f53955c;
        synchronized (dVar.f53852q) {
            dVar.f53852q.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f53953a = null;
        }
    }
}
