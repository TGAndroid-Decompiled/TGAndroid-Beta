package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f46029a;
    public final b f46030b;

    public a(b bVar) {
        this.f46030b = bVar;
    }

    @Override
    public final void clear() {
        this.f46029a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f46030b.n(this);
    }
}
