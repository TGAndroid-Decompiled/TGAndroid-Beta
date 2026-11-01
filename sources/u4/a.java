package u4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f50166a;
    public final ComponentName f50167b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f50166a = cVar;
        this.f50167b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f50166a.f7272m - ((a) obj).f50166a.f7272m;
    }
}
