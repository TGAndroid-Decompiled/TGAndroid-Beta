package tg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import fi.l8;
import j$.util.Objects;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.Components.yi0;
public final class q1 extends j {
    public float A0;
    public vt0 f58093r0;
    public l8 f58094s0;
    public l8 f58095t0;
    public ch.g0 f58096u0;
    public ch.g0 f58097v0;
    public ch.p0 f58098w0;
    public c6 f58099x0;
    public c6 f58100y0;
    public boolean f58101z0;

    @Override
    public final i a() {
        p1 p1Var = new p1(this, getContext(), 0);
        p1Var.f58091r = new RectF();
        return p1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        vt0 vt0Var = this.f58093r0;
        int padding = getPadding();
        float e10 = this.f58100y0.e(false, 1.0f);
        if (e10 == 1.0f) {
            this.f58095t0 = null;
        }
        canvas.save();
        float f10 = this.A0;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        l8 l8Var = this.f58095t0;
        if (l8Var != null) {
            l8Var.f12231e = (int) ((1.0f - e10) * 255.0f);
            l8Var.setBounds(padding, padding, ((int) vt0Var.f41433a) - padding, ((int) vt0Var.f41434b) - padding);
            this.f58095t0.draw(canvas);
        }
        l8 l8Var2 = this.f58094s0;
        l8Var2.f12231e = (int) (e10 * 255.0f);
        l8Var2.setBounds(padding, padding, ((int) vt0Var.f41433a) - padding, ((int) vt0Var.f41434b) - padding);
        this.f58094s0.draw(canvas);
        Rect rect = org.telegram.messenger.g0.Q;
        float width = (this.f58094s0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f58094s0.getBounds().centerX() - width), (int) (this.f58094s0.getBounds().centerY() - width), (int) (this.f58094s0.getBounds().centerX() + width), (int) (this.f58094s0.getBounds().centerY() + width));
        float e11 = this.f58099x0.e(false, 1.0f);
        this.f58096u0.c(rect);
        this.f58097v0.c(rect);
        ch.g0 g0Var = this.f58096u0;
        if (this.f58094s0.f12228a == 1) {
            i7 = -1;
        } else {
            i7 = -16777216;
        }
        g0Var.d(i7);
        if (e11 == 1.0f) {
            this.f58096u0.a(canvas);
        } else {
            canvas.save();
            float f11 = 1.0f - e11;
            canvas.scale(f11, f11, rect.centerX(), rect.top);
            ch.g0 g0Var2 = this.f58097v0;
            g0Var2.h = f11;
            g0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e11, e11, rect.centerX(), rect.bottom);
            ch.g0 g0Var3 = this.f58096u0;
            g0Var3.h = e11;
            g0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public ch.p0 getCurrentReaction() {
        return this.f58098w0;
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
        return (int) ((this.f58093r0.f41434b - org.telegram.messenger.g0.L(84.0f)) / 2.0f);
    }

    @Override
    public yi0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new yi0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    @Override
    public final void k() {
        vt0 vt0Var = this.f58093r0;
        setX(getPositionX() - (vt0Var.f41433a / 2.0f));
        setY(getPositionY() - (vt0Var.f41434b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f58096u0.b(true);
        this.f58097v0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f58096u0.b(false);
        this.f58097v0.b(false);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        vt0 vt0Var = this.f58093r0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) vt0Var.f41433a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) vt0Var.f41434b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f58094s0.a();
        } else {
            this.f58095t0 = this.f58094s0;
            l8 l8Var = new l8(this);
            this.f58094s0 = l8Var;
            if (this.f58095t0.f12228a != 1) {
                l8Var.a();
            }
            this.f58094s0.b(this.f58101z0, false);
            this.f58094s0.c(getScaleX());
            this.f58100y0.e(true, 0.0f);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f58101z0;
        this.f58101z0 = z11;
        if (!z10) {
            this.f58094s0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ch.w(28, this, zArr));
        ofFloat.addListener(new h60(20, this, zArr));
        ofFloat.setInterpolator(lr.f37209g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(ch.p0 p0Var, boolean z10) {
        if (Objects.equals(this.f58098w0, p0Var)) {
            return;
        }
        if (!z10) {
            this.f58098w0 = p0Var;
            this.f58096u0.e(p0Var);
            invalidate();
            return;
        }
        this.f58098w0 = p0Var;
        this.f58097v0.e(p0Var);
        ch.g0 g0Var = this.f58096u0;
        this.f58096u0 = this.f58097v0;
        this.f58097v0 = g0Var;
        this.f58099x0.e(true, 0.0f);
        invalidate();
    }

    @Override
    public void setScaleX(float f10) {
        if (getScaleX() != f10) {
            super.setScaleX(f10);
            this.f58094s0.c(f10);
            invalidate();
        }
    }
}
