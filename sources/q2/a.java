package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f45918a;
    public final b f45919b;

    public a(b bVar) {
        this.f45919b = bVar;
    }

    @Override
    public final void clear() {
        this.f45918a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f45919b.n(this);
    }
}
