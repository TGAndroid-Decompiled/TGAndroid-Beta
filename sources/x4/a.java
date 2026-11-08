package x4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f58620a;
    public final ComponentName f58621b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f58620a = cVar;
        this.f58621b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f58620a.f13406m - ((a) obj).f58620a.f13406m;
    }
}
