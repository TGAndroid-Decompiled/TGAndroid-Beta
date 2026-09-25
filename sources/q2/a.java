package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f41386a;
    public final c f41387b;

    public a(c cVar) {
        this.f41387b = cVar;
    }

    @Override
    public final void clear() {
        this.f41386a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f41387b.n(this);
    }
}
