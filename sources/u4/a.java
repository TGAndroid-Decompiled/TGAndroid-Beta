package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f43627a;
    public final ComponentName f43628b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f43627a = cVar;
        this.f43628b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f43627a.f9339m - ((a) obj).f43627a.f9339m;
    }
}
