package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f43906a;
    public final ComponentName f43907b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f43906a = cVar;
        this.f43907b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f43906a.f9339m - ((a) obj).f43906a.f9339m;
    }
}
