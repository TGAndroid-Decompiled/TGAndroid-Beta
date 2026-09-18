package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f41357a;
    public final c f41358b;

    public a(c cVar) {
        this.f41358b = cVar;
    }

    @Override
    public final void clear() {
        this.f41357a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f41358b.n(this);
    }
}
