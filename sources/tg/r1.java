package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.nd0;
public final class r1 extends View {
    public final c6 E;
    public sg.t0 F;
    public float G;
    public float H;
    public sg.g1 I;
    public Runnable J;
    public boolean K;
    public q1 L;
    public final Paint f58199a;
    public final Paint f58200b;
    public final Path f58201c;
    public final nd0 d;
    public final RectF f58202e;
    public boolean f58203f;
    public boolean h;
    public float f58204n;
    public float f58205r;
    public long f58206s;
    public boolean f58207w;
    public final c6 f58208x;
    public final c6 f58209y;

    public r1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f58199a = paint;
        Paint paint2 = new Paint(1);
        this.f58200b = paint2;
        this.f58201c = new Path();
        this.f58202e = new RectF();
        this.f58207w = true;
        this.f58208x = new c6(this);
        this.f58209y = new c6(this);
        this.E = new c6(this);
        this.I = new sg.g1(1.0f, 0.016773745f, -1);
        this.K = true;
        this.d = new nd0(context, new p1(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(org.telegram.messenger.g0.L(4.0f), 0.0f, org.telegram.messenger.g0.L(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 637534208);
    }

    public final void a(float f10, float f11, float f12, Canvas canvas, boolean z10) {
        if (z10) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((f10 - f12) - org.telegram.messenger.g0.L(6.0f), (f11 - f12) - org.telegram.messenger.g0.L(6.0f), f10 + f12 + org.telegram.messenger.g0.L(6.0f), f11 + f12 + org.telegram.messenger.g0.L(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.f58205r * 255.0f), 31);
        }
        canvas.drawCircle(f10, f11, f12, this.f58200b);
        if (z10) {
            canvas.restore();
        }
    }

    public final void b(float f10, float f11) {
        this.G = f10;
        this.H = f11;
        invalidate();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: tg.r1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        int height = (int) (getHeight() * 0.3f);
        this.f58202e.set(0.0f, (getHeight() - height) / 2.0f, org.telegram.messenger.g0.L(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = ((GestureDetector) this.d.f37766b).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        this.f58203f = false;
        invalidate();
        return onTouchEvent;
    }

    public void setBrushWeight(float f10) {
        this.I.f57337c = f10;
        invalidate();
    }

    public void setColorSwatch(sg.g1 g1Var) {
        this.I = g1Var;
        invalidate();
    }

    public void setDrawCenter(boolean z10) {
        this.K = z10;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.J = runnable;
    }

    public void setRenderView(sg.t0 t0Var) {
        this.F = t0Var;
    }

    public void setShowPreview(boolean z10) {
        this.f58207w = z10;
        invalidate();
    }

    public void setValueOverride(q1 q1Var) {
        this.L = q1Var;
        invalidate();
    }

    public void setViewHidden(boolean z10) {
        this.h = z10;
        invalidate();
    }
}
