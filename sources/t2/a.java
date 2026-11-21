package t2;

import android.graphics.Bitmap;
import k2.j;
public final class a extends j {
    public Bitmap f57580a;
    public final b f57581b;

    public a(b bVar) {
        this.f57581b = bVar;
    }

    @Override
    public final void clear() {
        this.f57580a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f57581b.n(this);
    }
}
