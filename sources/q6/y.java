package q6;

import android.os.Bundle;
public abstract class y {
    public Boolean f53859a;
    public boolean f53860b;
    public final d f53861c;
    public final int d;
    public final Bundle f53862e;
    public final d f53863f;

    public y(d dVar, int i7, Bundle bundle) {
        this.f53863f = dVar;
        Boolean bool = Boolean.TRUE;
        this.f53861c = dVar;
        this.f53859a = bool;
        this.f53860b = false;
        this.d = i7;
        this.f53862e = bundle;
    }

    public abstract boolean a();

    public abstract void b(n6.a aVar);

    public final void c() {
        d();
        d dVar = this.f53861c;
        synchronized (dVar.f53758q) {
            dVar.f53758q.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f53859a = null;
        }
    }
}
