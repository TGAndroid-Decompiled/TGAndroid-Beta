package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f43891a;
    public final ComponentName f43892b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f43891a = cVar;
        this.f43892b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f43891a.f9321m - ((a) obj).f43891a.f9321m;
    }
}
