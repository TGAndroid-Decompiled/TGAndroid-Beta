package p6;

import android.os.Bundle;
public abstract class y {
    public Boolean f53329a;
    public boolean f53330b;
    public final d f53331c;
    public final int d;
    public final Bundle f53332e;
    public final d f53333f;

    public y(d dVar, int i3, Bundle bundle) {
        this.f53333f = dVar;
        Boolean bool = Boolean.TRUE;
        this.f53331c = dVar;
        this.f53329a = bool;
        this.f53330b = false;
        this.d = i3;
        this.f53332e = bundle;
    }

    public abstract boolean a();

    public abstract void b(m6.a aVar);

    public final void c() {
        d();
        d dVar = this.f53331c;
        synchronized (dVar.f53228q) {
            dVar.f53228q.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f53329a = null;
        }
    }
}
