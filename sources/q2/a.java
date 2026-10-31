package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f45411a;
    public final c f45412b;

    public a(c cVar) {
        this.f45412b = cVar;
    }

    @Override
    public final void clear() {
        this.f45411a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f45412b.n(this);
    }
}
