package t2;

import android.graphics.Bitmap;
import k2.j;
public final class a extends j {
    public Bitmap f57663a;
    public final b f57664b;

    public a(b bVar) {
        this.f57664b = bVar;
    }

    @Override
    public final void clear() {
        this.f57663a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f57664b.n(this);
    }
}
