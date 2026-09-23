package qg;

import ai.ob;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.rr;
public final class d2 extends j {
    public jv0 f41283q0;
    public ob f41284r0;
    public ob f41285s0;
    public zg.g0 f41286t0;
    public zg.g0 f41287u0;
    public zg.p0 f41288v0;
    public e6 f41289w0;
    public e6 f41290x0;
    public boolean f41291y0;
    public float f41292z0;

    @Override
    public final i a() {
        c2 c2Var = new c2(this, getContext(), 0);
        c2Var.f41275r = new RectF();
        return c2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        jv0 jv0Var = this.f41283q0;
        int padding = getPadding();
        float d = this.f41290x0.d(1.0f, false);
        if (d == 1.0f) {
            this.f41285s0 = null;
        }
        canvas.save();
        float f7 = this.f41292z0;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        ob obVar = this.f41285s0;
        if (obVar != null) {
            obVar.e = (int) ((1.0f - d) * 255.0f);
            obVar.setBounds(padding, padding, ((int) jv0Var.f25428a) - padding, ((int) jv0Var.f25429b) - padding);
            this.f41285s0.draw(canvas);
        }
        ob obVar2 = this.f41284r0;
        obVar2.e = (int) (d * 255.0f);
        obVar2.setBounds(padding, padding, ((int) jv0Var.f25428a) - padding, ((int) jv0Var.f25429b) - padding);
        this.f41284r0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.f41284r0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f41284r0.getBounds().centerX() - width), (int) (this.f41284r0.getBounds().centerY() - width), (int) (this.f41284r0.getBounds().centerX() + width), (int) (this.f41284r0.getBounds().centerY() + width));
        float d10 = this.f41289w0.d(1.0f, false);
        this.f41286t0.c(rect);
        this.f41287u0.c(rect);
        zg.g0 g0Var = this.f41286t0;
        if (this.f41284r0.f1367a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        g0Var.d(i10);
        if (d10 == 1.0f) {
            this.f41286t0.a(canvas);
        } else {
            canvas.save();
            float f10 = 1.0f - d10;
            canvas.scale(f10, f10, rect.centerX(), rect.top);
            zg.g0 g0Var2 = this.f41287u0;
            g0Var2.h = f10;
            g0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            zg.g0 g0Var3 = this.f41286t0;
            g0Var3.h = d10;
            g0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public zg.p0 getCurrentReaction() {
        return this.f41288v0;
    }

    @Override
    public float getMaxScale() {
        return 1.8f;
    }

    @Override
    public float getMinScale() {
        return 0.5f;
    }

    public int getPadding() {
        return (int) ((this.f41283q0.f25429b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override
    public ik0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new ik0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    @Override
    public final void k() {
        jv0 jv0Var = this.f41283q0;
        setX(getPositionX() - (jv0Var.f25428a / 2.0f));
        setY(getPositionY() - (jv0Var.f25429b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41286t0.b(true);
        this.f41287u0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41286t0.b(false);
        this.f41287u0.b(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        jv0 jv0Var = this.f41283q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) jv0Var.f25428a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) jv0Var.f25429b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f41284r0.a();
        } else {
            this.f41285s0 = this.f41284r0;
            ob obVar = new ob(this);
            this.f41284r0 = obVar;
            if (this.f41285s0.f1367a != 1) {
                obVar.a();
            }
            this.f41284r0.b(this.f41291y0, false);
            this.f41284r0.c(getScaleX());
            this.f41290x0.d(0.0f, true);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f41291y0;
        this.f41291y0 = z11;
        if (!z10) {
            this.f41284r0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ai.x(26, this, zArr));
        ofFloat.addListener(new qk0(18, this, zArr));
        ofFloat.setInterpolator(rr.f27702g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(zg.p0 p0Var, boolean z10) {
        if (Objects.equals(this.f41288v0, p0Var)) {
            return;
        }
        if (!z10) {
            this.f41288v0 = p0Var;
            this.f41286t0.e(p0Var);
            invalidate();
            return;
        }
        this.f41288v0 = p0Var;
        this.f41287u0.e(p0Var);
        zg.g0 g0Var = this.f41286t0;
        this.f41286t0 = this.f41287u0;
        this.f41287u0 = g0Var;
        this.f41289w0.d(0.0f, true);
        invalidate();
    }

    @Override
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            super.setScaleX(f7);
            this.f41284r0.c(f7);
            invalidate();
        }
    }
}
