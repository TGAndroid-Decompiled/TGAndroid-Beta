package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f47530a;
    public final ComponentName f47531b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f47530a = cVar;
        this.f47531b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f47530a.f10147m - ((a) obj).f47530a.f10147m;
    }
}
