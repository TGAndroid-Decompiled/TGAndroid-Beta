package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f45865a;
    public final b f45866b;

    public a(b bVar) {
        this.f45866b = bVar;
    }

    @Override
    public final void clear() {
        this.f45865a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f45866b.n(this);
    }
}
