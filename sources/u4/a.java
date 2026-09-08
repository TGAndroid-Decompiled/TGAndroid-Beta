package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f46959a;
    public final ComponentName f46960b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f46959a = cVar;
        this.f46960b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f46959a.f10311m - ((a) obj).f46959a.f10311m;
    }
}
