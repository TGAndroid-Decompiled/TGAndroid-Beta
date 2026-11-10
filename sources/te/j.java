package te;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import sg.i0;
public final class j implements Iterable {
    public final h f55523a;

    public j(i iVar, Interpolator interpolator, long j3) {
        this.f55523a = new h(new i0(this, iVar, false, 1), interpolator, j3);
    }

    public final void f(Object obj, boolean z9) {
        List list;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        this.f55523a.m(list, z9);
    }

    @Override
    public final Iterator iterator() {
        return this.f55523a.f55519b.iterator();
    }
}
