package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e6;
public final class y1 extends View {
    public qg.c1 E;
    public float F;
    public float G;
    public qg.q1 H;
    public Runnable I;
    public boolean J;
    public x1 K;
    public final Paint f45563a;
    public final Paint f45564b;
    public final Path f45565c;
    public final l.d d;
    public final RectF f45566e;
    public boolean f45567f;
    public boolean h;
    public float f45568n;
    public float f45569r;
    public long f45570s;
    public boolean v;
    public final e6 f45571w;
    public final e6 f45572x;
    public final e6 f45573y;

    public y1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f45563a = paint;
        Paint paint2 = new Paint(1);
        this.f45564b = paint2;
        this.f45565c = new Path();
        this.f45566e = new RectF();
        this.v = true;
        this.f45571w = new e6(this);
        this.f45572x = new e6(this);
        this.f45573y = new e6(this);
        this.H = new qg.q1(1.0f, 0.016773745f, -1);
        this.J = true;
        this.d = new l.d(context, new w1(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, AndroidUtilities.dp(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 637534208);
    }

    public final void a(float f7, float f10, float f11, Canvas canvas, boolean z10) {
        if (z10) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((f7 - f11) - AndroidUtilities.dp(6.0f), (f10 - f11) - AndroidUtilities.dp(6.0f), f7 + f11 + AndroidUtilities.dp(6.0f), f10 + f11 + AndroidUtilities.dp(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.f45569r * 255.0f), 31);
        }
        canvas.drawCircle(f7, f10, f11, this.f45564b);
        if (z10) {
            canvas.restore();
        }
    }

    public final void b(float f7, float f10) {
        this.F = f7;
        this.G = f10;
        invalidate();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: rg.y1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int height = (int) (getHeight() * 0.3f);
        this.f45566e.set(0.0f, (getHeight() - height) / 2.0f, AndroidUtilities.dp(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = ((GestureDetector) this.d.f15072b).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        this.f45567f = false;
        invalidate();
        return onTouchEvent;
    }

    public void setBrushWeight(float f7) {
        this.H.f44543c = f7;
        invalidate();
    }

    public void setColorSwatch(qg.q1 q1Var) {
        this.H = q1Var;
        invalidate();
    }

    public void setDrawCenter(boolean z10) {
        this.J = z10;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.I = runnable;
    }

    public void setRenderView(qg.c1 c1Var) {
        this.E = c1Var;
    }

    public void setShowPreview(boolean z10) {
        this.v = z10;
        invalidate();
    }

    public void setValueOverride(x1 x1Var) {
        this.K = x1Var;
        invalidate();
    }

    public void setViewHidden(boolean z10) {
        this.h = z10;
        invalidate();
    }
}
