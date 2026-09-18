package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f41124a;
    public final b f41125b;

    public a(b bVar) {
        this.f41125b = bVar;
    }

    @Override
    public final void clear() {
        this.f41124a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f41125b.n(this);
    }
}
