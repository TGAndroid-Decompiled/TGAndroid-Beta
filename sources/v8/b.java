package v8;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import android.util.SparseArray;
import ci.u0;
import com.google.android.gms.internal.vision.f3;
import com.google.android.gms.internal.vision.t2;
import java.nio.ByteBuffer;
import java.util.HashSet;
import p6.m;
import p7.d;
public final class b extends u0 {
    public final s8.a f56479b;
    public final t2 f56480c;
    public final Object d;
    public boolean f56481e;

    public b(t2 t2Var) {
        super(7);
        this.f56479b = new s8.a();
        this.d = new Object();
        this.f56481e = true;
        this.f56480c = t2Var;
    }

    @Override
    public final void X0() {
        super.X0();
        synchronized (this.d) {
            try {
                if (!this.f56481e) {
                    return;
                }
                this.f56480c.l();
                this.f56481e = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final SparseArray e1(d dVar) {
        ByteBuffer q10;
        a[] n4;
        Bitmap bitmap = (Bitmap) dVar.f53346c;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i3 = width * height;
            q10 = ByteBuffer.allocateDirect(((((height + 1) / 2) * ((width + 1) / 2)) << 1) + i3);
            int i10 = i3;
            for (int i11 = 0; i11 < i3; i11++) {
                int i12 = i11 % width;
                int i13 = i11 / width;
                int pixel = bitmap.getPixel(i12, i13);
                float red = Color.red(pixel);
                float green = Color.green(pixel);
                float blue = Color.blue(pixel);
                q10.put(i11, (byte) ((0.114f * blue) + (0.587f * green) + (0.299f * red)));
                if (i13 % 2 == 0 && i12 % 2 == 0) {
                    float c2 = t4.c.c(blue, 0.5f, ((-0.331f) * green) + ((-0.169f) * red), 128.0f);
                    float c10 = t4.c.c(blue, -0.081f, (green * (-0.419f)) + (red * 0.5f), 128.0f);
                    int i14 = i10 + 1;
                    q10.put(i10, (byte) c2);
                    i10 += 2;
                    q10.put(i14, (byte) c10);
                }
            }
        } else {
            q10 = dVar.q();
        }
        synchronized (this.d) {
            if (this.f56481e) {
                t2 t2Var = this.f56480c;
                m.g(q10);
                n4 = t2Var.n(q10, f3.b(dVar));
            } else {
                throw new IllegalStateException("Cannot use detector after release()");
            }
        }
        HashSet hashSet = new HashSet();
        SparseArray sparseArray = new SparseArray(n4.length);
        int i15 = 0;
        for (a aVar : n4) {
            int i16 = aVar.f56476a;
            i15 = Math.max(i15, i16);
            if (hashSet.contains(Integer.valueOf(i16))) {
                i16 = i15 + 1;
                i15 = i16;
            }
            hashSet.add(Integer.valueOf(i16));
            sparseArray.append(this.f56479b.a(i16), aVar);
        }
        return sparseArray;
    }

    public final void finalize() {
        try {
            synchronized (this.d) {
                if (this.f56481e) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    X0();
                }
            }
        } finally {
            super.finalize();
        }
    }
}
