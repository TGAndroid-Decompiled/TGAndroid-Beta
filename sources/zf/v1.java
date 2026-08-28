package zf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public class v1 {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public b6 O;
    public long Q;
    public long R;
    public boolean f50738g;
    public boolean h;
    public Utilities.CallbackReturn f50742l;
    public boolean f50743m;
    public final int f50746p;
    public boolean f50747q;
    public int f50755z;
    public final RectF f50733a = new RectF();
    public final RectF f50734b = new RectF();
    public final RectF f50735c = new RectF();
    public Bitmap[] d = new Bitmap[3];
    public boolean[] f50736e = new boolean[3];
    public boolean[] f50737f = new boolean[3];
    public final Paint f50739i = new Paint();
    public float f50740j = 0.0f;
    public float f50741k = 0.0f;
    public final ArrayList f50744n = new ArrayList();
    public float f50745o = 1.0f;
    public int f50748r = 14;
    public int f50749s = 12;
    public int f50750t = 10;
    public float f50751u = 0.85f;
    public float v = 0.85f;
    public float f50752w = 0.9f;
    public long f50753x = 2000;
    public int f50754y = 1000;
    public final float A = 1000.0f / AndroidUtilities.screenRefreshRate;
    public boolean H = false;
    public boolean I = true;
    public boolean J = true;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public int N = -1;
    public int P = f6.Uj;
    public int S = 0;

    public v1(int i9) {
        this.f50746p = i9;
        this.B = i9 < 50;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: zf.v1.a():void");
    }

    public int b() {
        if (this.N == 100) {
            return i0.a.k(f6.v0(this.P, this.O), 200);
        }
        return f6.v0(this.P, this.O);
    }

    public final void c() {
        a();
        boolean z10 = this.G;
        int i9 = this.f50746p;
        if (z10) {
            int length = this.d.length;
            this.C = new Matrix[length];
            this.D = new float[length];
            this.E = new int[length];
            this.F = new float[length];
            for (int i10 = 0; i10 < length; i10++) {
                this.C[i10] = new Matrix();
                this.D[i10] = new float[i9 * 2];
            }
        }
        ArrayList arrayList = this.f50744n;
        if (arrayList.isEmpty()) {
            for (int i11 = 0; i11 < i9; i11++) {
                arrayList.add(new u1(this));
            }
        }
    }

    public final void d(Canvas canvas) {
        e(canvas, 1.0f);
    }

    public final void e(android.graphics.Canvas r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: zf.v1.e(android.graphics.Canvas, float):void");
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f50744n;
            if (i9 < arrayList.size()) {
                ((u1) arrayList.get(i9)).b(currentTimeMillis);
                i9++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        int v02 = f6.v0(this.P, this.O);
        if (this.f50755z != v02) {
            this.f50755z = v02;
            a();
        }
    }
}
