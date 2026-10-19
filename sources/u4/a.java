package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f47575a;
    public final ComponentName f47576b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f47575a = cVar;
        this.f47576b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f47575a.f10753m - ((a) obj).f47575a.f10753m;
    }
}
