package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f48922a;
    public final ComponentName f48923b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f48922a = cVar;
        this.f48923b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f48922a.f10219m - ((a) obj).f48922a.f10219m;
    }
}
