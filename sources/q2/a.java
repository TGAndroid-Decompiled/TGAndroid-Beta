package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f46913a;
    public final b f46914b;

    public a(b bVar) {
        this.f46914b = bVar;
    }

    @Override
    public final void clear() {
        this.f46913a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f46914b.n(this);
    }
}
