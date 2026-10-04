package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f47522a;
    public final ComponentName f47523b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f47522a = cVar;
        this.f47523b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f47522a.f10146m - ((a) obj).f47522a.f10146m;
    }
}
