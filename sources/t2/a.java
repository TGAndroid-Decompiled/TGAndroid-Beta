package t2;

import android.graphics.Bitmap;
import k2.j;
public final class a extends j {
    public Bitmap f55255a;
    public final b f55256b;

    public a(b bVar) {
        this.f55256b = bVar;
    }

    @Override
    public final void clear() {
        this.f55255a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f55256b.n(this);
    }
}
