package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f48833a;
    public final ComponentName f48834b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f48833a = cVar;
        this.f48834b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f48833a.f10220m - ((a) obj).f48833a.f10220m;
    }
}
