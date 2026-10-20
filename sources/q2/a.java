package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f44348a;
    public final b f44349b;

    public a(b bVar) {
        this.f44349b = bVar;
    }

    @Override
    public final void clear() {
        this.f44348a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f44349b.n(this);
    }
}
