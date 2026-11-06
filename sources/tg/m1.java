package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.w5;
public final class m1 extends View {
    public final w5 D;
    public sg.w0 E;
    public float F;
    public float G;
    public sg.j1 H;
    public Runnable I;
    public boolean J;
    public l1 K;
    public final Paint f55749a;
    public final Paint f55750b;
    public final Path f55751c;
    public final uy d;
    public final RectF f55752e;
    public boolean f55753f;
    public boolean h;
    public float f55754n;
    public float f55755r;
    public long f55756s;
    public boolean f55757w;
    public final w5 f55758x;
    public final w5 f55759y;

    public m1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f55749a = paint;
        Paint paint2 = new Paint(1);
        this.f55750b = paint2;
        this.f55751c = new Path();
        this.f55752e = new RectF();
        this.f55757w = true;
        this.f55758x = new w5(this);
        this.f55759y = new w5(this);
        this.D = new w5(this);
        this.H = new sg.j1(1.0f, 0.016773745f, -1);
        this.J = true;
        this.d = new uy(context, new k1(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(org.telegram.messenger.g0.L(4.0f), 0.0f, org.telegram.messenger.g0.L(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 637534208);
    }

    public final void a(float f10, float f11, float f12, Canvas canvas, boolean z9) {
        if (z9) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((f10 - f12) - org.telegram.messenger.g0.L(6.0f), (f11 - f12) - org.telegram.messenger.g0.L(6.0f), f10 + f12 + org.telegram.messenger.g0.L(6.0f), f11 + f12 + org.telegram.messenger.g0.L(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.f55755r * 255.0f), 31);
        }
        canvas.drawCircle(f10, f11, f12, this.f55750b);
        if (z9) {
            canvas.restore();
        }
    }

    public final void b(float f10, float f11) {
        this.F = f10;
        this.G = f11;
        invalidate();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: tg.m1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        int height = (int) (getHeight() * 0.3f);
        this.f55752e.set(0.0f, (getHeight() - height) / 2.0f, org.telegram.messenger.g0.L(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = ((GestureDetector) this.d.f38757b).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        this.f55753f = false;
        invalidate();
        return onTouchEvent;
    }

    public void setBrushWeight(float f10) {
        this.H.f55019c = f10;
        invalidate();
    }

    public void setColorSwatch(sg.j1 j1Var) {
        this.H = j1Var;
        invalidate();
    }

    public void setDrawCenter(boolean z9) {
        this.J = z9;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.I = runnable;
    }

    public void setRenderView(sg.w0 w0Var) {
        this.E = w0Var;
    }

    public void setShowPreview(boolean z9) {
        this.f55757w = z9;
        invalidate();
    }

    public void setValueOverride(l1 l1Var) {
        this.K = l1Var;
        invalidate();
    }

    public void setViewHidden(boolean z9) {
        this.h = z9;
        invalidate();
    }
}
