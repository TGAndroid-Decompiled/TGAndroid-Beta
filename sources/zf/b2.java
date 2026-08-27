package zf;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import jh.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yj0;

public final class b2 extends j {
    public tu0 m0;

    public o8 f50348n0;

    public o8 f50349o0;

    public ig.h0 f50350p0;

    public ig.h0 f50351q0;

    public ig.q0 f50352r0;

    public y5 f50353s0;

    public y5 f50354t0;

    public boolean f50355u0;

    public float f50356v0;

    @Override
    public final i a() {
        a2 a2Var = new a2(this, getContext(), 0);
        a2Var.f50337r = new RectF();
        return a2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        tu0 tu0Var = this.m0;
        int padding = getPadding();
        float fD = this.f50354t0.d(1.0f, false);
        if (fD == 1.0f) {
            this.f50349o0 = null;
        }
        canvas.save();
        float f10 = this.f50356v0;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        o8 o8Var = this.f50349o0;
        if (o8Var != null) {
            o8Var.f13759e = (int) ((1.0f - fD) * 255.0f);
            o8Var.setBounds(padding, padding, ((int) tu0Var.f32893a) - padding, ((int) tu0Var.f32894b) - padding);
            this.f50349o0.draw(canvas);
        }
        o8 o8Var2 = this.f50348n0;
        o8Var2.f13759e = (int) (fD * 255.0f);
        o8Var2.setBounds(padding, padding, ((int) tu0Var.f32893a) - padding, ((int) tu0Var.f32894b) - padding);
        this.f50348n0.draw(canvas);
        float fWidth = this.f50348n0.getBounds().width() * 0.61f;
        Rect rect = AndroidUtilities.rectTmp2;
        float f11 = fWidth / 2.0f;
        rect.set((int) (this.f50348n0.getBounds().centerX() - f11), (int) (this.f50348n0.getBounds().centerY() - f11), (int) (this.f50348n0.getBounds().centerX() + f11), (int) (this.f50348n0.getBounds().centerY() + f11));
        float fD2 = this.f50353s0.d(1.0f, false);
        this.f50350p0.c(rect);
        this.f50351q0.c(rect);
        this.f50350p0.d(this.f50348n0.f13756a == 1 ? -1 : -16777216);
        if (fD2 == 1.0f) {
            this.f50350p0.a(canvas);
        } else {
            canvas.save();
            float f12 = 1.0f - fD2;
            canvas.scale(f12, f12, rect.centerX(), rect.top);
            ig.h0 h0Var = this.f50351q0;
            h0Var.h = f12;
            h0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(fD2, fD2, rect.centerX(), rect.bottom);
            ig.h0 h0Var2 = this.f50350p0;
            h0Var2.h = fD2;
            h0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public ig.q0 getCurrentReaction() {
        return this.f50352r0;
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
        return (int) ((this.m0.f32894b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override
    public yj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new yj0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new yj0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    @Override
    public final void k() {
        tu0 tu0Var = this.m0;
        float f10 = tu0Var.f32893a / 2.0f;
        float f11 = tu0Var.f32894b / 2.0f;
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50350p0.b(true);
        this.f50351q0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50350p0.b(false);
        this.f50351q0.b(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        tu0 tu0Var = this.m0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) tu0Var.f32893a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) tu0Var.f32894b, 1073741824));
    }

    public final void q(boolean z10) {
        if (z10) {
            this.f50349o0 = this.f50348n0;
            o8 o8Var = new o8(this);
            this.f50348n0 = o8Var;
            if (this.f50349o0.f13756a != 1) {
                o8Var.a();
            }
            this.f50348n0.b(this.f50355u0, false);
            this.f50348n0.c(getScaleX());
            this.f50354t0.d(0.0f, true);
        } else {
            this.f50348n0.a();
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f50355u0;
        this.f50355u0 = z11;
        if (!z10) {
            this.f50348n0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new z1(0, this, zArr));
        valueAnimatorOfFloat.addListener(new fk0(23, this, zArr));
        valueAnimatorOfFloat.setInterpolator(er.f28123g);
        valueAnimatorOfFloat.setDuration(350L);
        valueAnimatorOfFloat.start();
    }

    public final void s(ig.q0 q0Var, boolean z10) {
        if (Objects.equals(this.f50352r0, q0Var)) {
            return;
        }
        if (!z10) {
            this.f50352r0 = q0Var;
            this.f50350p0.e(q0Var);
            invalidate();
            return;
        }
        this.f50352r0 = q0Var;
        this.f50351q0.e(q0Var);
        ig.h0 h0Var = this.f50350p0;
        this.f50350p0 = this.f50351q0;
        this.f50351q0 = h0Var;
        this.f50353s0.d(0.0f, true);
        invalidate();
    }

    @Override
    public void setScaleX(float f10) {
        if (getScaleX() != f10) {
            super.setScaleX(f10);
            this.f50348n0.c(f10);
            invalidate();
        }
    }
}
