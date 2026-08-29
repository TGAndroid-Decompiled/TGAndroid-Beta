package vd;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import v5.n;
public final class k implements Iterable {
    public final i f49530a;

    public k(j jVar, Interpolator interpolator, long j10) {
        this.f49530a = new i(new n(this, jVar, false, 1), interpolator, j10);
    }

    public final void i(Object obj, boolean z10) {
        List list;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        this.f49530a.r(list, z10);
    }

    @Override
    public final Iterator iterator() {
        return this.f49530a.f49526b.iterator();
    }
}
