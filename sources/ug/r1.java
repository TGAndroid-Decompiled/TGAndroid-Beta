package ug;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.a20;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
public class r1 {
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
    public boolean f58310g;
    public boolean h;
    public a20 f58314l;
    public boolean f58315m;
    public final int f58318p;
    public boolean f58319q;
    public int f58327z;
    public final RectF f58305a = new RectF();
    public final RectF f58306b = new RectF();
    public final RectF f58307c = new RectF();
    public Bitmap[] d = new Bitmap[3];
    public boolean[] f58308e = new boolean[3];
    public boolean[] f58309f = new boolean[3];
    public final Paint f58311i = new Paint();
    public float f58312j = 0.0f;
    public float f58313k = 0.0f;
    public final ArrayList f58316n = new ArrayList();
    public float f58317o = 1.0f;
    public int f58320r = 14;
    public int f58321s = 12;
    public int f58322t = 10;
    public float f58323u = 0.85f;
    public float v = 0.85f;
    public float f58324w = 0.9f;
    public long f58325x = 2000;
    public int f58326y = 1000;
    public final float A = 1000.0f / org.telegram.messenger.g0.f23610r;
    public boolean H = false;
    public boolean I = true;
    public boolean J = true;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public int O = -1;
    public int Q = j6.Lk;
    public int T = 0;

    public r1(int i7) {
        this.f58318p = i7;
        this.B = i7 < 50;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: ug.r1.a():void");
    }

    public int b() {
        if (this.O == 100) {
            return i0.a.o(j6.w0(this.Q, this.P), 200);
        }
        return j6.w0(this.Q, this.P);
    }

    public final void c() {
        a();
        boolean z10 = this.G;
        int i7 = this.f58318p;
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
        ArrayList arrayList = this.f58316n;
        if (arrayList.isEmpty()) {
            for (int i11 = 0; i11 < i7; i11++) {
                arrayList.add(new q1(this));
            }
        }
    }

    public final void d(Canvas canvas) {
        e(canvas, 1.0f);
    }

    public final void e(android.graphics.Canvas r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: ug.r1.e(android.graphics.Canvas, float):void");
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f58316n;
            if (i7 < arrayList.size()) {
                ((q1) arrayList.get(i7)).b(currentTimeMillis);
                i7++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        int w02 = j6.w0(this.Q, this.P);
        if (this.f58327z != w02) {
            this.f58327z = w02;
            a();
        }
    }
}
