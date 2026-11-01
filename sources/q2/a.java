package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f45422a;
    public final c f45423b;

    public a(c cVar) {
        this.f45423b = cVar;
    }

    @Override
    public final void clear() {
        this.f45422a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f45423b.n(this);
    }
}
