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
import org.telegram.ui.Components.d6;
public final class x1 extends View {
    public qg.e1 E;
    public float F;
    public float G;
    public qg.s1 H;
    public Runnable I;
    public boolean J;
    public w1 K;
    public final Paint f46125a;
    public final Paint f46126b;
    public final Path f46127c;
    public final le.b d;
    public final RectF e;
    public boolean f46128f;
    public boolean h;
    public float f46129n;
    public float f46130r;
    public long f46131s;
    public boolean v;
    public final d6 f46132w;
    public final d6 f46133x;
    public final d6 f46134y;

    public x1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f46125a = paint;
        Paint paint2 = new Paint(1);
        this.f46126b = paint2;
        this.f46127c = new Path();
        this.e = new RectF();
        this.v = true;
        this.f46132w = new d6(this);
        this.f46133x = new d6(this);
        this.f46134y = new d6(this);
        this.H = new qg.s1(1.0f, 0.016773745f, -1);
        this.J = true;
        this.d = new le.b(context, new v1(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, AndroidUtilities.dp(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 637534208);
    }

    public final void a(float f7, float f10, float f11, Canvas canvas, boolean z10) {
        if (z10) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((f7 - f11) - AndroidUtilities.dp(6.0f), (f10 - f11) - AndroidUtilities.dp(6.0f), f7 + f11 + AndroidUtilities.dp(6.0f), f10 + f11 + AndroidUtilities.dp(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.f46130r * 255.0f), 31);
        }
        canvas.drawCircle(f7, f10, f11, this.f46126b);
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
        throw new UnsupportedOperationException("Method not decompiled: rg.x1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int height = (int) (getHeight() * 0.3f);
        this.e.set(0.0f, (getHeight() - height) / 2.0f, AndroidUtilities.dp(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = ((GestureDetector) this.d.f16072b).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        this.f46128f = false;
        invalidate();
        return onTouchEvent;
    }

    public void setBrushWeight(float f7) {
        this.H.f45067c = f7;
        invalidate();
    }

    public void setColorSwatch(qg.s1 s1Var) {
        this.H = s1Var;
        invalidate();
    }

    public void setDrawCenter(boolean z10) {
        this.J = z10;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.I = runnable;
    }

    public void setRenderView(qg.e1 e1Var) {
        this.E = e1Var;
    }

    public void setShowPreview(boolean z10) {
        this.v = z10;
        invalidate();
    }

    public void setValueOverride(w1 w1Var) {
        this.K = w1Var;
        invalidate();
    }

    public void setViewHidden(boolean z10) {
        this.h = z10;
        invalidate();
    }
}
