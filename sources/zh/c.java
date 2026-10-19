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
    public static final long f51681f0 = System.currentTimeMillis();
    public static final String[] f51682g0 = new String[100];
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
    public m T;
    public float U;
    public float V;
    public float W;
    public final l0 f51683a;
    public long f51684a0;
    public j0 f51685b;
    public long f51686b0;
    public final Paint f51687c;
    public boolean f51688c0;
    public final Paint d;
    public final int[] f51689d0;
    public final TextPaint e;
    public final RectF f51690e0;
    public final int[] f51691f;
    public final int[] h;
    public final HashMap f51692n;
    public final ArrayList f51693r;
    public final ArrayList f51694s;
    public final ArrayList v;
    public float f51695w;
    public float f51696x;
    public float f51697y;

    public c(Activity activity, l0 l0Var) {
        super(activity);
        this.f51687c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        new RectF();
        this.f51691f = new int[2];
        this.h = new int[2];
        this.f51692n = new HashMap();
        this.f51693r = new ArrayList();
        this.f51694s = new ArrayList();
        this.v = new ArrayList();
        this.F = new RectF();
        this.G = Float.NaN;
        this.H = -1.0f;
        this.I = new q10(2);
        this.J = new Path();
        this.K = Float.NaN;
        this.L = new RectF();
        this.M = new RectF();
        this.N = new WeakHashMap();
        this.O = new Path();
        this.P = new int[2];
        this.R = new Paint(1);
        this.S = new Paint.FontMetrics();
        this.U = Float.NaN;
        this.W = 0.45f;
        this.f51689d0 = new int[2];
        this.f51690e0 = new RectF();
        this.f51683a = l0Var;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(10.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.STROKE);
    }

    public static long b() {
        return System.currentTimeMillis() - f51681f0;
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
        if (this.f51696x >= 0.5f) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getActionMasked() == 1) {
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList = this.f51693r;
                        if (i10 >= arrayList.size()) {
                            break;
                        }
                        b bVar = (b) arrayList.get(i10);
                        if (!bVar.d) {
                            if (Math.abs(motionEvent.getX() - bVar.f51641b) < AndroidUtilities.dp(34.0f) / 2.0f) {
                                c1 c1Var = ((m0) this.f51683a.f52025a).d;
                                ArrayList arrayList2 = c1Var.I;
                                if (i11 >= 0 && i11 < arrayList2.size()) {
                                    arrayList2.remove(i11);
                                    c1Var.c();
                                    c1Var.i0();
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
