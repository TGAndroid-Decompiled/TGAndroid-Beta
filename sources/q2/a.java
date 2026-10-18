package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f44343a;
    public final c f44344b;

    public a(c cVar) {
        this.f44344b = cVar;
    }

    @Override
    public final void clear() {
        this.f44343a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f44344b.n(this);
    }
}
