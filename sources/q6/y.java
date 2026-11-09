package q6;

import android.os.Bundle;
public abstract class y {
    public Boolean f53965a;
    public boolean f53966b;
    public final d f53967c;
    public final int d;
    public final Bundle f53968e;
    public final d f53969f;

    public y(d dVar, int i7, Bundle bundle) {
        this.f53969f = dVar;
        Boolean bool = Boolean.TRUE;
        this.f53967c = dVar;
        this.f53965a = bool;
        this.f53966b = false;
        this.d = i7;
        this.f53968e = bundle;
    }

    public abstract boolean a();

    public abstract void b(n6.a aVar);

    public final void c() {
        d();
        d dVar = this.f53967c;
        synchronized (dVar.f53864q) {
            dVar.f53864q.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f53965a = null;
        }
    }
}
