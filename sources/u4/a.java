package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f43889a;
    public final ComponentName f43890b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f43889a = cVar;
        this.f43890b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f43889a.f9321m - ((a) obj).f43889a.f9321m;
    }
}
