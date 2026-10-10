package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f45964a;
    public final b f45965b;

    public a(b bVar) {
        this.f45965b = bVar;
    }

    @Override
    public final void clear() {
        this.f45964a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f45965b.n(this);
    }
}
