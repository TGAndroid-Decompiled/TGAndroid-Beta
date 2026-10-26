package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f46916a;
    public final b f46917b;

    public a(b bVar) {
        this.f46917b = bVar;
    }

    @Override
    public final void clear() {
        this.f46916a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f46917b.n(this);
    }
}
