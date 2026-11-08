package t2;

import android.graphics.Bitmap;
import k2.j;
public final class a extends j {
    public Bitmap f55372a;
    public final b f55373b;

    public a(b bVar) {
        this.f55373b = bVar;
    }

    @Override
    public final void clear() {
        this.f55372a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f55373b.n(this);
    }
}
