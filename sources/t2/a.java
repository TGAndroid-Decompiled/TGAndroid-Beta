package t2;

import android.graphics.Bitmap;
import k2.j;
public final class a extends j {
    public Bitmap f57541a;
    public final b f57542b;

    public a(b bVar) {
        this.f57542b = bVar;
    }

    @Override
    public final void clear() {
        this.f57541a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f57542b.n(this);
    }
}
