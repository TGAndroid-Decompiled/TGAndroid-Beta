package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f44366a;
    public final c f44367b;

    public a(c cVar) {
        this.f44367b = cVar;
    }

    @Override
    public final void clear() {
        this.f44366a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f44367b.n(this);
    }
}
