package q6;

import android.os.Bundle;
public abstract class y {
    public Boolean f55401a;
    public boolean f55402b;
    public final d f55403c;
    public final int d;
    public final Bundle f55404e;
    public final d f55405f;

    public y(d dVar, int i7, Bundle bundle) {
        this.f55405f = dVar;
        Boolean bool = Boolean.TRUE;
        this.f55403c = dVar;
        this.f55401a = bool;
        this.f55402b = false;
        this.d = i7;
        this.f55404e = bundle;
    }

    public abstract boolean a();

    public abstract void b(n6.a aVar);

    public final void c() {
        d();
        d dVar = this.f55403c;
        synchronized (dVar.f55300q) {
            dVar.f55300q.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f55401a = null;
        }
    }
}
