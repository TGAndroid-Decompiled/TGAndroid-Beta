package vg;

import android.graphics.Bitmap;
import android.util.LruCache;
import vh.h2;
public final class h extends LruCache {
    public final int f50872a;

    public h(int i10, int i11) {
        super(i10);
        this.f50872a = i11;
    }

    @Override
    public void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        switch (this.f50872a) {
            case 1:
                String str = (String) obj;
                Bitmap bitmap = (Bitmap) obj2;
                Bitmap bitmap2 = (Bitmap) obj3;
                if (!bitmap.isRecycled() && !h2.f51243e0.containsKey(str)) {
                    bitmap.recycle();
                    return;
                }
                return;
            default:
                super.entryRemoved(z10, obj, obj2, obj3);
                return;
        }
    }

    @Override
    public int sizeOf(Object obj, Object obj2) {
        switch (this.f50872a) {
            case 0:
                Long l4 = (Long) obj;
                return ((i) obj2).f50875c;
            default:
                return super.sizeOf(obj, obj2);
        }
    }
}
