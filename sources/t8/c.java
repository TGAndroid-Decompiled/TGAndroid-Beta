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
import m2.t;
import n6.l;
import org.telegram.ui.Cells.p6;
public final class c extends g {
    public final q8.a f46471b;
    public final u2 f46472c;
    public final Object d;
    public boolean f46473e;

    public c(u2 u2Var) {
        super(3);
        this.f46471b = new q8.a();
        this.d = new Object();
        this.f46473e = true;
        this.f46472c = u2Var;
    }

    @Override
    public final void U0() {
        super.U0();
        synchronized (this.d) {
            try {
                if (!this.f46473e) {
                    return;
                }
                this.f46472c.l();
                this.f46473e = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final SparseArray Z0(t tVar) {
        ByteBuffer A;
        a[] n10;
        Bitmap bitmap = (Bitmap) tVar.d;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = width * height;
            A = ByteBuffer.allocateDirect(((((height + 1) / 2) * ((width + 1) / 2)) << 1) + i10);
            int i11 = i10;
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = i12 % width;
                int i14 = i12 / width;
                int pixel = bitmap.getPixel(i13, i14);
                float red = Color.red(pixel);
                float green = Color.green(pixel);
                float blue = Color.blue(pixel);
                A.put(i12, (byte) ((0.114f * blue) + (0.587f * green) + (0.299f * red)));
                if (i14 % 2 == 0 && i13 % 2 == 0) {
                    float a2 = p6.a(blue, 0.5f, ((-0.331f) * green) + ((-0.169f) * red), 128.0f);
                    float a10 = p6.a(blue, -0.081f, (green * (-0.419f)) + (red * 0.5f), 128.0f);
                    int i15 = i11 + 1;
                    A.put(i11, (byte) a2);
                    i11 += 2;
                    A.put(i15, (byte) a10);
                }
            }
        } else {
            A = tVar.A();
        }
        synchronized (this.d) {
            if (this.f46473e) {
                u2 u2Var = this.f46472c;
                l.h(A);
                n10 = u2Var.n(A, g3.b(tVar));
            } else {
                throw new IllegalStateException("Cannot use detector after release()");
            }
        }
        HashSet hashSet = new HashSet();
        SparseArray sparseArray = new SparseArray(n10.length);
        int i16 = 0;
        for (a aVar : n10) {
            int i17 = aVar.f46465a;
            i16 = Math.max(i16, i17);
            if (hashSet.contains(Integer.valueOf(i17))) {
                i17 = i16 + 1;
                i16 = i17;
            }
            hashSet.add(Integer.valueOf(i17));
            sparseArray.append(this.f46471b.a(i17), aVar);
        }
        return sparseArray;
    }

    public final void finalize() {
        try {
            synchronized (this.d) {
                if (this.f46473e) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    U0();
                }
            }
        } finally {
            super.finalize();
        }
    }
}
