package x5;

import android.os.Bundle;
public abstract class w {
    public Boolean f48987a;
    public boolean f48988b;
    public final g f48989c;
    public final int d;
    public final Bundle f48990e;
    public final g f48991f;

    public w(g gVar, int i9, Bundle bundle) {
        this.f48991f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f48989c = gVar;
        this.f48987a = bool;
        this.f48988b = false;
        this.d = i9;
        this.f48990e = bundle;
    }

    public abstract void a(u5.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f48987a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f48989c.C) {
            this.f48989c.C.remove(this);
        }
    }
}
