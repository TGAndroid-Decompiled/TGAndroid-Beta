package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f41371a;
    public final c f41372b;

    public a(c cVar) {
        this.f41372b = cVar;
    }

    @Override
    public final void clear() {
        this.f41371a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f41372b.n(this);
    }
}
