package pg;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

public final class a {

    public WeakReference f46016a;

    public long f46017b;

    public boolean f46018c = true;

    public final boolean a(Bitmap bitmap) {
        if (this.f46018c) {
            return true;
        }
        WeakReference weakReference = this.f46016a;
        if ((weakReference != null ? (Bitmap) weakReference.get() : null) != bitmap) {
            return true;
        }
        return ((bitmap == null || bitmap.isRecycled()) ? 0L : (long) bitmap.getGenerationId()) != this.f46017b;
    }

    public final void b(Bitmap bitmap) {
        this.f46016a = bitmap != null ? new WeakReference(bitmap) : null;
        this.f46017b = (bitmap == null || bitmap.isRecycled()) ? 0L : bitmap.getGenerationId();
        this.f46018c = false;
    }
}
