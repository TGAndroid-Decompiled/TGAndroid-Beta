package w7;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class k9 {
    public static NinePatchDrawable a(Bitmap bitmap, Rect rect, int i10, int i11) {
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                if (i10 >= 0 && i10 < bitmap.getWidth() && i11 >= 0 && i11 < bitmap.getHeight()) {
                    return new NinePatchDrawable(org.telegram.messenger.w0.f19025b.getResources(), bitmap, c(i10, i10 + 1, i11, i11 + 1, rect.left, rect.top, rect.right, rect.bottom, bitmap.getPixel(i10, i11)).array(), rect, null);
                }
                StringBuilder m10 = i0.a.m("center pixel is outside bitmap: (", i10, ", ", i11, ") for ");
                m10.append(bitmap.getWidth());
                m10.append("x");
                m10.append(bitmap.getHeight());
                throw new IllegalArgumentException(m10.toString());
            }
            throw new IllegalArgumentException("bitmap is recycled");
        }
        throw new IllegalArgumentException("bitmap == null");
    }

    public static android.graphics.drawable.NinePatchDrawable b(android.graphics.Bitmap[] r38, int r39, float[] r40, float r41, int r42, float r43, int r44) {
        throw new UnsupportedOperationException("Method not decompiled: w7.k9.b(android.graphics.Bitmap[], int, float[], float, int, float, int):android.graphics.drawable.NinePatchDrawable");
    }

    public static ByteBuffer c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 2);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(i14);
        order.putInt(i16);
        order.putInt(i15);
        order.putInt(i17);
        order.putInt(0);
        order.putInt(i10);
        order.putInt(i11);
        order.putInt(i12);
        order.putInt(i13);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(i18);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        return order;
    }
}
