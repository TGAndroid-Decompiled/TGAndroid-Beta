package tg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import fi.o8;
import j$.util.Objects;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.y50;
public final class q1 extends j {
    public float A0;
    public nt0 f57524r0;
    public o8 f57525s0;
    public o8 f57526t0;
    public ch.g0 f57527u0;
    public ch.g0 f57528v0;
    public ch.p0 f57529w0;
    public u5 f57530x0;
    public u5 f57531y0;
    public boolean f57532z0;

    @Override
    public final i a() {
        p1 p1Var = new p1(this, getContext(), 0);
        p1Var.f57514r = new RectF();
        return p1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        nt0 nt0Var = this.f57524r0;
        int padding = getPadding();
        float e10 = this.f57531y0.e(false, 1.0f);
        if (e10 == 1.0f) {
            this.f57526t0 = null;
        }
        canvas.save();
        float f10 = this.A0;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        o8 o8Var = this.f57526t0;
        if (o8Var != null) {
            o8Var.f12131e = (int) ((1.0f - e10) * 255.0f);
            o8Var.setBounds(padding, padding, ((int) nt0Var.f37713a) - padding, ((int) nt0Var.f37714b) - padding);
            this.f57526t0.draw(canvas);
        }
        o8 o8Var2 = this.f57525s0;
        o8Var2.f12131e = (int) (e10 * 255.0f);
        o8Var2.setBounds(padding, padding, ((int) nt0Var.f37713a) - padding, ((int) nt0Var.f37714b) - padding);
        this.f57525s0.draw(canvas);
        Rect rect = org.telegram.messenger.g0.Q;
        float width = (this.f57525s0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f57525s0.getBounds().centerX() - width), (int) (this.f57525s0.getBounds().centerY() - width), (int) (this.f57525s0.getBounds().centerX() + width), (int) (this.f57525s0.getBounds().centerY() + width));
        float e11 = this.f57530x0.e(false, 1.0f);
        this.f57527u0.c(rect);
        this.f57528v0.c(rect);
        ch.g0 g0Var = this.f57527u0;
        if (this.f57525s0.f12128a == 1) {
            i7 = -1;
        } else {
            i7 = -16777216;
        }
        g0Var.d(i7);
        if (e11 == 1.0f) {
            this.f57527u0.a(canvas);
        } else {
            canvas.save();
            float f11 = 1.0f - e11;
            canvas.scale(f11, f11, rect.centerX(), rect.top);
            ch.g0 g0Var2 = this.f57528v0;
            g0Var2.h = f11;
            g0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e11, e11, rect.centerX(), rect.bottom);
            ch.g0 g0Var3 = this.f57527u0;
            g0Var3.h = e11;
            g0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public ch.p0 getCurrentReaction() {
        return this.f57529w0;
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
        return (int) ((this.f57524r0.f37714b - org.telegram.messenger.g0.L(84.0f)) / 2.0f);
    }

    @Override
    public pi0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new pi0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    @Override
    public final void k() {
        nt0 nt0Var = this.f57524r0;
        setX(getPositionX() - (nt0Var.f37713a / 2.0f));
        setY(getPositionY() - (nt0Var.f37714b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f57527u0.b(true);
        this.f57528v0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f57527u0.b(false);
        this.f57528v0.b(false);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        nt0 nt0Var = this.f57524r0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) nt0Var.f37713a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) nt0Var.f37714b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f57525s0.a();
        } else {
            this.f57526t0 = this.f57525s0;
            o8 o8Var = new o8(this);
            this.f57525s0 = o8Var;
            if (this.f57526t0.f12128a != 1) {
                o8Var.a();
            }
            this.f57525s0.b(this.f57532z0, false);
            this.f57525s0.c(getScaleX());
            this.f57531y0.e(true, 0.0f);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f57532z0;
        this.f57532z0 = z11;
        if (!z10) {
            this.f57525s0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ch.v(28, this, zArr));
        ofFloat.addListener(new y50(20, this, zArr));
        ofFloat.setInterpolator(er.f34421g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(ch.p0 p0Var, boolean z10) {
        if (Objects.equals(this.f57529w0, p0Var)) {
            return;
        }
        if (!z10) {
            this.f57529w0 = p0Var;
            this.f57527u0.e(p0Var);
            invalidate();
            return;
        }
        this.f57529w0 = p0Var;
        this.f57528v0.e(p0Var);
        ch.g0 g0Var = this.f57527u0;
        this.f57527u0 = this.f57528v0;
        this.f57528v0 = g0Var;
        this.f57530x0.e(true, 0.0f);
        invalidate();
    }

    @Override
    public void setScaleX(float f10) {
        if (getScaleX() != f10) {
            super.setScaleX(f10);
            this.f57525s0.c(f10);
            invalidate();
        }
    }
}
