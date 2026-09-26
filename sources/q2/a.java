package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f41384a;
    public final c f41385b;

    public a(c cVar) {
        this.f41385b = cVar;
    }

    @Override
    public final void clear() {
        this.f41384a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f41385b.n(this);
    }
}
