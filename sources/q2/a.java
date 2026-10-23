package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f44765a;
    public final b f44766b;

    public a(b bVar) {
        this.f44766b = bVar;
    }

    @Override
    public final void clear() {
        this.f44765a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f44766b.n(this);
    }
}
