package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f43255a;
    public final c f43256b;

    public a(c cVar) {
        this.f43256b = cVar;
    }

    @Override
    public final void clear() {
        this.f43255a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f43256b.n(this);
    }
}
