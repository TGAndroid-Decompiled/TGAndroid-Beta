package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f49570a;
    public final ComponentName f49571b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f49570a = cVar;
        this.f49571b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f49570a.f12218m - ((a) obj).f49570a.f12218m;
    }
}
