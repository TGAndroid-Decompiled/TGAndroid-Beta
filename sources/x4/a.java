package x4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f58500a;
    public final ComponentName f58501b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f58500a = cVar;
        this.f58501b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f58500a.f13406m - ((a) obj).f58500a.f13406m;
    }
}
