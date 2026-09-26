package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f43888a;
    public final ComponentName f43889b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f43888a = cVar;
        this.f43889b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f43888a.f9321m - ((a) obj).f43888a.f9321m;
    }
}
