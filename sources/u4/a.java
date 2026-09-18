package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f43859a;
    public final ComponentName f43860b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f43859a = cVar;
        this.f43860b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f43859a.f9338m - ((a) obj).f43859a.f9338m;
    }
}
