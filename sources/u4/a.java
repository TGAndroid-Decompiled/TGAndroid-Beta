package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f46932a;
    public final ComponentName f46933b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f46932a = cVar;
        this.f46933b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f46932a.f10283m - ((a) obj).f46932a.f10283m;
    }
}
