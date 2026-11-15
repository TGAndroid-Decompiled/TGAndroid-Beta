package t2;

import android.graphics.Bitmap;
import k2.j;
public final class a extends j {
    public Bitmap f56965a;
    public final b f56966b;

    public a(b bVar) {
        this.f56966b = bVar;
    }

    @Override
    public final void clear() {
        this.f56965a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f56966b.n(this);
    }
}
