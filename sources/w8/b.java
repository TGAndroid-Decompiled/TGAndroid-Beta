package w8;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import android.util.SparseArray;
import bi.b1;
import com.google.android.gms.internal.vision.f3;
import com.google.android.gms.internal.vision.t2;
import java.nio.ByteBuffer;
import java.util.HashSet;
import org.telegram.ui.hy0;
import q6.m;
public final class b extends b1 {
    public final t8.a f57615b;
    public final t2 f57616c;
    public final Object d;
    public boolean f57617e;

    public b(t2 t2Var) {
        super(7);
        this.f57615b = new t8.a();
        this.d = new Object();
        this.f57617e = true;
        this.f57616c = t2Var;
    }

    @Override
    public final void X0() {
        super.X0();
        synchronized (this.d) {
            try {
                if (!this.f57617e) {
                    return;
                }
                this.f57616c.l();
                this.f57617e = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final SparseArray e1(hy0 hy0Var) {
        ByteBuffer y10;
        a[] n10;
        Bitmap bitmap = (Bitmap) hy0Var.d;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i7 = width * height;
            y10 = ByteBuffer.allocateDirect(((((height + 1) / 2) * ((width + 1) / 2)) << 1) + i7);
            int i10 = i7;
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = i11 % width;
                int i13 = i11 / width;
                int pixel = bitmap.getPixel(i12, i13);
                float red = Color.red(pixel);
                float green = Color.green(pixel);
                float blue = Color.blue(pixel);
                y10.put(i11, (byte) ((0.114f * blue) + (0.587f * green) + (0.299f * red)));
                if (i13 % 2 == 0 && i12 % 2 == 0) {
                    float d = rf.b.d(blue, 0.5f, ((-0.331f) * green) + ((-0.169f) * red), 128.0f);
                    float d2 = rf.b.d(blue, -0.081f, (green * (-0.419f)) + (red * 0.5f), 128.0f);
                    int i14 = i10 + 1;
                    y10.put(i10, (byte) d);
                    i10 += 2;
                    y10.put(i14, (byte) d2);
                }
            }
        } else {
            y10 = hy0Var.y();
        }
        synchronized (this.d) {
            if (this.f57617e) {
                t2 t2Var = this.f57616c;
                m.g(y10);
                n10 = t2Var.n(y10, f3.b(hy0Var));
            } else {
                throw new IllegalStateException("Cannot use detector after release()");
            }
        }
        HashSet hashSet = new HashSet();
        SparseArray sparseArray = new SparseArray(n10.length);
        int i15 = 0;
        for (a aVar : n10) {
            int i16 = aVar.f57612a;
            i15 = Math.max(i15, i16);
            if (hashSet.contains(Integer.valueOf(i16))) {
                i16 = i15 + 1;
                i15 = i16;
            }
            hashSet.add(Integer.valueOf(i16));
            sparseArray.append(this.f57615b.a(i16), aVar);
        }
        return sparseArray;
    }

    public final void finalize() {
        try {
            synchronized (this.d) {
                if (this.f57617e) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    X0();
                }
            }
        } finally {
            super.finalize();
        }
    }
}
