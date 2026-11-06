package x4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f58525a;
    public final ComponentName f58526b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f58525a = cVar;
        this.f58526b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f58525a.f13406m - ((a) obj).f58525a.f13406m;
    }
}
