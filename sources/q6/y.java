package q6;

import android.os.Bundle;
public abstract class y {
    public Boolean f53835a;
    public boolean f53836b;
    public final d f53837c;
    public final int d;
    public final Bundle f53838e;
    public final d f53839f;

    public y(d dVar, int i7, Bundle bundle) {
        this.f53839f = dVar;
        Boolean bool = Boolean.TRUE;
        this.f53837c = dVar;
        this.f53835a = bool;
        this.f53836b = false;
        this.d = i7;
        this.f53838e = bundle;
    }

    public abstract boolean a();

    public abstract void b(n6.a aVar);

    public final void c() {
        d();
        d dVar = this.f53837c;
        synchronized (dVar.f53734q) {
            dVar.f53734q.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f53835a = null;
        }
    }
}
