package t2;

import android.graphics.Bitmap;
import k2.j;
public final class a extends j {
    public Bitmap f57584a;
    public final b f57585b;

    public a(b bVar) {
        this.f57585b = bVar;
    }

    @Override
    public final void clear() {
        this.f57584a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f57585b.n(this);
    }
}
