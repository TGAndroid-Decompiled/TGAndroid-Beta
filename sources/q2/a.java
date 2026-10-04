package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f44749a;
    public final b f44750b;

    public a(b bVar) {
        this.f44750b = bVar;
    }

    @Override
    public final void clear() {
        this.f44749a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f44750b.n(this);
    }
}
