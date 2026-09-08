package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f44149a;
    public final c f44150b;

    public a(c cVar) {
        this.f44150b = cVar;
    }

    @Override
    public final void clear() {
        this.f44149a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f44150b.n(this);
    }
}
