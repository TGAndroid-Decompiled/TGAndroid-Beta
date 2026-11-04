package s2;

import android.graphics.Bitmap;
import j2.j;
public final class a extends j {
    public Bitmap f54592a;
    public final b f54593b;

    public a(b bVar) {
        this.f54593b = bVar;
    }

    @Override
    public final void clear() {
        this.f54592a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f54593b.n(this);
    }
}
