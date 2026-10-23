package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f44352a;
    public final b f44353b;

    public a(b bVar) {
        this.f44353b = bVar;
    }

    @Override
    public final void clear() {
        this.f44352a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f44353b.n(this);
    }
}
