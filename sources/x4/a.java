package x4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f58619a;
    public final ComponentName f58620b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f58619a = cVar;
        this.f58620b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f58619a.f13406m - ((a) obj).f58619a.f13406m;
    }
}
