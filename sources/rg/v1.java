package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public class v1 {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public d6 O;
    public long Q;
    public long R;
    public boolean f42790g;
    public boolean h;
    public Utilities.CallbackReturn f42794l;
    public boolean f42795m;
    public final int f42798p;
    public boolean f42799q;
    public int f42807z;
    public final RectF f42786a = new RectF();
    public final RectF f42787b = new RectF();
    public final RectF f42788c = new RectF();
    public Bitmap[] d = new Bitmap[3];
    public boolean[] e = new boolean[3];
    public boolean[] f42789f = new boolean[3];
    public final Paint f42791i = new Paint();
    public float f42792j = 0.0f;
    public float f42793k = 0.0f;
    public final ArrayList f42796n = new ArrayList();
    public float f42797o = 1.0f;
    public int f42800r = 14;
    public int f42801s = 12;
    public int f42802t = 10;
    public float f42803u = 0.85f;
    public float v = 0.85f;
    public float f42804w = 0.9f;
    public long f42805x = 2000;
    public int f42806y = 1000;
    public final float A = 1000.0f / AndroidUtilities.screenRefreshRate;
    public boolean H = false;
    public boolean I = true;
    public boolean J = true;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public int N = -1;
    public int P = h6.Uj;
    public int S = 0;

    public v1(int i10) {
        this.f42798p = i10;
        this.B = i10 < 50;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: rg.v1.a():void");
    }

    public int b() {
        if (this.N == 100) {
            return i0.a.k(h6.v0(this.P, this.O), 200);
        }
        return h6.v0(this.P, this.O);
    }

    public final void c() {
        a();
        boolean z10 = this.G;
        int i10 = this.f42798p;
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
        ArrayList arrayList = this.f42796n;
        if (arrayList.isEmpty()) {
            for (int i12 = 0; i12 < i10; i12++) {
                arrayList.add(new u1(this));
            }
        }
    }

    public final void d(Canvas canvas) {
        e(canvas, 1.0f);
    }

    public final void e(android.graphics.Canvas r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: rg.v1.e(android.graphics.Canvas, float):void");
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f42796n;
            if (i10 < arrayList.size()) {
                ((u1) arrayList.get(i10)).b(currentTimeMillis);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        int v02 = h6.v0(this.P, this.O);
        if (this.f42807z != v02) {
            this.f42807z = v02;
            a();
        }
    }
}
