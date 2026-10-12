package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public class w1 {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public c6 O;
    public long Q;
    public long R;
    public boolean f45403g;
    public boolean h;
    public Utilities.CallbackReturn f45407l;
    public boolean f45408m;
    public final int f45411p;
    public boolean f45412q;
    public int f45420z;
    public final RectF f45399a = new RectF();
    public final RectF f45400b = new RectF();
    public final RectF f45401c = new RectF();
    public Bitmap[] d = new Bitmap[3];
    public boolean[] e = new boolean[3];
    public boolean[] f45402f = new boolean[3];
    public final Paint f45404i = new Paint();
    public float f45405j = 0.0f;
    public float f45406k = 0.0f;
    public final ArrayList f45409n = new ArrayList();
    public float f45410o = 1.0f;
    public int f45413r = 14;
    public int f45414s = 12;
    public int f45415t = 10;
    public float f45416u = 0.85f;
    public float v = 0.85f;
    public float f45417w = 0.9f;
    public long f45418x = 2000;
    public int f45419y = 1000;
    public final float A = 1000.0f / AndroidUtilities.screenRefreshRate;
    public boolean H = false;
    public boolean I = true;
    public boolean J = true;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public int N = -1;
    public int P = g6.Uj;
    public int S = 0;

    public w1(int i10) {
        this.f45411p = i10;
        this.B = i10 < 50;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: sg.w1.a():void");
    }

    public int b() {
        if (this.N == 100) {
            return i0.a.k(g6.w0(this.P, this.O), 200);
        }
        return g6.w0(this.P, this.O);
    }

    public final void c() {
        a();
        boolean z10 = this.G;
        int i10 = this.f45411p;
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
        ArrayList arrayList = this.f45409n;
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
            ArrayList arrayList = this.f45409n;
            if (i10 < arrayList.size()) {
                ((v1) arrayList.get(i10)).b(currentTimeMillis);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        int w02 = g6.w0(this.P, this.O);
        if (this.f45420z != w02) {
            this.f45420z = w02;
            a();
        }
    }
}
