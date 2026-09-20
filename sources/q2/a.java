package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f41398a;
    public final c f41399b;

    public a(c cVar) {
        this.f41399b = cVar;
    }

    @Override
    public final void clear() {
        this.f41398a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f41399b.n(this);
    }
}
