package w7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
public abstract class h6 {
    public static int a(hb.a aVar) {
        aVar.getClass();
        return Math.max(1, (int) Math.ceil(0.5f * org.telegram.messenger.i0.f16171p)) + (((int) Math.ceil(1.9f * org.telegram.messenger.i0.f16171p)) * 2);
    }

    public static void b(Canvas canvas, Bitmap bitmap, int i10, float f7, float f10, int i11, int i12, Paint paint) {
        int min = Math.min(i10, bitmap.getWidth());
        int i13 = (int) f7;
        int i14 = (int) f10;
        canvas.drawBitmap(bitmap, new Rect(0, i11, min, i11 + i12), new Rect(i13, i14, min + i13, i12 + i14), paint);
    }
}
