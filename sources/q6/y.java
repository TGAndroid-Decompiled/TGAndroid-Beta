package q6;

import android.os.Bundle;
public abstract class y {
    public Boolean f53952a;
    public boolean f53953b;
    public final d f53954c;
    public final int d;
    public final Bundle f53955e;
    public final d f53956f;

    public y(d dVar, int i7, Bundle bundle) {
        this.f53956f = dVar;
        Boolean bool = Boolean.TRUE;
        this.f53954c = dVar;
        this.f53952a = bool;
        this.f53953b = false;
        this.d = i7;
        this.f53955e = bundle;
    }

    public abstract boolean a();

    public abstract void b(n6.a aVar);

    public final void c() {
        d();
        d dVar = this.f53954c;
        synchronized (dVar.f53851q) {
            dVar.f53851q.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f53952a = null;
        }
    }
}
