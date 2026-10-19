package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f44340a;
    public final b f44341b;

    public a(b bVar) {
        this.f44341b = bVar;
    }

    @Override
    public final void clear() {
        this.f44340a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f44341b.n(this);
    }
}
