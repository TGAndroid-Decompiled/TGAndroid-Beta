package t2;

import android.graphics.Bitmap;
import k2.j;
public final class a extends j {
    public Bitmap f55280a;
    public final b f55281b;

    public a(b bVar) {
        this.f55281b = bVar;
    }

    @Override
    public final void clear() {
        this.f55280a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f55281b.n(this);
    }
}
