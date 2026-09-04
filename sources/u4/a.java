package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f46931a;
    public final ComponentName f46932b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f46931a = cVar;
        this.f46932b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f46931a.f10283m - ((a) obj).f46931a.f10283m;
    }
}
