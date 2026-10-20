package t8;

import ai.c1;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.f3;
import com.google.android.gms.internal.vision.t2;
import java.nio.ByteBuffer;
import java.util.HashSet;
import m.g3;
import n6.l;
public final class b extends c1 {
    public final q8.a f46910b;
    public final t2 f46911c;
    public final Object d;
    public boolean e;

    public b(t2 t2Var) {
        super(4);
        this.f46910b = new q8.a();
        this.d = new Object();
        this.e = true;
        this.f46911c = t2Var;
    }

    @Override
    public final void X0() {
        super.X0();
        synchronized (this.d) {
            try {
                if (!this.e) {
                    return;
                }
                this.f46911c.l();
                this.e = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final SparseArray e1(g3 g3Var) {
        ByteBuffer I;
        a[] n10;
        Bitmap bitmap = (Bitmap) g3Var.d;
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
                    float c10 = r4.c.c(blue, 0.5f, ((-0.331f) * green) + ((-0.169f) * red), 128.0f);
                    float c11 = r4.c.c(blue, -0.081f, (green * (-0.419f)) + (red * 0.5f), 128.0f);
                    int i15 = i11 + 1;
                    I.put(i11, (byte) c10);
                    i11 += 2;
                    I.put(i15, (byte) c11);
                }
            }
        } else {
            I = g3Var.I();
        }
        synchronized (this.d) {
            if (this.e) {
                t2 t2Var = this.f46911c;
                l.h(I);
                n10 = t2Var.n(I, f3.b(g3Var));
            } else {
                throw new IllegalStateException("Cannot use detector after release()");
            }
        }
        HashSet hashSet = new HashSet();
        SparseArray sparseArray = new SparseArray(n10.length);
        int i16 = 0;
        for (a aVar : n10) {
            int i17 = aVar.f46907a;
            i16 = Math.max(i16, i17);
            if (hashSet.contains(Integer.valueOf(i17))) {
                i17 = i16 + 1;
                i16 = i17;
            }
            hashSet.add(Integer.valueOf(i17));
            sparseArray.append(this.f46910b.a(i17), aVar);
        }
        return sparseArray;
    }

    public final void finalize() {
        try {
            synchronized (this.d) {
                if (this.e) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    X0();
                }
            }
        } finally {
            super.finalize();
        }
    }
}
