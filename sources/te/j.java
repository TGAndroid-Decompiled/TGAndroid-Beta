package te;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public final class j implements Iterable {
    public final h f57804a;

    public j(i iVar, Interpolator interpolator, long j3) {
        this.f57804a = new h(new s2.e(this, iVar, false, 2), interpolator, j3);
    }

    public final void f(Object obj, boolean z10) {
        List list;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        this.f57804a.m(list, z10);
    }

    @Override
    public final Iterator iterator() {
        return this.f57804a.f57800b.iterator();
    }
}
