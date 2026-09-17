package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f46960a;
    public final ComponentName f46961b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f46960a = cVar;
        this.f46961b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f46960a.f10311m - ((a) obj).f46960a.f10311m;
    }
}
