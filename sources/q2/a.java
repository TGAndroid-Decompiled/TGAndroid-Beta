package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f44150a;
    public final c f44151b;

    public a(c cVar) {
        this.f44151b = cVar;
    }

    @Override
    public final void clear() {
        this.f44150a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f44151b.n(this);
    }
}
