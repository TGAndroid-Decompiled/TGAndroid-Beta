package ug;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.d20;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
public class p1 {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public boolean N;
    public f6 P;
    public long R;
    public long S;
    public boolean f56676g;
    public boolean h;
    public d20 f56680l;
    public boolean f56681m;
    public final int f56684p;
    public boolean f56685q;
    public int f56693z;
    public final RectF f56671a = new RectF();
    public final RectF f56672b = new RectF();
    public final RectF f56673c = new RectF();
    public Bitmap[] d = new Bitmap[3];
    public boolean[] f56674e = new boolean[3];
    public boolean[] f56675f = new boolean[3];
    public final Paint f56677i = new Paint();
    public float f56678j = 0.0f;
    public float f56679k = 0.0f;
    public final ArrayList f56682n = new ArrayList();
    public float f56683o = 1.0f;
    public int f56686r = 14;
    public int f56687s = 12;
    public int f56688t = 10;
    public float f56689u = 0.85f;
    public float v = 0.85f;
    public float f56690w = 0.9f;
    public long f56691x = 2000;
    public int f56692y = 1000;
    public final float A = 1000.0f / org.telegram.messenger.g0.f22545r;
    public boolean H = false;
    public boolean I = true;
    public boolean J = true;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public int O = -1;
    public int Q = k6.Ik;
    public int T = 0;

    public p1(int i7) {
        this.f56684p = i7;
        this.B = i7 < 50;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: ug.p1.a():void");
    }

    public int b() {
        if (this.O == 100) {
            return i0.a.o(k6.w0(this.Q, this.P), 200);
        }
        return k6.w0(this.Q, this.P);
    }

    public final void c() {
        a();
        boolean z9 = this.G;
        int i7 = this.f56684p;
        if (z9) {
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
        ArrayList arrayList = this.f56682n;
        if (arrayList.isEmpty()) {
            for (int i11 = 0; i11 < i7; i11++) {
                arrayList.add(new o1(this));
            }
        }
    }

    public final void d(Canvas canvas) {
        e(canvas, 1.0f);
    }

    public final void e(android.graphics.Canvas r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: ug.p1.e(android.graphics.Canvas, float):void");
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f56682n;
            if (i7 < arrayList.size()) {
                ((o1) arrayList.get(i7)).b(currentTimeMillis);
                i7++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        int w02 = k6.w0(this.Q, this.P);
        if (this.f56693z != w02) {
            this.f56693z = w02;
            a();
        }
    }
}
