package x4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f58530a;
    public final ComponentName f58531b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f58530a = cVar;
        this.f58531b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f58530a.f13406m - ((a) obj).f58530a.f13406m;
    }
}
