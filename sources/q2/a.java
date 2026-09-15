package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f41097a;
    public final b f41098b;

    public a(b bVar) {
        this.f41098b = bVar;
    }

    @Override
    public final void clear() {
        this.f41097a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f41098b.n(this);
    }
}
