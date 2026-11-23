package q6;

import android.os.Bundle;
public abstract class y {
    public Boolean f56020a;
    public boolean f56021b;
    public final d f56022c;
    public final int d;
    public final Bundle f56023e;
    public final d f56024f;

    public y(d dVar, int i7, Bundle bundle) {
        this.f56024f = dVar;
        Boolean bool = Boolean.TRUE;
        this.f56022c = dVar;
        this.f56020a = bool;
        this.f56021b = false;
        this.d = i7;
        this.f56023e = bundle;
    }

    public abstract boolean a();

    public abstract void b(n6.a aVar);

    public final void c() {
        d();
        d dVar = this.f56022c;
        synchronized (dVar.f55919q) {
            dVar.f55919q.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f56020a = null;
        }
    }
}
