package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f41484a;
    public final c f41485b;

    public a(c cVar) {
        this.f41485b = cVar;
    }

    @Override
    public final void clear() {
        this.f41484a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f41485b.n(this);
    }
}
