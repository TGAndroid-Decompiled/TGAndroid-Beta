package qe;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m2.t;
public final class j implements Iterable {
    public final h f53865a;

    public j(i iVar, Interpolator interpolator, long j10) {
        this.f53865a = new h(new t(22, this, iVar), interpolator, j10);
    }

    public final void h(Object obj, boolean z10) {
        List list;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        this.f53865a.m(list, z10);
    }

    @Override
    public final Iterator iterator() {
        return this.f53865a.f53861b.iterator();
    }
}
