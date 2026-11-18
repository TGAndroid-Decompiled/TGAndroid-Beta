package ug;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.y10;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public class t1 {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public boolean N;
    public i6 P;
    public long R;
    public long S;
    public boolean f58897g;
    public boolean h;
    public y10 f58901l;
    public boolean f58902m;
    public final int f58905p;
    public boolean f58906q;
    public int f58914z;
    public final RectF f58892a = new RectF();
    public final RectF f58893b = new RectF();
    public final RectF f58894c = new RectF();
    public Bitmap[] d = new Bitmap[3];
    public boolean[] f58895e = new boolean[3];
    public boolean[] f58896f = new boolean[3];
    public final Paint f58898i = new Paint();
    public float f58899j = 0.0f;
    public float f58900k = 0.0f;
    public final ArrayList f58903n = new ArrayList();
    public float f58904o = 1.0f;
    public int f58907r = 14;
    public int f58908s = 12;
    public int f58909t = 10;
    public float f58910u = 0.85f;
    public float v = 0.85f;
    public float f58911w = 0.9f;
    public long f58912x = 2000;
    public int f58913y = 1000;
    public final float A = 1000.0f / org.telegram.messenger.g0.f24122r;
    public boolean H = false;
    public boolean I = true;
    public boolean J = true;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public int O = -1;
    public int Q = n6.Lk;
    public int T = 0;

    public t1(int i7) {
        this.f58905p = i7;
        this.B = i7 < 50;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: ug.t1.a():void");
    }

    public int b() {
        if (this.O == 100) {
            return i0.a.o(n6.w0(this.Q, this.P), 200);
        }
        return n6.w0(this.Q, this.P);
    }

    public final void c() {
        a();
        boolean z10 = this.G;
        int i7 = this.f58905p;
        if (z10) {
            int length = this.d.length;
            this.C = new Matrix[length];
            this.D = new float[length];
            this.E = new int[length];
            this.F = new float[length];
            for (int i10 = 0; i10 < length; i10++) {
                this.C[i10] = new Matrix();
                this.D[i10] = new float[i7 * 2];
            }
        }
        ArrayList arrayList = this.f58903n;
        if (arrayList.isEmpty()) {
            for (int i11 = 0; i11 < i7; i11++) {
                arrayList.add(new s1(this));
            }
        }
    }

    public final void d(Canvas canvas) {
        e(canvas, 1.0f);
    }

    public final void e(android.graphics.Canvas r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: ug.t1.e(android.graphics.Canvas, float):void");
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f58903n;
            if (i7 < arrayList.size()) {
                ((s1) arrayList.get(i7)).b(currentTimeMillis);
                i7++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        int w02 = n6.w0(this.Q, this.P);
        if (this.f58914z != w02) {
            this.f58914z = w02;
            a();
        }
    }
}
