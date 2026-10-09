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
public class v1 {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public e6 O;
    public long Q;
    public long R;
    public boolean f47481g;
    public boolean h;
    public Utilities.CallbackReturn f47485l;
    public boolean f47486m;
    public final int f47489p;
    public boolean f47490q;
    public int f47498z;
    public final RectF f47476a = new RectF();
    public final RectF f47477b = new RectF();
    public final RectF f47478c = new RectF();
    public Bitmap[] d = new Bitmap[3];
    public boolean[] f47479e = new boolean[3];
    public boolean[] f47480f = new boolean[3];
    public final Paint f47482i = new Paint();
    public float f47483j = 0.0f;
    public float f47484k = 0.0f;
    public final ArrayList f47487n = new ArrayList();
    public float f47488o = 1.0f;
    public int f47491r = 14;
    public int f47492s = 12;
    public int f47493t = 10;
    public float f47494u = 0.85f;
    public float v = 0.85f;
    public float f47495w = 0.9f;
    public long f47496x = 2000;
    public int f47497y = 1000;
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

    public v1(int i10) {
        this.f47489p = i10;
        this.B = i10 < 50;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: rg.v1.a():void");
    }

    public int b() {
        if (this.N == 100) {
            return i0.a.k(i6.w0(this.P, this.O), 200);
        }
        return i6.w0(this.P, this.O);
    }

    public final void c() {
        a();
        boolean z10 = this.G;
        int i10 = this.f47489p;
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
        ArrayList arrayList = this.f47487n;
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
            ArrayList arrayList = this.f47487n;
            if (i10 < arrayList.size()) {
                ((u1) arrayList.get(i10)).b(currentTimeMillis);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        int w02 = i6.w0(this.P, this.O);
        if (this.f47498z != w02) {
            this.f47498z = w02;
            a();
        }
    }
}
