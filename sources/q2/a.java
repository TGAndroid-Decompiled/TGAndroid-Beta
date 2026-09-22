package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f41420a;
    public final b f41421b;

    public a(b bVar) {
        this.f41421b = bVar;
    }

    @Override
    public final void clear() {
        this.f41420a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f41421b.n(this);
    }
}
