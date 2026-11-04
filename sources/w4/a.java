package w4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f57376a;
    public final ComponentName f57377b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f57376a = cVar;
        this.f57377b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f57376a.f11791m - ((a) obj).f57376a.f11791m;
    }
}
