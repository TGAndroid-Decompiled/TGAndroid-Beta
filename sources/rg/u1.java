package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
public class u1 {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public e6 O;
    public long Q;
    public long R;
    public boolean f42496g;
    public boolean h;
    public Utilities.CallbackReturn f42500l;
    public boolean f42501m;
    public final int f42504p;
    public boolean f42505q;
    public int f42513z;
    public final RectF f42492a = new RectF();
    public final RectF f42493b = new RectF();
    public final RectF f42494c = new RectF();
    public Bitmap[] d = new Bitmap[3];
    public boolean[] e = new boolean[3];
    public boolean[] f42495f = new boolean[3];
    public final Paint f42497i = new Paint();
    public float f42498j = 0.0f;
    public float f42499k = 0.0f;
    public final ArrayList f42502n = new ArrayList();
    public float f42503o = 1.0f;
    public int f42506r = 14;
    public int f42507s = 12;
    public int f42508t = 10;
    public float f42509u = 0.85f;
    public float v = 0.85f;
    public float f42510w = 0.9f;
    public long f42511x = 2000;
    public int f42512y = 1000;
    public final float A = 1000.0f / AndroidUtilities.screenRefreshRate;
    public boolean H = false;
    public boolean I = true;
    public boolean J = true;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public int N = -1;
    public int P = i6.Uj;
    public int S = 0;

    public u1(int i10) {
        this.f42504p = i10;
        this.B = i10 < 50;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: rg.u1.a():void");
    }

    public int b() {
        if (this.N == 100) {
            return i0.a.k(i6.v0(this.P, this.O), 200);
        }
        return i6.v0(this.P, this.O);
    }

    public final void c() {
        a();
        boolean z10 = this.G;
        int i10 = this.f42504p;
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
        ArrayList arrayList = this.f42502n;
        if (arrayList.isEmpty()) {
            for (int i12 = 0; i12 < i10; i12++) {
                arrayList.add(new t1(this));
            }
        }
    }

    public final void d(Canvas canvas) {
        e(canvas, 1.0f);
    }

    public final void e(android.graphics.Canvas r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: rg.u1.e(android.graphics.Canvas, float):void");
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f42502n;
            if (i10 < arrayList.size()) {
                ((t1) arrayList.get(i10)).b(currentTimeMillis);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        int v02 = i6.v0(this.P, this.O);
        if (this.f42513z != v02) {
            this.f42513z = v02;
            a();
        }
    }
}
