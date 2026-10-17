package zh;

import android.app.Activity;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.q10;
public final class c extends View {
    public static final long f51921f0 = System.currentTimeMillis();
    public static final String[] f51922g0 = new String[100];
    public long E;
    public final RectF F;
    public float G;
    public float H;
    public final q10 I;
    public final Path J;
    public float K;
    public final RectF L;
    public final RectF M;
    public final WeakHashMap N;
    public final Path O;
    public final int[] P;
    public LinearGradient Q;
    public final Paint R;
    public final Paint.FontMetrics S;
    public s T;
    public float U;
    public float V;
    public float W;
    public final uc.b f51923a;
    public long f51924a0;
    public k0 f51925b;
    public long f51926b0;
    public final Paint f51927c;
    public boolean f51928c0;
    public final Paint d;
    public final int[] f51929d0;
    public final TextPaint e;
    public final RectF f51930e0;
    public final int[] f51931f;
    public final int[] h;
    public final HashMap f51932n;
    public final ArrayList f51933r;
    public final ArrayList f51934s;
    public final ArrayList v;
    public float f51935w;
    public float f51936x;
    public float f51937y;

    public c(Activity activity, uc.b bVar) {
        super(activity);
        this.f51927c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        new RectF();
        this.f51931f = new int[2];
        this.h = new int[2];
        this.f51932n = new HashMap();
        new ArrayList();
        this.f51933r = new ArrayList();
        this.f51934s = new ArrayList();
        this.v = new ArrayList();
        this.F = new RectF();
        this.G = Float.NaN;
        this.H = -1.0f;
        this.I = new q10(2);
        this.J = new Path();
        this.K = Float.NaN;
        this.L = new RectF();
        new WeakHashMap();
        new WeakHashMap();
        this.M = new RectF();
        this.N = new WeakHashMap();
        this.O = new Path();
        new RectF();
        this.P = new int[2];
        this.R = new Paint(1);
        this.S = new Paint.FontMetrics();
        this.U = Float.NaN;
        this.W = 0.45f;
        this.f51929d0 = new int[2];
        this.f51930e0 = new RectF();
        this.f51923a = bVar;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(10.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.STROKE);
    }

    public static long b() {
        return System.currentTimeMillis() - f51921f0;
    }

    public static float c(float[] fArr, long j10) {
        float min = Math.min(1.0f, ((float) (j10 - fArr[2])) / 180.0f);
        float f7 = fArr[1];
        float max = 1.0f - Math.max(0.0f, Math.min(1.0f, min));
        return ((1.0f - ((max * max) * max)) * (fArr[0] - f7)) + f7;
    }

    public final boolean a(android.graphics.Canvas r37, android.view.ViewGroup r38, java.util.List r39, long r40) {
        throw new UnsupportedOperationException("Method not decompiled: zh.c.a(android.graphics.Canvas, android.view.ViewGroup, java.util.List, long):boolean");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: zh.c.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10 = 0;
        if (this.f51936x >= 0.5f) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getActionMasked() == 1) {
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList = this.f51933r;
                        if (i10 >= arrayList.size()) {
                            break;
                        }
                        b bVar = (b) arrayList.get(i10);
                        if (!bVar.d) {
                            if (Math.abs(motionEvent.getX() - bVar.f51663b) < AndroidUtilities.dp(34.0f) / 2.0f) {
                                b1 b1Var = ((m0) this.f51923a.f47648a).d;
                                ArrayList arrayList2 = b1Var.I;
                                if (i11 >= 0 && i11 < arrayList2.size()) {
                                    arrayList2.remove(i11);
                                    b1Var.b();
                                    b1Var.g0();
                                }
                                invalidate();
                                return true;
                            }
                            i11++;
                        }
                        i10++;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
