package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f43997a;
    public final ComponentName f43998b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f43997a = cVar;
        this.f43998b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f43997a.f9333m - ((a) obj).f43997a.f9333m;
    }
}
