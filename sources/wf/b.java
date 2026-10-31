package wf;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import java.util.List;
public final class b extends BitmapDrawable {
    public final List f52836a;

    public b(Bitmap bitmap, List list) {
        super(bitmap);
        this.f52836a = list;
    }

    public static BitmapDrawable a(Bitmap bitmap, ArrayList arrayList) {
        if (bitmap == null) {
            return null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            return new b(bitmap, arrayList);
        }
        return new BitmapDrawable(bitmap);
    }
}
