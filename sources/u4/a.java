package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f42575a;
    public final ComponentName f42576b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f42575a = cVar;
        this.f42576b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f42575a.f8467m - ((a) obj).f42575a.f8467m;
    }
}
