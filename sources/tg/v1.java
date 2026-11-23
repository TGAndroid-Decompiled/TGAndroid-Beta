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
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.xt0;
public final class v1 extends n {
    public boolean A0;
    public float B0;
    public xt0 f58268s0;
    public l8 f58269t0;
    public l8 f58270u0;
    public ch.g0 f58271v0;
    public ch.g0 f58272w0;
    public ch.p0 f58273x0;
    public c6 f58274y0;
    public c6 f58275z0;

    @Override
    public final m a() {
        u1 u1Var = new u1(this, getContext(), 0);
        u1Var.f58263r = new RectF();
        return u1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        xt0 xt0Var = this.f58268s0;
        int padding = getPadding();
        float e10 = this.f58275z0.e(false, 1.0f);
        if (e10 == 1.0f) {
            this.f58270u0 = null;
        }
        canvas.save();
        float f10 = this.B0;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        l8 l8Var = this.f58270u0;
        if (l8Var != null) {
            l8Var.f12236e = (int) ((1.0f - e10) * 255.0f);
            l8Var.setBounds(padding, padding, ((int) xt0Var.f42189a) - padding, ((int) xt0Var.f42190b) - padding);
            this.f58270u0.draw(canvas);
        }
        l8 l8Var2 = this.f58269t0;
        l8Var2.f12236e = (int) (e10 * 255.0f);
        l8Var2.setBounds(padding, padding, ((int) xt0Var.f42189a) - padding, ((int) xt0Var.f42190b) - padding);
        this.f58269t0.draw(canvas);
        Rect rect = org.telegram.messenger.g0.Q;
        float width = (this.f58269t0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f58269t0.getBounds().centerX() - width), (int) (this.f58269t0.getBounds().centerY() - width), (int) (this.f58269t0.getBounds().centerX() + width), (int) (this.f58269t0.getBounds().centerY() + width));
        float e11 = this.f58274y0.e(false, 1.0f);
        this.f58271v0.c(rect);
        this.f58272w0.c(rect);
        ch.g0 g0Var = this.f58271v0;
        if (this.f58269t0.f12233a == 1) {
            i7 = -1;
        } else {
            i7 = -16777216;
        }
        g0Var.d(i7);
        if (e11 == 1.0f) {
            this.f58271v0.a(canvas);
        } else {
            canvas.save();
            float f11 = 1.0f - e11;
            canvas.scale(f11, f11, rect.centerX(), rect.top);
            ch.g0 g0Var2 = this.f58272w0;
            g0Var2.h = f11;
            g0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e11, e11, rect.centerX(), rect.bottom);
            ch.g0 g0Var3 = this.f58271v0;
            g0Var3.h = e11;
            g0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public ch.p0 getCurrentReaction() {
        return this.f58273x0;
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
        return (int) ((this.f58268s0.f42190b - org.telegram.messenger.g0.L(84.0f)) / 2.0f);
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
        xt0 xt0Var = this.f58268s0;
        setX(getPositionX() - (xt0Var.f42189a / 2.0f));
        setY(getPositionY() - (xt0Var.f42190b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f58271v0.b(true);
        this.f58272w0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f58271v0.b(false);
        this.f58272w0.b(false);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        xt0 xt0Var = this.f58268s0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) xt0Var.f42189a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) xt0Var.f42190b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f58269t0.a();
        } else {
            this.f58270u0 = this.f58269t0;
            l8 l8Var = new l8(this);
            this.f58269t0 = l8Var;
            if (this.f58270u0.f12233a != 1) {
                l8Var.a();
            }
            this.f58269t0.b(this.A0, false);
            this.f58269t0.c(getScaleX());
            this.f58275z0.e(true, 0.0f);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.A0;
        this.A0 = z11;
        if (!z10) {
            this.f58269t0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ch.w(28, this, zArr));
        ofFloat.addListener(new f10(21, this, zArr));
        ofFloat.setInterpolator(kr.f36859g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(ch.p0 p0Var, boolean z10) {
        if (Objects.equals(this.f58273x0, p0Var)) {
            return;
        }
        if (!z10) {
            this.f58273x0 = p0Var;
            this.f58271v0.e(p0Var);
            invalidate();
            return;
        }
        this.f58273x0 = p0Var;
        this.f58272w0.e(p0Var);
        ch.g0 g0Var = this.f58271v0;
        this.f58271v0 = this.f58272w0;
        this.f58272w0 = g0Var;
        this.f58274y0.e(true, 0.0f);
        invalidate();
    }

    @Override
    public void setScaleX(float f10) {
        if (getScaleX() != f10) {
            super.setScaleX(f10);
            this.f58269t0.c(f10);
            invalidate();
        }
    }
}
