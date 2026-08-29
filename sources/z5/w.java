package z5;

import android.os.Bundle;
public abstract class w {
    public Boolean f50687a;
    public boolean f50688b;
    public final g f50689c;
    public final int d;
    public final Bundle f50690e;
    public final g f50691f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f50691f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f50689c = gVar;
        this.f50687a = bool;
        this.f50688b = false;
        this.d = i10;
        this.f50690e = bundle;
    }

    public abstract void a(w5.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f50687a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f50689c.C) {
            this.f50689c.C.remove(this);
        }
    }
}
