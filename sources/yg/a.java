package yg;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
public final class a {
    public WeakReference f54451a;
    public long f54452b;
    public boolean f54453c = true;

    public final boolean a(Bitmap bitmap) {
        Bitmap bitmap2;
        long j10;
        if (!this.f54453c) {
            WeakReference weakReference = this.f54451a;
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
                if (j10 != this.f54452b) {
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
        this.f54451a = weakReference;
        if (bitmap != null && !bitmap.isRecycled()) {
            j10 = bitmap.getGenerationId();
        } else {
            j10 = 0;
        }
        this.f54452b = j10;
        this.f54453c = false;
    }
}
