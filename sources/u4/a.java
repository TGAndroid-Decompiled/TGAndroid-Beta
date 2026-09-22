package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f43600a;
    public final ComponentName f43601b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f43600a = cVar;
        this.f43601b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f43600a.f9336m - ((a) obj).f43600a.f9336m;
    }
}
