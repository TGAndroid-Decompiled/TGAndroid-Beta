package t8;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import android.util.SparseArray;
import b2.g;
import com.google.android.gms.internal.vision.g3;
import com.google.android.gms.internal.vision.u2;
import java.nio.ByteBuffer;
import java.util.HashSet;
import lf.i;
import n6.l;
import org.telegram.ui.Cells.q3;
public final class c extends g {
    public final q8.a f42995b;
    public final u2 f42996c;
    public final Object d;
    public boolean e;

    public c(u2 u2Var) {
        super(3);
        this.f42995b = new q8.a();
        this.d = new Object();
        this.e = true;
        this.f42996c = u2Var;
    }

    @Override
    public final void U0() {
        super.U0();
        synchronized (this.d) {
            try {
                if (!this.e) {
                    return;
                }
                this.f42996c.l();
                this.e = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final SparseArray Z0(i iVar) {
        ByteBuffer I;
        a[] n10;
        Bitmap bitmap = (Bitmap) iVar.d;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = width * height;
            I = ByteBuffer.allocateDirect(((((height + 1) / 2) * ((width + 1) / 2)) << 1) + i10);
            int i11 = i10;
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = i12 % width;
                int i14 = i12 / width;
                int pixel = bitmap.getPixel(i13, i14);
                float red = Color.red(pixel);
                float green = Color.green(pixel);
                float blue = Color.blue(pixel);
                I.put(i12, (byte) ((0.114f * blue) + (0.587f * green) + (0.299f * red)));
                if (i14 % 2 == 0 && i13 % 2 == 0) {
                    float a2 = q3.a(blue, 0.5f, ((-0.331f) * green) + ((-0.169f) * red), 128.0f);
                    float a10 = q3.a(blue, -0.081f, (green * (-0.419f)) + (red * 0.5f), 128.0f);
                    int i15 = i11 + 1;
                    I.put(i11, (byte) a2);
                    i11 += 2;
                    I.put(i15, (byte) a10);
                }
            }
        } else {
            I = iVar.I();
        }
        synchronized (this.d) {
            if (this.e) {
                u2 u2Var = this.f42996c;
                l.h(I);
                n10 = u2Var.n(I, g3.b(iVar));
            } else {
                throw new IllegalStateException("Cannot use detector after release()");
            }
        }
        HashSet hashSet = new HashSet();
        SparseArray sparseArray = new SparseArray(n10.length);
        int i16 = 0;
        for (a aVar : n10) {
            int i17 = aVar.f42989a;
            i16 = Math.max(i16, i17);
            if (hashSet.contains(Integer.valueOf(i17))) {
                i17 = i16 + 1;
                i16 = i17;
            }
            hashSet.add(Integer.valueOf(i17));
            sparseArray.append(this.f42995b.a(i17), aVar);
        }
        return sparseArray;
    }

    public final void finalize() {
        try {
            synchronized (this.d) {
                if (this.e) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    U0();
                }
            }
        } finally {
            super.finalize();
        }
    }
}
