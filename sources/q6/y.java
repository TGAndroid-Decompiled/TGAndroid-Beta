package q6;

import android.os.Bundle;
public abstract class y {
    public Boolean f53860a;
    public boolean f53861b;
    public final d f53862c;
    public final int d;
    public final Bundle f53863e;
    public final d f53864f;

    public y(d dVar, int i7, Bundle bundle) {
        this.f53864f = dVar;
        Boolean bool = Boolean.TRUE;
        this.f53862c = dVar;
        this.f53860a = bool;
        this.f53861b = false;
        this.d = i7;
        this.f53863e = bundle;
    }

    public abstract boolean a();

    public abstract void b(n6.a aVar);

    public final void c() {
        d();
        d dVar = this.f53862c;
        synchronized (dVar.f53759q) {
            dVar.f53759q.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f53860a = null;
        }
    }
}
