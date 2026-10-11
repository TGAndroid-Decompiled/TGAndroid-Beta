package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f45995a;
    public final b f45996b;

    public a(b bVar) {
        this.f45996b = bVar;
    }

    @Override
    public final void clear() {
        this.f45995a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f45996b.n(this);
    }
}
