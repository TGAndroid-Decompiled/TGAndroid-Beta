package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.y5;
public final class w1 extends View {
    public xf.c1 A;
    public float B;
    public float C;
    public xf.q1 D;
    public Runnable E;
    public boolean F;
    public v1 G;
    public final Paint f50151a;
    public final Paint f50152b;
    public final Path f50153c;
    public final m5.c0 d;
    public final RectF f50154e;
    public boolean f50155f;
    public boolean h;
    public float f50156n;
    public float f50157r;
    public long f50158s;
    public boolean v;
    public final y5 f50159w;
    public final y5 f50160x;
    public final y5 f50161y;

    public w1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f50151a = paint;
        Paint paint2 = new Paint(1);
        this.f50152b = paint2;
        this.f50153c = new Path();
        this.f50154e = new RectF();
        this.v = true;
        this.f50159w = new y5(this);
        this.f50160x = new y5(this);
        this.f50161y = new y5(this);
        this.D = new xf.q1(1.0f, 0.016773745f, -1);
        this.F = true;
        this.d = new m5.c0(context, new u1(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, AndroidUtilities.dp(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 637534208);
    }

    public final void a(float f10, float f11, float f12, Canvas canvas, boolean z10) {
        if (z10) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((f10 - f12) - AndroidUtilities.dp(6.0f), (f11 - f12) - AndroidUtilities.dp(6.0f), f10 + f12 + AndroidUtilities.dp(6.0f), f11 + f12 + AndroidUtilities.dp(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.f50157r * 255.0f), 31);
        }
        canvas.drawCircle(f10, f11, f12, this.f50152b);
        if (z10) {
            canvas.restore();
        }
    }

    public final void b(float f10, float f11) {
        this.B = f10;
        this.C = f11;
        invalidate();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: yf.w1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        int height = (int) (getHeight() * 0.3f);
        this.f50154e.set(0.0f, (getHeight() - height) / 2.0f, AndroidUtilities.dp(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = ((GestureDetector) this.d.f17378b).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        this.f50155f = false;
        invalidate();
        return onTouchEvent;
    }

    public void setBrushWeight(float f10) {
        this.D.f49335c = f10;
        invalidate();
    }

    public void setColorSwatch(xf.q1 q1Var) {
        this.D = q1Var;
        invalidate();
    }

    public void setDrawCenter(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.E = runnable;
    }

    public void setRenderView(xf.c1 c1Var) {
        this.A = c1Var;
    }

    public void setShowPreview(boolean z10) {
        this.v = z10;
        invalidate();
    }

    public void setValueOverride(v1 v1Var) {
        this.G = v1Var;
        invalidate();
    }

    public void setViewHidden(boolean z10) {
        this.h = z10;
        invalidate();
    }
}
