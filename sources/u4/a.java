package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f43932a;
    public final ComponentName f43933b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f43932a = cVar;
        this.f43933b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f43932a.f9326m - ((a) obj).f43932a.f9326m;
    }
}
