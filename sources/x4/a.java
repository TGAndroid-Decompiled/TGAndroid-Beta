package x4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f58629a;
    public final ComponentName f58630b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f58629a = cVar;
        this.f58630b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f58629a.f13406m - ((a) obj).f58629a.f13406m;
    }
}
