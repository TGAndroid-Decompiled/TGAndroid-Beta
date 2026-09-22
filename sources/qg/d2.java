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
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qr;
public final class d2 extends j {
    public jv0 f41327q0;
    public ob f41328r0;
    public ob f41329s0;
    public zg.g0 f41330t0;
    public zg.g0 f41331u0;
    public zg.p0 f41332v0;
    public c6 f41333w0;
    public c6 f41334x0;
    public boolean f41335y0;
    public float f41336z0;

    @Override
    public final i a() {
        c2 c2Var = new c2(this, getContext(), 0);
        c2Var.f41319r = new RectF();
        return c2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        jv0 jv0Var = this.f41327q0;
        int padding = getPadding();
        float d = this.f41334x0.d(1.0f, false);
        if (d == 1.0f) {
            this.f41329s0 = null;
        }
        canvas.save();
        float f7 = this.f41336z0;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        ob obVar = this.f41329s0;
        if (obVar != null) {
            obVar.e = (int) ((1.0f - d) * 255.0f);
            obVar.setBounds(padding, padding, ((int) jv0Var.f25440a) - padding, ((int) jv0Var.f25441b) - padding);
            this.f41329s0.draw(canvas);
        }
        ob obVar2 = this.f41328r0;
        obVar2.e = (int) (d * 255.0f);
        obVar2.setBounds(padding, padding, ((int) jv0Var.f25440a) - padding, ((int) jv0Var.f25441b) - padding);
        this.f41328r0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.f41328r0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f41328r0.getBounds().centerX() - width), (int) (this.f41328r0.getBounds().centerY() - width), (int) (this.f41328r0.getBounds().centerX() + width), (int) (this.f41328r0.getBounds().centerY() + width));
        float d10 = this.f41333w0.d(1.0f, false);
        this.f41330t0.c(rect);
        this.f41331u0.c(rect);
        zg.g0 g0Var = this.f41330t0;
        if (this.f41328r0.f1366a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        g0Var.d(i10);
        if (d10 == 1.0f) {
            this.f41330t0.a(canvas);
        } else {
            canvas.save();
            float f10 = 1.0f - d10;
            canvas.scale(f10, f10, rect.centerX(), rect.top);
            zg.g0 g0Var2 = this.f41331u0;
            g0Var2.h = f10;
            g0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            zg.g0 g0Var3 = this.f41330t0;
            g0Var3.h = d10;
            g0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public zg.p0 getCurrentReaction() {
        return this.f41332v0;
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
        return (int) ((this.f41327q0.f25441b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override
    public hk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new hk0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    @Override
    public final void k() {
        jv0 jv0Var = this.f41327q0;
        setX(getPositionX() - (jv0Var.f25440a / 2.0f));
        setY(getPositionY() - (jv0Var.f25441b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41330t0.b(true);
        this.f41331u0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41330t0.b(false);
        this.f41331u0.b(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        jv0 jv0Var = this.f41327q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) jv0Var.f25440a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) jv0Var.f25441b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f41328r0.a();
        } else {
            this.f41329s0 = this.f41328r0;
            ob obVar = new ob(this);
            this.f41328r0 = obVar;
            if (this.f41329s0.f1366a != 1) {
                obVar.a();
            }
            this.f41328r0.b(this.f41335y0, false);
            this.f41328r0.c(getScaleX());
            this.f41334x0.d(0.0f, true);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f41335y0;
        this.f41335y0 = z11;
        if (!z10) {
            this.f41328r0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ai.x(26, this, zArr));
        ofFloat.addListener(new pk0(18, this, zArr));
        ofFloat.setInterpolator(qr.f27421g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(zg.p0 p0Var, boolean z10) {
        if (Objects.equals(this.f41332v0, p0Var)) {
            return;
        }
        if (!z10) {
            this.f41332v0 = p0Var;
            this.f41330t0.e(p0Var);
            invalidate();
            return;
        }
        this.f41332v0 = p0Var;
        this.f41331u0.e(p0Var);
        zg.g0 g0Var = this.f41330t0;
        this.f41330t0 = this.f41331u0;
        this.f41331u0 = g0Var;
        this.f41333w0.d(0.0f, true);
        invalidate();
    }

    @Override
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            super.setScaleX(f7);
            this.f41328r0.c(f7);
            invalidate();
        }
    }
}
