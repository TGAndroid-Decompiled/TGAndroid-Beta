package tg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import fi.l8;
import j$.util.Objects;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.yt0;
public final class s1 extends j {
    public float A0;
    public yt0 f58161r0;
    public l8 f58162s0;
    public l8 f58163t0;
    public ch.g0 f58164u0;
    public ch.g0 f58165v0;
    public ch.p0 f58166w0;
    public d6 f58167x0;
    public d6 f58168y0;
    public boolean f58169z0;

    @Override
    public final i a() {
        r1 r1Var = new r1(this, getContext(), 0);
        r1Var.f58156r = new RectF();
        return r1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        yt0 yt0Var = this.f58161r0;
        int padding = getPadding();
        float e10 = this.f58168y0.e(false, 1.0f);
        if (e10 == 1.0f) {
            this.f58163t0 = null;
        }
        canvas.save();
        float f10 = this.A0;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        l8 l8Var = this.f58163t0;
        if (l8Var != null) {
            l8Var.f12274e = (int) ((1.0f - e10) * 255.0f);
            l8Var.setBounds(padding, padding, ((int) yt0Var.f42545a) - padding, ((int) yt0Var.f42546b) - padding);
            this.f58163t0.draw(canvas);
        }
        l8 l8Var2 = this.f58162s0;
        l8Var2.f12274e = (int) (e10 * 255.0f);
        l8Var2.setBounds(padding, padding, ((int) yt0Var.f42545a) - padding, ((int) yt0Var.f42546b) - padding);
        this.f58162s0.draw(canvas);
        Rect rect = org.telegram.messenger.g0.Q;
        float width = (this.f58162s0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f58162s0.getBounds().centerX() - width), (int) (this.f58162s0.getBounds().centerY() - width), (int) (this.f58162s0.getBounds().centerX() + width), (int) (this.f58162s0.getBounds().centerY() + width));
        float e11 = this.f58167x0.e(false, 1.0f);
        this.f58164u0.c(rect);
        this.f58165v0.c(rect);
        ch.g0 g0Var = this.f58164u0;
        if (this.f58162s0.f12271a == 1) {
            i7 = -1;
        } else {
            i7 = -16777216;
        }
        g0Var.d(i7);
        if (e11 == 1.0f) {
            this.f58164u0.a(canvas);
        } else {
            canvas.save();
            float f11 = 1.0f - e11;
            canvas.scale(f11, f11, rect.centerX(), rect.top);
            ch.g0 g0Var2 = this.f58165v0;
            g0Var2.h = f11;
            g0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e11, e11, rect.centerX(), rect.bottom);
            ch.g0 g0Var3 = this.f58164u0;
            g0Var3.h = e11;
            g0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public ch.p0 getCurrentReaction() {
        return this.f58166w0;
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
        return (int) ((this.f58161r0.f42546b - org.telegram.messenger.g0.L(84.0f)) / 2.0f);
    }

    @Override
    public aj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new aj0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    @Override
    public final void k() {
        yt0 yt0Var = this.f58161r0;
        setX(getPositionX() - (yt0Var.f42545a / 2.0f));
        setY(getPositionY() - (yt0Var.f42546b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f58164u0.b(true);
        this.f58165v0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f58164u0.b(false);
        this.f58165v0.b(false);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        yt0 yt0Var = this.f58161r0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) yt0Var.f42545a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) yt0Var.f42546b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f58162s0.a();
        } else {
            this.f58163t0 = this.f58162s0;
            l8 l8Var = new l8(this);
            this.f58162s0 = l8Var;
            if (this.f58163t0.f12271a != 1) {
                l8Var.a();
            }
            this.f58162s0.b(this.f58169z0, false);
            this.f58162s0.c(getScaleX());
            this.f58168y0.e(true, 0.0f);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f58169z0;
        this.f58169z0 = z11;
        if (!z10) {
            this.f58162s0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ch.w(28, this, zArr));
        ofFloat.addListener(new h10(21, this, zArr));
        ofFloat.setInterpolator(nr.f37961g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(ch.p0 p0Var, boolean z10) {
        if (Objects.equals(this.f58166w0, p0Var)) {
            return;
        }
        if (!z10) {
            this.f58166w0 = p0Var;
            this.f58164u0.e(p0Var);
            invalidate();
            return;
        }
        this.f58166w0 = p0Var;
        this.f58165v0.e(p0Var);
        ch.g0 g0Var = this.f58164u0;
        this.f58164u0 = this.f58165v0;
        this.f58165v0 = g0Var;
        this.f58167x0.e(true, 0.0f);
        invalidate();
    }

    @Override
    public void setScaleX(float f10) {
        if (getScaleX() != f10) {
            super.setScaleX(f10);
            this.f58162s0.c(f10);
            invalidate();
        }
    }
}
