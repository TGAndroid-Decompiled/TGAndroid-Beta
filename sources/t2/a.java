package t2;

import android.graphics.Bitmap;
import k2.j;
public final class a extends j {
    public Bitmap f55279a;
    public final b f55280b;

    public a(b bVar) {
        this.f55280b = bVar;
    }

    @Override
    public final void clear() {
        this.f55279a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f55280b.n(this);
    }
}
