package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jn;
public final class n1 extends View {
    public final d6 E;
    public sg.u0 F;
    public float G;
    public float H;
    public sg.h1 I;
    public Runnable J;
    public boolean K;
    public m1 L;
    public final Paint f58072a;
    public final Paint f58073b;
    public final Path f58074c;
    public final jn d;
    public final RectF f58075e;
    public boolean f58076f;
    public boolean h;
    public float f58077n;
    public float f58078r;
    public long f58079s;
    public boolean f58080w;
    public final d6 f58081x;
    public final d6 f58082y;

    public n1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f58072a = paint;
        Paint paint2 = new Paint(1);
        this.f58073b = paint2;
        this.f58074c = new Path();
        this.f58075e = new RectF();
        this.f58080w = true;
        this.f58081x = new d6(this);
        this.f58082y = new d6(this);
        this.E = new d6(this);
        this.I = new sg.h1(1.0f, 0.016773745f, -1);
        this.K = true;
        this.d = new jn(context, new l1(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(org.telegram.messenger.g0.L(4.0f), 0.0f, org.telegram.messenger.g0.L(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 637534208);
    }

    public final void a(float f10, float f11, float f12, Canvas canvas, boolean z10) {
        if (z10) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((f10 - f12) - org.telegram.messenger.g0.L(6.0f), (f11 - f12) - org.telegram.messenger.g0.L(6.0f), f10 + f12 + org.telegram.messenger.g0.L(6.0f), f11 + f12 + org.telegram.messenger.g0.L(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.f58078r * 255.0f), 31);
        }
        canvas.drawCircle(f10, f11, f12, this.f58073b);
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
        throw new UnsupportedOperationException("Method not decompiled: tg.n1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        int height = (int) (getHeight() * 0.3f);
        this.f58075e.set(0.0f, (getHeight() - height) / 2.0f, org.telegram.messenger.g0.L(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = ((GestureDetector) this.d.f36572b).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        this.f58076f = false;
        invalidate();
        return onTouchEvent;
    }

    public void setBrushWeight(float f10) {
        this.I.f57261c = f10;
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
        this.f58080w = z10;
        invalidate();
    }

    public void setValueOverride(m1 m1Var) {
        this.L = m1Var;
        invalidate();
    }

    public void setViewHidden(boolean z10) {
        this.h = z10;
        invalidate();
    }
}
