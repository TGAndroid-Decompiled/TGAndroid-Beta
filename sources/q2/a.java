package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f42999a;
    public final b f43000b;

    public a(b bVar) {
        this.f43000b = bVar;
    }

    @Override
    public final void clear() {
        this.f42999a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f43000b.n(this);
    }
}
