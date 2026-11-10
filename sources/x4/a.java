package x4;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f58627a;
    public final ComponentName f58628b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f58627a = cVar;
        this.f58628b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f58627a.f13408m - ((a) obj).f58627a.f13408m;
    }
}
