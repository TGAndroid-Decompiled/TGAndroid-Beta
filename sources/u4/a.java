package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f48835a;
    public final ComponentName f48836b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f48835a = cVar;
        this.f48836b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f48835a.f10220m - ((a) obj).f48835a.f10220m;
    }
}
