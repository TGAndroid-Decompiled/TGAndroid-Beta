package vg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.v10;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
public class s1 {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public boolean N;
    public e6 P;
    public long R;
    public long S;
    public boolean f56834g;
    public boolean h;
    public v10 f56838l;
    public boolean f56839m;
    public final int f56842p;
    public boolean f56843q;
    public int f56851z;
    public final RectF f56829a = new RectF();
    public final RectF f56830b = new RectF();
    public final RectF f56831c = new RectF();
    public Bitmap[] d = new Bitmap[3];
    public boolean[] f56832e = new boolean[3];
    public boolean[] f56833f = new boolean[3];
    public final Paint f56835i = new Paint();
    public float f56836j = 0.0f;
    public float f56837k = 0.0f;
    public final ArrayList f56840n = new ArrayList();
    public float f56841o = 1.0f;
    public int f56844r = 14;
    public int f56845s = 12;
    public int f56846t = 10;
    public float f56847u = 0.85f;
    public float v = 0.85f;
    public float f56848w = 0.9f;
    public long f56849x = 2000;
    public int f56850y = 1000;
    public final float A = 1000.0f / org.telegram.messenger.g0.f22609r;
    public boolean H = false;
    public boolean I = true;
    public boolean J = true;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public int O = -1;
    public int Q = k6.Ik;
    public int T = 0;

    public s1(int i3) {
        this.f56842p = i3;
        this.B = i3 < 50;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: vg.s1.a():void");
    }

    public int b() {
        if (this.O == 100) {
            return i0.a.o(k6.w0(this.Q, this.P), 200);
        }
        return k6.w0(this.Q, this.P);
    }

    public final void c() {
        a();
        boolean z10 = this.G;
        int i3 = this.f56842p;
        if (z10) {
            int length = this.d.length;
            this.C = new Matrix[length];
            this.D = new float[length];
            this.E = new int[length];
            this.F = new float[length];
            for (int i10 = 0; i10 < length; i10++) {
                this.C[i10] = new Matrix();
                this.D[i10] = new float[i3 * 2];
            }
        }
        ArrayList arrayList = this.f56840n;
        if (arrayList.isEmpty()) {
            for (int i11 = 0; i11 < i3; i11++) {
                arrayList.add(new r1(this));
            }
        }
    }

    public final void d(Canvas canvas) {
        e(canvas, 1.0f);
    }

    public final void e(android.graphics.Canvas r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: vg.s1.e(android.graphics.Canvas, float):void");
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f56840n;
            if (i3 < arrayList.size()) {
                ((r1) arrayList.get(i3)).b(currentTimeMillis);
                i3++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        int w02 = k6.w0(this.Q, this.P);
        if (this.f56851z != w02) {
            this.f56851z = w02;
            a();
        }
    }
}
