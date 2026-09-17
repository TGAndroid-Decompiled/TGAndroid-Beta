package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f41119a;
    public final b f41120b;

    public a(b bVar) {
        this.f41120b = bVar;
    }

    @Override
    public final void clear() {
        this.f41119a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f41120b.n(this);
    }
}
