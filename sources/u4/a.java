package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f50152a;
    public final ComponentName f50153b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f50152a = cVar;
        this.f50153b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f50152a.f7271m - ((a) obj).f50152a.f7271m;
    }
}
