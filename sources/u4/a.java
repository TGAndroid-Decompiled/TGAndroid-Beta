package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f47621a;
    public final ComponentName f47622b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f47621a = cVar;
        this.f47622b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f47621a.f10754m - ((a) obj).f47621a.f10754m;
    }
}
