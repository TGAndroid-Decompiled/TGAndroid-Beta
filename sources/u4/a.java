package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f49608a;
    public final ComponentName f49609b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f49608a = cVar;
        this.f49609b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f49608a.f12217m - ((a) obj).f49608a.f12217m;
    }
}
