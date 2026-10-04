package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f44750a;
    public final b f44751b;

    public a(b bVar) {
        this.f44751b = bVar;
    }

    @Override
    public final void clear() {
        this.f44750a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f44751b.n(this);
    }
}
