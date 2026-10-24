package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f44764a;
    public final b f44765b;

    public a(b bVar) {
        this.f44765b = bVar;
    }

    @Override
    public final void clear() {
        this.f44764a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f44765b.n(this);
    }
}
