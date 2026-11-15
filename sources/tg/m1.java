package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ou;
import org.telegram.ui.Components.u5;
public final class m1 extends View {
    public final u5 E;
    public sg.u0 F;
    public float G;
    public float H;
    public sg.h1 I;
    public Runnable J;
    public boolean K;
    public l1 L;
    public final Paint f57433a;
    public final Paint f57434b;
    public final Path f57435c;
    public final ou d;
    public final RectF f57436e;
    public boolean f57437f;
    public boolean h;
    public float f57438n;
    public float f57439r;
    public long f57440s;
    public boolean f57441w;
    public final u5 f57442x;
    public final u5 f57443y;

    public m1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f57433a = paint;
        Paint paint2 = new Paint(1);
        this.f57434b = paint2;
        this.f57435c = new Path();
        this.f57436e = new RectF();
        this.f57441w = true;
        this.f57442x = new u5(this);
        this.f57443y = new u5(this);
        this.E = new u5(this);
        this.I = new sg.h1(1.0f, 0.016773745f, -1);
        this.K = true;
        this.d = new ou(context, new k1(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(org.telegram.messenger.g0.L(4.0f), 0.0f, org.telegram.messenger.g0.L(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 637534208);
    }

    public final void a(float f10, float f11, float f12, Canvas canvas, boolean z10) {
        if (z10) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((f10 - f12) - org.telegram.messenger.g0.L(6.0f), (f11 - f12) - org.telegram.messenger.g0.L(6.0f), f10 + f12 + org.telegram.messenger.g0.L(6.0f), f11 + f12 + org.telegram.messenger.g0.L(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.f57439r * 255.0f), 31);
        }
        canvas.drawCircle(f10, f11, f12, this.f57434b);
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
        throw new UnsupportedOperationException("Method not decompiled: tg.m1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        int height = (int) (getHeight() * 0.3f);
        this.f57436e.set(0.0f, (getHeight() - height) / 2.0f, org.telegram.messenger.g0.L(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = ((GestureDetector) this.d.f25804b).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        this.f57437f = false;
        invalidate();
        return onTouchEvent;
    }

    public void setBrushWeight(float f10) {
        this.I.f56646c = f10;
        invalidate();
    }

    public void setColorSwatch(sg.h1 h1Var) {
        this.I = h1Var;
        invalidate();
    }

    public void setDrawCenter(boolean z10) {
        this.K = z10;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.J = runnable;
    }

    public void setRenderView(sg.u0 u0Var) {
        this.F = u0Var;
    }

    public void setShowPreview(boolean z10) {
        this.f57441w = z10;
        invalidate();
    }

    public void setValueOverride(l1 l1Var) {
        this.L = l1Var;
        invalidate();
    }

    public void setViewHidden(boolean z10) {
        this.h = z10;
        invalidate();
    }
}
