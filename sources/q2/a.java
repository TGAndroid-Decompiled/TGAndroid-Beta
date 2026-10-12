package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f45857a;
    public final b f45858b;

    public a(b bVar) {
        this.f45858b = bVar;
    }

    @Override
    public final void clear() {
        this.f45857a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f45858b.n(this);
    }
}
