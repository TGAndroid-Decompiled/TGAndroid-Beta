package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f47585a;
    public final ComponentName f47586b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f47585a = cVar;
        this.f47586b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f47585a.f10751m - ((a) obj).f47585a.f10751m;
    }
}
