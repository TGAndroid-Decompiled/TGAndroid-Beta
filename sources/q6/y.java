package q6;

import android.os.Bundle;
public abstract class y {
    public Boolean f56016a;
    public boolean f56017b;
    public final d f56018c;
    public final int d;
    public final Bundle f56019e;
    public final d f56020f;

    public y(d dVar, int i7, Bundle bundle) {
        this.f56020f = dVar;
        Boolean bool = Boolean.TRUE;
        this.f56018c = dVar;
        this.f56016a = bool;
        this.f56017b = false;
        this.d = i7;
        this.f56019e = bundle;
    }

    public abstract boolean a();

    public abstract void b(n6.a aVar);

    public final void c() {
        d();
        d dVar = this.f56018c;
        synchronized (dVar.f55915q) {
            dVar.f55915q.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f56016a = null;
        }
    }
}
