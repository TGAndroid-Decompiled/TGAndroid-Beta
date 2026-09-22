package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f43927a;
    public final ComponentName f43928b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f43927a = cVar;
        this.f43928b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f43927a.f9339m - ((a) obj).f43927a.f9339m;
    }
}
