package x4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f58524a;
    public final ComponentName f58525b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f58524a = cVar;
        this.f58525b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f58524a.f13406m - ((a) obj).f58524a.f13406m;
    }
}
