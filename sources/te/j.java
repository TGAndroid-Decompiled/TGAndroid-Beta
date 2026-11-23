package te;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import sg.h0;
public final class j implements Iterable {
    public final h f57690a;

    public j(i iVar, Interpolator interpolator, long j3) {
        this.f57690a = new h(new h0(this, iVar, false, 1), interpolator, j3);
    }

    public final void f(Object obj, boolean z10) {
        List list;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        this.f57690a.m(list, z10);
    }

    @Override
    public final Iterator iterator() {
        return this.f57690a.f57686b.iterator();
    }
}
