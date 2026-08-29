package rg;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
public final class a {
    public WeakReference f47420a;
    public long f47421b;
    public boolean f47422c = true;

    public final boolean a(Bitmap bitmap) {
        Bitmap bitmap2;
        long j10;
        if (!this.f47422c) {
            WeakReference weakReference = this.f47420a;
            if (weakReference != null) {
                bitmap2 = (Bitmap) weakReference.get();
            } else {
                bitmap2 = null;
            }
            if (bitmap2 == bitmap) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    j10 = bitmap.getGenerationId();
                } else {
                    j10 = 0;
                }
                if (j10 != this.f47421b) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public final void b(Bitmap bitmap) {
        WeakReference weakReference;
        long j10;
        if (bitmap != null) {
            weakReference = new WeakReference(bitmap);
        } else {
            weakReference = null;
        }
        this.f47420a = weakReference;
        if (bitmap != null && !bitmap.isRecycled()) {
            j10 = bitmap.getGenerationId();
        } else {
            j10 = 0;
        }
        this.f47421b = j10;
        this.f47422c = false;
    }
}
