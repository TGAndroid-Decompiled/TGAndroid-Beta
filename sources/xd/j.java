package xd;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import q5.g0;
public final class j implements Iterable {
    public final h f50529a;

    public j(i iVar, Interpolator interpolator, long j10) {
        this.f50529a = new h(new g0(this, iVar, false, 17), interpolator, j10);
    }

    public final void i(Object obj, boolean z4) {
        List list;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        this.f50529a.r(list, z4);
    }

    @Override
    public final Iterator iterator() {
        return this.f50529a.f50525b.iterator();
    }
}
