package t2;

import android.graphics.Bitmap;
import k2.j;
public final class a extends j {
    public Bitmap f57549a;
    public final b f57550b;

    public a(b bVar) {
        this.f57550b = bVar;
    }

    @Override
    public final void clear() {
        this.f57549a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f57550b.n(this);
    }
}
