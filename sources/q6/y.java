package q6;

import android.os.Bundle;
public abstract class y {
    public Boolean f55975a;
    public boolean f55976b;
    public final d f55977c;
    public final int d;
    public final Bundle f55978e;
    public final d f55979f;

    public y(d dVar, int i7, Bundle bundle) {
        this.f55979f = dVar;
        Boolean bool = Boolean.TRUE;
        this.f55977c = dVar;
        this.f55975a = bool;
        this.f55976b = false;
        this.d = i7;
        this.f55978e = bundle;
    }

    public abstract boolean a();

    public abstract void b(n6.a aVar);

    public final void c() {
        d();
        d dVar = this.f55977c;
        synchronized (dVar.f55874q) {
            dVar.f55874q.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f55975a = null;
        }
    }
}
