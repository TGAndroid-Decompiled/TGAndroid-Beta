package qh;

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
import org.telegram.messenger.k9;
public final class c extends View {
    public static final long f45572f0 = System.currentTimeMillis();
    public static final String[] f45573g0 = new String[100];
    public float D;
    public long E;
    public final RectF F;
    public float G;
    public float H;
    public final k9 I;
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
    public final k2.m0 f45574a;
    public long f45575a0;
    public g0 f45576b;
    public long f45577b0;
    public final Paint f45578c;
    public boolean f45579c0;
    public final Paint d;
    public final int[] f45580d0;
    public final TextPaint e;
    public final RectF f45581e0;
    public final int[] f45582f;
    public final int[] h;
    public final HashMap f45583n;
    public final ArrayList f45584r;
    public final ArrayList f45585s;
    public final ArrayList f45586w;
    public float f45587x;
    public float f45588y;

    public c(Activity activity, k2.m0 m0Var) {
        super(activity);
        this.f45578c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        new RectF();
        this.f45582f = new int[2];
        this.h = new int[2];
        this.f45583n = new HashMap();
        this.f45584r = new ArrayList();
        this.f45585s = new ArrayList();
        this.f45586w = new ArrayList();
        this.F = new RectF();
        this.G = Float.NaN;
        this.H = -1.0f;
        this.I = new k9(3);
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
        this.f45580d0 = new int[2];
        this.f45581e0 = new RectF();
        this.f45574a = m0Var;
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.L(10.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.STROKE);
    }

    public static long b() {
        return System.currentTimeMillis() - f45572f0;
    }

    public static float c(float[] fArr, long j10) {
        float min = Math.min(1.0f, ((float) (j10 - fArr[2])) / 180.0f);
        float f7 = fArr[1];
        float max = 1.0f - Math.max(0.0f, Math.min(1.0f, min));
        return ((1.0f - ((max * max) * max)) * (fArr[0] - f7)) + f7;
    }

    public final boolean a(android.graphics.Canvas r37, android.view.ViewGroup r38, java.util.List r39, long r40) {
        throw new UnsupportedOperationException("Method not decompiled: qh.c.a(android.graphics.Canvas, android.view.ViewGroup, java.util.List, long):boolean");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: qh.c.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10 = 0;
        if (this.f45588y >= 0.5f) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getActionMasked() == 1) {
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList = this.f45584r;
                        if (i10 >= arrayList.size()) {
                            break;
                        }
                        b bVar = (b) arrayList.get(i10);
                        if (!bVar.d) {
                            if (Math.abs(motionEvent.getX() - bVar.f45568b) < org.telegram.messenger.i0.L(34.0f) / 2.0f) {
                                x0 x0Var = ((i0) this.f45574a.f10700a).d;
                                ArrayList arrayList2 = x0Var.I;
                                if (i11 >= 0 && i11 < arrayList2.size()) {
                                    arrayList2.remove(i11);
                                    x0Var.c();
                                    x0Var.i0();
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
