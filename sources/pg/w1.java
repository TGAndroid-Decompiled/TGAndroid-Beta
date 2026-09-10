package pg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d6;
public final class w1 extends View {
    public og.h1 E;
    public float F;
    public float G;
    public og.v1 H;
    public Runnable I;
    public boolean J;
    public v1 K;
    public final Paint f40342a;
    public final Paint f40343b;
    public final Path f40344c;
    public final l2.h d;
    public final RectF e;
    public boolean f40345f;
    public boolean h;
    public float f40346n;
    public float f40347r;
    public long f40348s;
    public boolean v;
    public final d6 f40349w;
    public final d6 f40350x;
    public final d6 f40351y;

    public w1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f40342a = paint;
        Paint paint2 = new Paint(1);
        this.f40343b = paint2;
        this.f40344c = new Path();
        this.e = new RectF();
        this.v = true;
        this.f40349w = new d6(this);
        this.f40350x = new d6(this);
        this.f40351y = new d6(this);
        this.H = new og.v1(1.0f, 0.016773745f, -1);
        this.J = true;
        this.d = new l2.h(context, new u1(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, AndroidUtilities.dp(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 637534208);
    }

    public final void a(float f7, float f10, float f11, Canvas canvas, boolean z10) {
        if (z10) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((f7 - f11) - AndroidUtilities.dp(6.0f), (f10 - f11) - AndroidUtilities.dp(6.0f), f7 + f11 + AndroidUtilities.dp(6.0f), f10 + f11 + AndroidUtilities.dp(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.f40347r * 255.0f), 31);
        }
        canvas.drawCircle(f7, f10, f11, this.f40343b);
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
        throw new UnsupportedOperationException("Method not decompiled: pg.w1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int height = (int) (getHeight() * 0.3f);
        this.e.set(0.0f, (getHeight() - height) / 2.0f, AndroidUtilities.dp(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = ((GestureDetector) this.d.f12721b).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        this.f40345f = false;
        invalidate();
        return onTouchEvent;
    }

    public void setBrushWeight(float f7) {
        this.H.f14536c = f7;
        invalidate();
    }

    public void setColorSwatch(og.v1 v1Var) {
        this.H = v1Var;
        invalidate();
    }

    public void setDrawCenter(boolean z10) {
        this.J = z10;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.I = runnable;
    }

    public void setRenderView(og.h1 h1Var) {
        this.E = h1Var;
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
