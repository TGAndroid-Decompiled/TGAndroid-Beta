package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f41093a;
    public final b f41094b;

    public a(b bVar) {
        this.f41094b = bVar;
    }

    @Override
    public final void clear() {
        this.f41093a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f41094b.n(this);
    }
}
