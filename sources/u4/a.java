package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f48879a;
    public final ComponentName f48880b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f48879a = cVar;
        this.f48880b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f48879a.f10220m - ((a) obj).f48879a.f10220m;
    }
}
