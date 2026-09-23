package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f43552a;
    public final ComponentName f43553b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f43552a = cVar;
        this.f43553b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f43552a.f9322m - ((a) obj).f43552a.f9322m;
    }
}
