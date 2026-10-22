package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f47588a;
    public final ComponentName f47589b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f47588a = cVar;
        this.f47589b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f47588a.f10751m - ((a) obj).f47588a.f10751m;
    }
}
