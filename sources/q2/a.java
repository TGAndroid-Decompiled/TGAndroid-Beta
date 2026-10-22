package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f44351a;
    public final b f44352b;

    public a(b bVar) {
        this.f44352b = bVar;
    }

    @Override
    public final void clear() {
        this.f44351a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f44352b.n(this);
    }
}
