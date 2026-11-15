package x4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.b f59810a;
    public final ComponentName f59811b;

    public a(g0.b bVar, ComponentName componentName) {
        this.f59810a = bVar;
        this.f59811b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f59810a.f12757m - ((a) obj).f59810a.f12757m;
    }
}
