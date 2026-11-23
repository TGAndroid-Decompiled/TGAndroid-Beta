package x4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f60509a;
    public final ComponentName f60510b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f60509a = cVar;
        this.f60510b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f60509a.f13065m - ((a) obj).f60509a.f13065m;
    }
}
