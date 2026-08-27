package ud;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import org.telegram.ui.i6;

public final class j implements Iterable {

    public final h f48521a;

    public j(i iVar, Interpolator interpolator, long j10) {
        this.f48521a = new h(new i6(24, this, iVar), interpolator, j10);
    }

    public final void i(Object obj, boolean z10) {
        this.f48521a.r(obj != null ? Collections.singletonList(obj) : null, z10);
    }

    @Override
    public final Iterator iterator() {
        return this.f48521a.f48517b.iterator();
    }
}
