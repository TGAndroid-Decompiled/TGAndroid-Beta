package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f41415a;
    public final c f41416b;

    public a(c cVar) {
        this.f41416b = cVar;
    }

    @Override
    public final void clear() {
        this.f41415a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f41416b.n(this);
    }
}
