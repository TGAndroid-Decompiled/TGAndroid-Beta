package t2;

import android.graphics.Bitmap;
import k2.j;
public final class a extends j {
    public Bitmap f55383a;
    public final b f55384b;

    public a(b bVar) {
        this.f55384b = bVar;
    }

    @Override
    public final void clear() {
        this.f55383a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f55384b.n(this);
    }
}
