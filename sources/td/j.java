package td;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.telegram.ui.Cells.e3;
public final class j implements Iterable {
    public final h f47799a;

    public j(i iVar, Interpolator interpolator, long j10) {
        this.f47799a = new h(new e3(23, this, iVar), interpolator, j10);
    }

    public final void i(Object obj, boolean z10) {
        List list;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        this.f47799a.r(list, z10);
    }

    @Override
    public final Iterator iterator() {
        return this.f47799a.f47795b.iterator();
    }
}
