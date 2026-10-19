package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f44338a;
    public final b f44339b;

    public a(b bVar) {
        this.f44339b = bVar;
    }

    @Override
    public final void clear() {
        this.f44338a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f44339b.n(this);
    }
}
