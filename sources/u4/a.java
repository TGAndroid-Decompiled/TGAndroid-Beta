package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f43875a;
    public final ComponentName f43876b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f43875a = cVar;
        this.f43876b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f43875a.f9321m - ((a) obj).f43875a.f9321m;
    }
}
