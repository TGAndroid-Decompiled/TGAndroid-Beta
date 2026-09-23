package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f41049a;
    public final b f41050b;

    public a(b bVar) {
        this.f41050b = bVar;
    }

    @Override
    public final void clear() {
        this.f41049a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f41050b.n(this);
    }
}
