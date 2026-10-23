package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f47589a;
    public final ComponentName f47590b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f47589a = cVar;
        this.f47590b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f47589a.f10751m - ((a) obj).f47589a.f10751m;
    }
}
