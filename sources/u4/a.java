package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f49071a;
    public final ComponentName f49072b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f49071a = cVar;
        this.f49072b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f49071a.f10218m - ((a) obj).f49071a.f10218m;
    }
}
