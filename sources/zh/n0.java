package zh;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.gms.internal.play_billing.k3;
import java.nio.ByteBuffer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.az0;
public final class n0 implements Runnable {
    public final int f51812a;
    public final t0 f51813b;
    public final int f51814c;

    public n0(t0 t0Var, int i10, int i11) {
        this.f51812a = i11;
        this.f51813b = t0Var;
        this.f51814c = i10;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f51812a) {
            case 0:
                this.f51813b.F0(this.f51814c);
                return;
            case 1:
                this.f51813b.F0(this.f51814c);
                return;
            default:
                t0 t0Var = this.f51813b;
                int i10 = this.f51814c;
                synchronized (t0.class) {
                    if (t0.O9 != null) {
                        bArr = t0.O9;
                    } else {
                        float w9 = k3.w(AndroidUtilities.dp(24.0f), 0.57735f, 0.5f, 4.0f);
                        float dp = AndroidUtilities.dp(30.0f) / 4.0f;
                        int ceil = (int) Math.ceil(3.0f * w9);
                        int ceil2 = ((int) Math.ceil(dp)) + ceil + 1;
                        int i11 = (ceil2 * 2) + 2;
                        Bitmap createBitmap = Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_8888);
                        Paint paint = new Paint(1);
                        paint.setMaskFilter(new BlurMaskFilter(Math.max(0.1f, (w9 - 0.5f) / 0.57735f), BlurMaskFilter.Blur.NORMAL));
                        float f7 = ceil;
                        float f10 = i11 - ceil;
                        new Canvas(createBitmap).drawRoundRect(f7, f7, f10, f10, dp, dp, paint);
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
                        t0.P9 = i11;
                        t0.Q9 = ceil;
                        t0.R9 = ceil2;
                        t0.O9 = bArr3;
                        bArr = bArr3;
                    }
                }
                int i13 = t0.P9;
                Bitmap createBitmap2 = Bitmap.createBitmap(i13, i13, Bitmap.Config.ARGB_8888);
                int[] iArr = new int[i13 * i13];
                t0.s(iArr, bArr, i10);
                createBitmap2.setPixels(iArr, 0, i13, 0, 0, i13, i13);
                createBitmap2.prepareToDraw();
                AndroidUtilities.runOnUIThread(new az0(t0Var, createBitmap2, iArr, i10, 23));
                return;
        }
    }
}
