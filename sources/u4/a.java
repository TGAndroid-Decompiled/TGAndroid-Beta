package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f47521a;
    public final ComponentName f47522b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f47521a = cVar;
        this.f47522b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f47521a.f10146m - ((a) obj).f47521a.f10146m;
    }
}
