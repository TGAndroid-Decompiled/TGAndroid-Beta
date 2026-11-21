package x4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.b f60422a;
    public final ComponentName f60423b;

    public a(g0.b bVar, ComponentName componentName) {
        this.f60422a = bVar;
        this.f60423b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f60422a.f13100m - ((a) obj).f60422a.f13100m;
    }
}
