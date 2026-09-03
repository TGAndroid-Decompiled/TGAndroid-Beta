package xd;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import q5.c0;
public final class j implements Iterable {
    public final h f46980a;

    public j(i iVar, Interpolator interpolator, long j10) {
        this.f46980a = new h(new c0(this, iVar, false, 18), interpolator, j10);
    }

    public final void i(Object obj, boolean z4) {
        List list;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        this.f46980a.r(list, z4);
    }

    @Override
    public final Iterator iterator() {
        return this.f46980a.f46977b.iterator();
    }
}
