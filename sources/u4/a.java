package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f43604a;
    public final ComponentName f43605b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f43604a = cVar;
        this.f43605b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f43604a.f9334m - ((a) obj).f43604a.f9334m;
    }
}
