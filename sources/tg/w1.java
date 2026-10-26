package tg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
public class w1 {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public boolean N;
    public u6 P;
    public long R;
    public long S;
    public boolean f49094g;
    public boolean h;
    public Utilities.CallbackReturn f49098l;
    public boolean f49099m;
    public final int f49102p;
    public boolean f49103q;
    public int f49111z;
    public final RectF f49090a = new RectF();
    public final RectF f49091b = new RectF();
    public final RectF f49092c = new RectF();
    public Bitmap[] d = new Bitmap[3];
    public boolean[] e = new boolean[3];
    public boolean[] f49093f = new boolean[3];
    public final Paint f49095i = new Paint();
    public float f49096j = 0.0f;
    public float f49097k = 0.0f;
    public final ArrayList f49100n = new ArrayList();
    public float f49101o = 1.0f;
    public int f49104r = 14;
    public int f49105s = 12;
    public int f49106t = 10;
    public float f49107u = 0.85f;
    public float v = 0.85f;
    public float f49108w = 0.9f;
    public long f49109x = 2000;
    public int f49110y = 1000;
    public final float A = 1000.0f / AndroidUtilities.screenRefreshRate;
    public boolean H = false;
    public boolean I = true;
    public boolean J = true;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public int O = -1;
    public int Q = y6.Uj;
    public int T = 0;

    public w1(int i10) {
        this.f49102p = i10;
        this.B = i10 < 50;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: tg.w1.a():void");
    }

    public int b() {
        if (this.O == 100) {
            return i0.a.o(y6.w0(this.Q, this.P), 200);
        }
        return y6.w0(this.Q, this.P);
    }

    public final void c() {
        a();
        boolean z10 = this.G;
        int i10 = this.f49102p;
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
        ArrayList arrayList = this.f49100n;
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
        throw new UnsupportedOperationException("Method not decompiled: tg.w1.e(android.graphics.Canvas, float):void");
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f49100n;
            if (i10 < arrayList.size()) {
                ((v1) arrayList.get(i10)).b(currentTimeMillis);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        int w02 = y6.w0(this.Q, this.P);
        if (this.f49111z != w02) {
            this.f49111z = w02;
            a();
        }
    }
}
