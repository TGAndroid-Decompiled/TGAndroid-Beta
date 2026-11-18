package x4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.b f60380a;
    public final ComponentName f60381b;

    public a(g0.b bVar, ComponentName componentName) {
        this.f60380a = bVar;
        this.f60381b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f60380a.f13074m - ((a) obj).f60380a.f13074m;
    }
}
