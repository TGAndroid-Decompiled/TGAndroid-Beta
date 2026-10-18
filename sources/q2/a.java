package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f44386a;
    public final c f44387b;

    public a(c cVar) {
        this.f44387b = cVar;
    }

    @Override
    public final void clear() {
        this.f44386a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f44387b.n(this);
    }
}
