package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f49063a;
    public final ComponentName f49064b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f49063a = cVar;
        this.f49064b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f49063a.f10218m - ((a) obj).f49063a.f10218m;
    }
}
