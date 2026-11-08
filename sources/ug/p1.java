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
    public boolean f56769g;
    public boolean h;
    public d20 f56773l;
    public boolean f56774m;
    public final int f56777p;
    public boolean f56778q;
    public int f56786z;
    public final RectF f56764a = new RectF();
    public final RectF f56765b = new RectF();
    public final RectF f56766c = new RectF();
    public Bitmap[] d = new Bitmap[3];
    public boolean[] f56767e = new boolean[3];
    public boolean[] f56768f = new boolean[3];
    public final Paint f56770i = new Paint();
    public float f56771j = 0.0f;
    public float f56772k = 0.0f;
    public final ArrayList f56775n = new ArrayList();
    public float f56776o = 1.0f;
    public int f56779r = 14;
    public int f56780s = 12;
    public int f56781t = 10;
    public float f56782u = 0.85f;
    public float v = 0.85f;
    public float f56783w = 0.9f;
    public long f56784x = 2000;
    public int f56785y = 1000;
    public final float A = 1000.0f / org.telegram.messenger.g0.f22564r;
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
        this.f56777p = i7;
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
        int i7 = this.f56777p;
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
        ArrayList arrayList = this.f56775n;
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
            ArrayList arrayList = this.f56775n;
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
        if (this.f56786z != w02) {
            this.f56786z = w02;
            a();
        }
    }
}
