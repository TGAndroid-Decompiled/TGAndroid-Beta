package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public class w1 {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public boolean N;
    public g6 P;
    public long R;
    public long S;
    public boolean f46913g;
    public boolean h;
    public Utilities.CallbackReturn f46917l;
    public boolean f46918m;
    public final int f46921p;
    public boolean f46922q;
    public int f46930z;
    public final RectF f46909a = new RectF();
    public final RectF f46910b = new RectF();
    public final RectF f46911c = new RectF();
    public Bitmap[] d = new Bitmap[3];
    public boolean[] e = new boolean[3];
    public boolean[] f46912f = new boolean[3];
    public final Paint f46914i = new Paint();
    public float f46915j = 0.0f;
    public float f46916k = 0.0f;
    public final ArrayList f46919n = new ArrayList();
    public float f46920o = 1.0f;
    public int f46923r = 14;
    public int f46924s = 12;
    public int f46925t = 10;
    public float f46926u = 0.85f;
    public float v = 0.85f;
    public float f46927w = 0.9f;
    public long f46928x = 2000;
    public int f46929y = 1000;
    public final float A = 1000.0f / AndroidUtilities.screenRefreshRate;
    public boolean H = false;
    public boolean I = true;
    public boolean J = true;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public int O = -1;
    public int Q = k6.Uj;
    public int T = 0;

    public w1(int i10) {
        this.f46921p = i10;
        this.B = i10 < 50;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: sg.w1.a():void");
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
        int i10 = this.f46921p;
        if (z10) {
            int length = this.d.length;
            this.C = new Matrix[length];
            this.D = new float[length];
            this.E = new int[length];
            this.F = new float[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.C[i11] = new Matrix();
                this.D[i11] = new float[i10 * 2];
            }
        }
        ArrayList arrayList = this.f46919n;
        if (arrayList.isEmpty()) {
            for (int i12 = 0; i12 < i10; i12++) {
                arrayList.add(new v1(this));
            }
        }
    }

    public final void d(Canvas canvas) {
        e(canvas, 1.0f);
    }

    public final void e(android.graphics.Canvas r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: sg.w1.e(android.graphics.Canvas, float):void");
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f46919n;
            if (i10 < arrayList.size()) {
                ((v1) arrayList.get(i10)).b(currentTimeMillis);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        int w02 = k6.w0(this.Q, this.P);
        if (this.f46930z != w02) {
            this.f46930z = w02;
            a();
        }
    }
}
