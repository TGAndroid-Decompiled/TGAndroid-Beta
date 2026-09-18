package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f43632a;
    public final ComponentName f43633b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f43632a = cVar;
        this.f43633b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f43632a.f9339m - ((a) obj).f43632a.f9339m;
    }
}
