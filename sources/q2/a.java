package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f41387a;
    public final c f41388b;

    public a(c cVar) {
        this.f41388b = cVar;
    }

    @Override
    public final void clear() {
        this.f41387a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f41388b.n(this);
    }
}
