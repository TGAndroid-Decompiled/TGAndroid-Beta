package ph;

import android.graphics.Bitmap;
import android.util.LruCache;
public final class w2 extends LruCache {
    @Override
    public final void entryRemoved(boolean z4, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Bitmap bitmap = (Bitmap) obj2;
        Bitmap bitmap2 = (Bitmap) obj3;
        if (!bitmap.isRecycled() && !x2.f42576b0.containsKey(str)) {
            bitmap.recycle();
        }
    }
}
