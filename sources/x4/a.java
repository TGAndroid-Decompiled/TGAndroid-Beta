package x4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.b f60426a;
    public final ComponentName f60427b;

    public a(g0.b bVar, ComponentName componentName) {
        this.f60426a = bVar;
        this.f60427b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f60426a.f13103m - ((a) obj).f60426a.f13103m;
    }
}
