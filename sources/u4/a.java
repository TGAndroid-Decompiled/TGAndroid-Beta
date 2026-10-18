package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f47577a;
    public final ComponentName f47578b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f47577a = cVar;
        this.f47578b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f47577a.f10752m - ((a) obj).f47577a.f10752m;
    }
}
