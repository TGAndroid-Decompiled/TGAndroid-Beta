package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f47599a;
    public final ComponentName f47600b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f47599a = cVar;
        this.f47600b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f47599a.f10752m - ((a) obj).f47599a.f10752m;
    }
}
