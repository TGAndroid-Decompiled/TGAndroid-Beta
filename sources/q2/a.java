package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f40474a;
    public final b f40475b;

    public a(b bVar) {
        this.f40475b = bVar;
    }

    @Override
    public final void clear() {
        this.f40474a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f40475b.n(this);
    }
}
