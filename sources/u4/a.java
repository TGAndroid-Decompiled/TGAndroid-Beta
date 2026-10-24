package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f48028a;
    public final ComponentName f48029b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f48028a = cVar;
        this.f48029b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f48028a.f10770m - ((a) obj).f48028a.f10770m;
    }
}
