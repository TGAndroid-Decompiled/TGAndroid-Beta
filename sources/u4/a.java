package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f43890a;
    public final ComponentName f43891b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f43890a = cVar;
        this.f43891b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f43890a.f9321m - ((a) obj).f43890a.f9321m;
    }
}
