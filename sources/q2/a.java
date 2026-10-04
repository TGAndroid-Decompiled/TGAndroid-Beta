package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f44757a;
    public final b f44758b;

    public a(b bVar) {
        this.f44758b = bVar;
    }

    @Override
    public final void clear() {
        this.f44757a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f44758b.n(this);
    }
}
