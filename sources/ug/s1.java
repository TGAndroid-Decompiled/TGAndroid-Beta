package ug;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.y10;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public class s1 {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public boolean N;
    public h6 P;
    public long R;
    public long S;
    public boolean f58932g;
    public boolean h;
    public y10 f58936l;
    public boolean f58937m;
    public final int f58940p;
    public boolean f58941q;
    public int f58949z;
    public final RectF f58927a = new RectF();
    public final RectF f58928b = new RectF();
    public final RectF f58929c = new RectF();
    public Bitmap[] d = new Bitmap[3];
    public boolean[] f58930e = new boolean[3];
    public boolean[] f58931f = new boolean[3];
    public final Paint f58933i = new Paint();
    public float f58934j = 0.0f;
    public float f58935k = 0.0f;
    public final ArrayList f58938n = new ArrayList();
    public float f58939o = 1.0f;
    public int f58942r = 14;
    public int f58943s = 12;
    public int f58944t = 10;
    public float f58945u = 0.85f;
    public float v = 0.85f;
    public float f58946w = 0.9f;
    public long f58947x = 2000;
    public int f58948y = 1000;
    public final float A = 1000.0f / org.telegram.messenger.g0.f24147r;
    public boolean H = false;
    public boolean I = true;
    public boolean J = true;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public int O = -1;
    public int Q = m6.Lk;
    public int T = 0;

    public s1(int i7) {
        this.f58940p = i7;
        this.B = i7 < 50;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: ug.s1.a():void");
    }

    public int b() {
        if (this.O == 100) {
            return i0.a.o(m6.w0(this.Q, this.P), 200);
        }
        return m6.w0(this.Q, this.P);
    }

    public final void c() {
        a();
        boolean z10 = this.G;
        int i7 = this.f58940p;
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
        ArrayList arrayList = this.f58938n;
        if (arrayList.isEmpty()) {
            for (int i11 = 0; i11 < i7; i11++) {
                arrayList.add(new r1(this));
            }
        }
    }

    public final void d(Canvas canvas) {
        e(canvas, 1.0f);
    }

    public final void e(android.graphics.Canvas r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: ug.s1.e(android.graphics.Canvas, float):void");
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f58938n;
            if (i7 < arrayList.size()) {
                ((r1) arrayList.get(i7)).b(currentTimeMillis);
                i7++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        int w02 = m6.w0(this.Q, this.P);
        if (this.f58949z != w02) {
            this.f58949z = w02;
            a();
        }
    }
}
