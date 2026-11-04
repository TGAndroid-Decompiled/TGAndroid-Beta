package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.y00;
public final class l1 extends View {
    public final u5 E;
    public tg.u0 F;
    public float G;
    public float H;
    public tg.h1 I;
    public Runnable J;
    public boolean K;
    public k1 L;
    public final Paint f56130a;
    public final Paint f56131b;
    public final Path f56132c;
    public final y00 d;
    public final RectF f56133e;
    public boolean f56134f;
    public boolean h;
    public float f56135n;
    public float f56136r;
    public long f56137s;
    public boolean f56138w;
    public final u5 f56139x;
    public final u5 f56140y;

    public l1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f56130a = paint;
        Paint paint2 = new Paint(1);
        this.f56131b = paint2;
        this.f56132c = new Path();
        this.f56133e = new RectF();
        this.f56138w = true;
        this.f56139x = new u5(this);
        this.f56140y = new u5(this);
        this.E = new u5(this);
        this.I = new tg.h1(1.0f, 0.016773745f, -1);
        this.K = true;
        this.d = new y00(context, new j1(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(org.telegram.messenger.g0.L(4.0f), 0.0f, org.telegram.messenger.g0.L(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 637534208);
    }

    public final void a(float f10, float f11, float f12, Canvas canvas, boolean z10) {
        if (z10) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((f10 - f12) - org.telegram.messenger.g0.L(6.0f), (f11 - f12) - org.telegram.messenger.g0.L(6.0f), f10 + f12 + org.telegram.messenger.g0.L(6.0f), f11 + f12 + org.telegram.messenger.g0.L(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.f56136r * 255.0f), 31);
        }
        canvas.drawCircle(f10, f11, f12, this.f56131b);
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
        throw new UnsupportedOperationException("Method not decompiled: ug.l1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        int height = (int) (getHeight() * 0.3f);
        this.f56133e.set(0.0f, (getHeight() - height) / 2.0f, org.telegram.messenger.g0.L(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = ((GestureDetector) this.d.f40562a).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        this.f56134f = false;
        invalidate();
        return onTouchEvent;
    }

    public void setBrushWeight(float f10) {
        this.I.f55188c = f10;
        invalidate();
    }

    public void setColorSwatch(tg.h1 h1Var) {
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

    public void setRenderView(tg.u0 u0Var) {
        this.F = u0Var;
    }

    public void setShowPreview(boolean z10) {
        this.f56138w = z10;
        invalidate();
    }

    public void setValueOverride(k1 k1Var) {
        this.L = k1Var;
        invalidate();
    }

    public void setViewHidden(boolean z10) {
        this.h = z10;
        invalidate();
    }
}
