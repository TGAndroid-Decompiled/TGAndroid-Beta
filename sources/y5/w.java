package y5;

import android.os.Bundle;

public abstract class w {

    public Boolean f49704a;

    public boolean f49705b;

    public final g f49706c;
    public final int d;

    public final Bundle f49707e;

    public final g f49708f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f49708f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f49706c = gVar;
        this.f49704a = bool;
        this.f49705b = false;
        this.d = i10;
        this.f49707e = bundle;
    }

    public abstract void a(v5.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f49704a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f49706c.C) {
            this.f49706c.C.remove(this);
        }
    }
}
