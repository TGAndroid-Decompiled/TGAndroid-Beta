package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c6;
public final class z1 extends View {
    public pg.c1 E;
    public float F;
    public float G;
    public pg.q1 H;
    public Runnable I;
    public boolean J;
    public y1 K;
    public final Paint f41761a;
    public final Paint f41762b;
    public final Path f41763c;
    public final k2.u d;
    public final RectF e;
    public boolean f41764f;
    public boolean h;
    public float f41765n;
    public float f41766r;
    public long f41767s;
    public boolean v;
    public final c6 f41768w;
    public final c6 f41769x;
    public final c6 f41770y;

    public z1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f41761a = paint;
        Paint paint2 = new Paint(1);
        this.f41762b = paint2;
        this.f41763c = new Path();
        this.e = new RectF();
        this.v = true;
        this.f41768w = new c6(this);
        this.f41769x = new c6(this);
        this.f41770y = new c6(this);
        this.H = new pg.q1(1.0f, 0.016773745f, -1);
        this.J = true;
        this.d = new k2.u(context, new x1(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, AndroidUtilities.dp(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 637534208);
    }

    public final void a(float f7, float f10, float f11, Canvas canvas, boolean z10) {
        if (z10) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((f7 - f11) - AndroidUtilities.dp(6.0f), (f10 - f11) - AndroidUtilities.dp(6.0f), f7 + f11 + AndroidUtilities.dp(6.0f), f10 + f11 + AndroidUtilities.dp(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.f41766r * 255.0f), 31);
        }
        canvas.drawCircle(f7, f10, f11, this.f41762b);
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
        throw new UnsupportedOperationException("Method not decompiled: qg.z1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int height = (int) (getHeight() * 0.3f);
        this.e.set(0.0f, (getHeight() - height) / 2.0f, AndroidUtilities.dp(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = ((GestureDetector) this.d.f13385b).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        this.f41764f = false;
        invalidate();
        return onTouchEvent;
    }

    public void setBrushWeight(float f7) {
        this.H.f40999c = f7;
        invalidate();
    }

    public void setColorSwatch(pg.q1 q1Var) {
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

    public void setRenderView(pg.c1 c1Var) {
        this.E = c1Var;
    }

    public void setShowPreview(boolean z10) {
        this.v = z10;
        invalidate();
    }

    public void setValueOverride(y1 y1Var) {
        this.K = y1Var;
        invalidate();
    }

    public void setViewHidden(boolean z10) {
        this.h = z10;
        invalidate();
    }
}
