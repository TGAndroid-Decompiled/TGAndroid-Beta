package q6;

import android.os.Bundle;
public abstract class y {
    public Boolean f56098a;
    public boolean f56099b;
    public final d f56100c;
    public final int d;
    public final Bundle f56101e;
    public final d f56102f;

    public y(d dVar, int i7, Bundle bundle) {
        this.f56102f = dVar;
        Boolean bool = Boolean.TRUE;
        this.f56100c = dVar;
        this.f56098a = bool;
        this.f56099b = false;
        this.d = i7;
        this.f56101e = bundle;
    }

    public abstract boolean a();

    public abstract void b(n6.a aVar);

    public final void c() {
        d();
        d dVar = this.f56100c;
        synchronized (dVar.f55997q) {
            dVar.f55997q.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f56098a = null;
        }
    }
}
