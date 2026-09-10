package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public class w1 {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public f6 O;
    public long Q;
    public long R;
    public boolean f40959g;
    public boolean h;
    public Utilities.CallbackReturn f40963l;
    public boolean f40964m;
    public final int f40967p;
    public boolean f40968q;
    public int f40976z;
    public final RectF f40955a = new RectF();
    public final RectF f40956b = new RectF();
    public final RectF f40957c = new RectF();
    public Bitmap[] d = new Bitmap[3];
    public boolean[] e = new boolean[3];
    public boolean[] f40958f = new boolean[3];
    public final Paint f40960i = new Paint();
    public float f40961j = 0.0f;
    public float f40962k = 0.0f;
    public final ArrayList f40965n = new ArrayList();
    public float f40966o = 1.0f;
    public int f40969r = 14;
    public int f40970s = 12;
    public int f40971t = 10;
    public float f40972u = 0.85f;
    public float v = 0.85f;
    public float f40973w = 0.9f;
    public long f40974x = 2000;
    public int f40975y = 1000;
    public final float A = 1000.0f / AndroidUtilities.screenRefreshRate;
    public boolean H = false;
    public boolean I = true;
    public boolean J = true;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public int N = -1;
    public int P = j6.Uj;
    public int S = 0;

    public w1(int i10) {
        this.f40967p = i10;
        this.B = i10 < 50;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: qg.w1.a():void");
    }

    public int b() {
        if (this.N == 100) {
            return i0.a.k(j6.v0(this.P, this.O), 200);
        }
        return j6.v0(this.P, this.O);
    }

    public final void c() {
        a();
        boolean z10 = this.G;
        int i10 = this.f40967p;
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
        ArrayList arrayList = this.f40965n;
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
        throw new UnsupportedOperationException("Method not decompiled: qg.w1.e(android.graphics.Canvas, float):void");
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f40965n;
            if (i10 < arrayList.size()) {
                ((v1) arrayList.get(i10)).b(currentTimeMillis);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        int v02 = j6.v0(this.P, this.O);
        if (this.f40976z != v02) {
            this.f40976z = v02;
            a();
        }
    }
}
