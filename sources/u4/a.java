package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f48029a;
    public final ComponentName f48030b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f48029a = cVar;
        this.f48030b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f48029a.f10770m - ((a) obj).f48029a.f10770m;
    }
}
