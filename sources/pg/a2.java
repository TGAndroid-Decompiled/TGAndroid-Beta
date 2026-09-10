package pg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.wr;
import zh.a7;
public final class a2 extends j {
    public tv0 f39934q0;
    public a7 f39935r0;
    public a7 f39936s0;
    public yg.g0 f39937t0;
    public yg.g0 f39938u0;
    public yg.p0 f39939v0;
    public d6 f39940w0;
    public d6 f39941x0;
    public boolean f39942y0;
    public float f39943z0;

    @Override
    public final i a() {
        z1 z1Var = new z1(this, getContext(), 0);
        z1Var.f40386r = new RectF();
        return z1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        tv0 tv0Var = this.f39934q0;
        int padding = getPadding();
        float d = this.f39941x0.d(1.0f, false);
        if (d == 1.0f) {
            this.f39936s0 = null;
        }
        canvas.save();
        float f7 = this.f39943z0;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        a7 a7Var = this.f39936s0;
        if (a7Var != null) {
            a7Var.e = (int) ((1.0f - d) * 255.0f);
            a7Var.setBounds(padding, padding, ((int) tv0Var.f27499a) - padding, ((int) tv0Var.f27500b) - padding);
            this.f39936s0.draw(canvas);
        }
        a7 a7Var2 = this.f39935r0;
        a7Var2.e = (int) (d * 255.0f);
        a7Var2.setBounds(padding, padding, ((int) tv0Var.f27499a) - padding, ((int) tv0Var.f27500b) - padding);
        this.f39935r0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.f39935r0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f39935r0.getBounds().centerX() - width), (int) (this.f39935r0.getBounds().centerY() - width), (int) (this.f39935r0.getBounds().centerX() + width), (int) (this.f39935r0.getBounds().centerY() + width));
        float d10 = this.f39940w0.d(1.0f, false);
        this.f39937t0.c(rect);
        this.f39938u0.c(rect);
        yg.g0 g0Var = this.f39937t0;
        if (this.f39935r0.f48274a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        g0Var.d(i10);
        if (d10 == 1.0f) {
            this.f39937t0.a(canvas);
        } else {
            canvas.save();
            float f10 = 1.0f - d10;
            canvas.scale(f10, f10, rect.centerX(), rect.top);
            yg.g0 g0Var2 = this.f39938u0;
            g0Var2.h = f10;
            g0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            yg.g0 g0Var3 = this.f39937t0;
            g0Var3.h = d10;
            g0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public yg.p0 getCurrentReaction() {
        return this.f39939v0;
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
        return (int) ((this.f39934q0.f27500b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override
    public rk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new rk0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    @Override
    public final void k() {
        tv0 tv0Var = this.f39934q0;
        setX(getPositionX() - (tv0Var.f27499a / 2.0f));
        setY(getPositionY() - (tv0Var.f27500b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39937t0.b(true);
        this.f39938u0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39937t0.b(false);
        this.f39938u0.b(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        tv0 tv0Var = this.f39934q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) tv0Var.f27499a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) tv0Var.f27500b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f39935r0.a();
        } else {
            this.f39936s0 = this.f39935r0;
            a7 a7Var = new a7(this);
            this.f39935r0 = a7Var;
            if (this.f39936s0.f48274a != 1) {
                a7Var.a();
            }
            this.f39935r0.b(this.f39942y0, false);
            this.f39935r0.c(getScaleX());
            this.f39941x0.d(0.0f, true);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f39942y0;
        this.f39942y0 = z11;
        if (!z10) {
            this.f39935r0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new gg.t1(24, this, zArr));
        ofFloat.addListener(new vv0(16, (Object) this, (Object) zArr));
        ofFloat.setInterpolator(wr.f28820g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(yg.p0 p0Var, boolean z10) {
        if (Objects.equals(this.f39939v0, p0Var)) {
            return;
        }
        if (!z10) {
            this.f39939v0 = p0Var;
            this.f39937t0.e(p0Var);
            invalidate();
            return;
        }
        this.f39939v0 = p0Var;
        this.f39938u0.e(p0Var);
        yg.g0 g0Var = this.f39937t0;
        this.f39937t0 = this.f39938u0;
        this.f39938u0 = g0Var;
        this.f39940w0.d(0.0f, true);
        invalidate();
    }

    @Override
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            super.setScaleX(f7);
            this.f39935r0.c(f7);
            invalidate();
        }
    }
}
