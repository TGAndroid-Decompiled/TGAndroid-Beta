package q2;

import android.graphics.Bitmap;
import h2.j;
public final class a extends j {
    public Bitmap f45920a;
    public final b f45921b;

    public a(b bVar) {
        this.f45921b = bVar;
    }

    @Override
    public final void clear() {
        this.f45920a = null;
        super.clear();
    }

    @Override
    public final void release() {
        this.f45921b.n(this);
    }
}
