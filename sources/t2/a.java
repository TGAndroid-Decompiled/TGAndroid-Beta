package t2;

import android.graphics.Bitmap;
import k2.j;
public final class a extends j {
    public Bitmap f55384a;
    public final b f55385b;

    public a(b bVar) {
        this.f55385b = bVar;
    }

    @Override
    public final void clear() {
        this.f55384a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f55385b.n(this);
    }
}
