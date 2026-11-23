package q6;

import android.os.Bundle;
public abstract class y {
    public Boolean f55985a;
    public boolean f55986b;
    public final d f55987c;
    public final int d;
    public final Bundle f55988e;
    public final d f55989f;

    public y(d dVar, int i7, Bundle bundle) {
        this.f55989f = dVar;
        Boolean bool = Boolean.TRUE;
        this.f55987c = dVar;
        this.f55985a = bool;
        this.f55986b = false;
        this.d = i7;
        this.f55988e = bundle;
    }

    public abstract boolean a();

    public abstract void b(n6.a aVar);

    public final void c() {
        d();
        d dVar = this.f55987c;
        synchronized (dVar.f55884q) {
            dVar.f55884q.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f55985a = null;
        }
    }
}
