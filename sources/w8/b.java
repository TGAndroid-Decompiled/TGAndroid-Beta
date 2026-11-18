package w8;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.q;
import com.google.android.gms.internal.vision.g3;
import com.google.android.gms.internal.vision.u2;
import java.nio.ByteBuffer;
import java.util.HashSet;
import org.telegram.ui.md0;
import q6.m;
public final class b extends q {
    public final t8.a f59632b;
    public final u2 f59633c;
    public final Object d;
    public boolean f59634e;

    public b(u2 u2Var) {
        super(7);
        this.f59632b = new t8.a();
        this.d = new Object();
        this.f59634e = true;
        this.f59633c = u2Var;
    }

    @Override
    public final void X0() {
        super.X0();
        synchronized (this.d) {
            try {
                if (!this.f59634e) {
                    return;
                }
                this.f59633c.l();
                this.f59634e = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final SparseArray e1(md0 md0Var) {
        ByteBuffer w10;
        a[] n10;
        Bitmap bitmap = (Bitmap) md0Var.d;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i7 = width * height;
            w10 = ByteBuffer.allocateDirect(((((height + 1) / 2) * ((width + 1) / 2)) << 1) + i7);
            int i10 = i7;
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = i11 % width;
                int i13 = i11 / width;
                int pixel = bitmap.getPixel(i12, i13);
                float red = Color.red(pixel);
                float green = Color.green(pixel);
                float blue = Color.blue(pixel);
                w10.put(i11, (byte) ((0.114f * blue) + (0.587f * green) + (0.299f * red)));
                if (i13 % 2 == 0 && i12 % 2 == 0) {
                    float e10 = p5.c.e(blue, 0.5f, ((-0.331f) * green) + ((-0.169f) * red), 128.0f);
                    float e11 = p5.c.e(blue, -0.081f, (green * (-0.419f)) + (red * 0.5f), 128.0f);
                    int i14 = i10 + 1;
                    w10.put(i10, (byte) e10);
                    i10 += 2;
                    w10.put(i14, (byte) e11);
                }
            }
        } else {
            w10 = md0Var.w();
        }
        synchronized (this.d) {
            if (this.f59634e) {
                u2 u2Var = this.f59633c;
                m.h(w10);
                n10 = u2Var.n(w10, g3.b(md0Var));
            } else {
                throw new IllegalStateException("Cannot use detector after release()");
            }
        }
        HashSet hashSet = new HashSet();
        SparseArray sparseArray = new SparseArray(n10.length);
        int i15 = 0;
        for (a aVar : n10) {
            int i16 = aVar.f59629a;
            i15 = Math.max(i15, i16);
            if (hashSet.contains(Integer.valueOf(i16))) {
                i16 = i15 + 1;
                i15 = i16;
            }
            hashSet.add(Integer.valueOf(i16));
            sparseArray.append(this.f59632b.a(i16), aVar);
        }
        return sparseArray;
    }

    public final void finalize() {
        try {
            synchronized (this.d) {
                if (this.f59634e) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    X0();
                }
            }
        } finally {
            super.finalize();
        }
    }
}
