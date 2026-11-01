package qh;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.d11;
public final class n0 implements Runnable {
    public final int f45711a;
    public final x0 f45712b;
    public final int f45713c;

    public n0(x0 x0Var, int i10, int i11) {
        this.f45711a = i11;
        this.f45712b = x0Var;
        this.f45713c = i10;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f45711a) {
            case 0:
                x0 x0Var = this.f45712b;
                int i10 = this.f45713c;
                synchronized (x0.class) {
                    if (x0.N9 != null) {
                        bArr = x0.N9;
                    } else {
                        float x10 = c3.i0.x(org.telegram.messenger.i0.L(24.0f), 0.57735f, 0.5f, 4.0f);
                        float L = org.telegram.messenger.i0.L(30.0f) / 4.0f;
                        int ceil = (int) Math.ceil(3.0f * x10);
                        int ceil2 = ((int) Math.ceil(L)) + ceil + 1;
                        int i11 = (ceil2 * 2) + 2;
                        Bitmap createBitmap = Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_8888);
                        Paint paint = new Paint(1);
                        paint.setMaskFilter(new BlurMaskFilter(Math.max(0.1f, (x10 - 0.5f) / 0.57735f), BlurMaskFilter.Blur.NORMAL));
                        float f7 = ceil;
                        float f10 = i11 - ceil;
                        new Canvas(createBitmap).drawRoundRect(f7, f7, f10, f10, L, L, paint);
                        Bitmap extractAlpha = createBitmap.extractAlpha();
                        createBitmap.recycle();
                        int rowBytes = extractAlpha.getRowBytes();
                        byte[] bArr2 = new byte[rowBytes * i11];
                        byte[] bArr3 = new byte[i11 * i11];
                        extractAlpha.copyPixelsToBuffer(ByteBuffer.wrap(bArr2));
                        extractAlpha.recycle();
                        for (int i12 = 0; i12 < i11; i12++) {
                            System.arraycopy(bArr2, i12 * rowBytes, bArr3, i12 * i11, i11);
                        }
                        x0.O9 = i11;
                        x0.P9 = ceil;
                        x0.Q9 = ceil2;
                        x0.N9 = bArr3;
                        bArr = bArr3;
                    }
                }
                int i13 = x0.O9;
                Bitmap createBitmap2 = Bitmap.createBitmap(i13, i13, Bitmap.Config.ARGB_8888);
                int[] iArr = new int[i13 * i13];
                x0.s(iArr, bArr, i10);
                createBitmap2.setPixels(iArr, 0, i13, 0, 0, i13, i13);
                createBitmap2.prepareToDraw();
                org.telegram.messenger.i0.g3(new d11(x0Var, createBitmap2, iArr, i10));
                return;
            case 1:
                this.f45712b.F0(this.f45713c);
                return;
            default:
                this.f45712b.F0(this.f45713c);
                return;
        }
    }
}
