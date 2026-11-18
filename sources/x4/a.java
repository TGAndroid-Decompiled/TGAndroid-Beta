package x4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.b f60381a;
    public final ComponentName f60382b;

    public a(g0.b bVar, ComponentName componentName) {
        this.f60381a = bVar;
        this.f60382b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f60381a.f13071m - ((a) obj).f60381a.f13071m;
    }
}
