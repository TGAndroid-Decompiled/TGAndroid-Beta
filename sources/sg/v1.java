package sg;

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
    public boolean N;
    public d6 P;
    public long R;
    public long S;
    public boolean f46494g;
    public boolean h;
    public Utilities.CallbackReturn f46498l;
    public boolean f46499m;
    public final int f46502p;
    public boolean f46503q;
    public int f46511z;
    public final RectF f46490a = new RectF();
    public final RectF f46491b = new RectF();
    public final RectF f46492c = new RectF();
    public Bitmap[] d = new Bitmap[3];
    public boolean[] e = new boolean[3];
    public boolean[] f46493f = new boolean[3];
    public final Paint f46495i = new Paint();
    public float f46496j = 0.0f;
    public float f46497k = 0.0f;
    public final ArrayList f46500n = new ArrayList();
    public float f46501o = 1.0f;
    public int f46504r = 14;
    public int f46505s = 12;
    public int f46506t = 10;
    public float f46507u = 0.85f;
    public float v = 0.85f;
    public float f46508w = 0.9f;
    public long f46509x = 2000;
    public int f46510y = 1000;
    public final float A = 1000.0f / AndroidUtilities.screenRefreshRate;
    public boolean H = false;
    public boolean I = true;
    public boolean J = true;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public int O = -1;
    public int Q = h6.Uj;
    public int T = 0;

    public v1(int i10) {
        this.f46502p = i10;
        this.B = i10 < 50;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: sg.v1.a():void");
    }

    public int b() {
        if (this.O == 100) {
            return i0.a.o(h6.w0(this.Q, this.P), 200);
        }
        return h6.w0(this.Q, this.P);
    }

    public final void c() {
        a();
        boolean z10 = this.G;
        int i10 = this.f46502p;
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
        ArrayList arrayList = this.f46500n;
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
        throw new UnsupportedOperationException("Method not decompiled: sg.v1.e(android.graphics.Canvas, float):void");
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f46500n;
            if (i10 < arrayList.size()) {
                ((u1) arrayList.get(i10)).b(currentTimeMillis);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        int w02 = h6.w0(this.Q, this.P);
        if (this.f46511z != w02) {
            this.f46511z = w02;
            a();
        }
    }
}
