package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f46191a;
    public final ComponentName f46192b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f46191a = cVar;
        this.f46192b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f46191a.f9846m - ((a) obj).f46191a.f9846m;
    }
}
