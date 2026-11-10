package q6;

import android.os.Bundle;
public abstract class y {
    public Boolean f53964a;
    public boolean f53965b;
    public final d f53966c;
    public final int d;
    public final Bundle f53967e;
    public final d f53968f;

    public y(d dVar, int i7, Bundle bundle) {
        this.f53968f = dVar;
        Boolean bool = Boolean.TRUE;
        this.f53966c = dVar;
        this.f53964a = bool;
        this.f53965b = false;
        this.d = i7;
        this.f53967e = bundle;
    }

    public abstract boolean a();

    public abstract void b(n6.a aVar);

    public final void c() {
        d();
        d dVar = this.f53966c;
        synchronized (dVar.f53863q) {
            dVar.f53863q.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f53964a = null;
        }
    }
}
