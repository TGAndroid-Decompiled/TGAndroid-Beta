package x4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f60391a;
    public final ComponentName f60392b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f60391a = cVar;
        this.f60392b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f60391a.f13066m - ((a) obj).f60391a.f13066m;
    }
}
