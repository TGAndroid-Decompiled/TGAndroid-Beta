package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f41385a;
    public final c f41386b;

    public a(c cVar) {
        this.f41386b = cVar;
    }

    @Override
    public final void clear() {
        this.f41385a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f41386b.n(this);
    }
}
