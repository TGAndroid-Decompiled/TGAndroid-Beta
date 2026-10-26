package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f49573a;
    public final ComponentName f49574b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f49573a = cVar;
        this.f49574b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f49573a.f12218m - ((a) obj).f49573a.f12218m;
    }
}
