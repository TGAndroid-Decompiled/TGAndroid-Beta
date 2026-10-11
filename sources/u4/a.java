package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f48956a;
    public final ComponentName f48957b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f48956a = cVar;
        this.f48957b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f48956a.f10219m - ((a) obj).f48956a.f10219m;
    }
}
