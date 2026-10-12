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
import org.telegram.ui.Components.g6;
public final class w1 extends View {
    public pg.d1 E;
    public float F;
    public float G;
    public pg.r1 H;
    public Runnable I;
    public boolean J;
    public v1 K;
    public final Paint f46535a;
    public final Paint f46536b;
    public final Path f46537c;
    public final n4.l d;
    public final RectF f46538e;
    public boolean f46539f;
    public boolean h;
    public float f46540n;
    public float f46541r;
    public long f46542s;
    public boolean v;
    public final g6 f46543w;
    public final g6 f46544x;
    public final g6 f46545y;

    public w1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f46535a = paint;
        Paint paint2 = new Paint(1);
        this.f46536b = paint2;
        this.f46537c = new Path();
        this.f46538e = new RectF();
        this.v = true;
        this.f46543w = new g6(this);
        this.f46544x = new g6(this);
        this.f46545y = new g6(this);
        this.H = new pg.r1(1.0f, 0.016773745f, -1);
        this.J = true;
        this.d = new n4.l(context, new u1(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, AndroidUtilities.dp(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 637534208);
    }

    public final void a(float f7, float f10, float f11, Canvas canvas, boolean z10) {
        if (z10) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((f7 - f11) - AndroidUtilities.dp(6.0f), (f10 - f11) - AndroidUtilities.dp(6.0f), f7 + f11 + AndroidUtilities.dp(6.0f), f10 + f11 + AndroidUtilities.dp(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.f46541r * 255.0f), 31);
        }
        canvas.drawCircle(f7, f10, f11, this.f46536b);
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
        throw new UnsupportedOperationException("Method not decompiled: qg.w1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int height = (int) (getHeight() * 0.3f);
        this.f46538e.set(0.0f, (getHeight() - height) / 2.0f, AndroidUtilities.dp(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = ((GestureDetector) this.d.f16325a).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        this.f46539f = false;
        invalidate();
        return onTouchEvent;
    }

    public void setBrushWeight(float f7) {
        this.H.f45653c = f7;
        invalidate();
    }

    public void setColorSwatch(pg.r1 r1Var) {
        this.H = r1Var;
        invalidate();
    }

    public void setDrawCenter(boolean z10) {
        this.J = z10;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.I = runnable;
    }

    public void setRenderView(pg.d1 d1Var) {
        this.E = d1Var;
    }

    public void setShowPreview(boolean z10) {
        this.v = z10;
        invalidate();
    }

    public void setValueOverride(v1 v1Var) {
        this.K = v1Var;
        invalidate();
    }

    public void setViewHidden(boolean z10) {
        this.h = z10;
        invalidate();
    }
}
