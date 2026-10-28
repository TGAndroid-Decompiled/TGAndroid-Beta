package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f46951a;
    public final b f46952b;

    public a(b bVar) {
        this.f46952b = bVar;
    }

    @Override
    public final void clear() {
        this.f46951a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f46952b.n(this);
    }
}
