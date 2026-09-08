package rg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import bi.va;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.pr;
public final class c2 extends k {
    public iv0 f45172q0;
    public va f45173r0;
    public va f45174s0;
    public ah.z0 f45175t0;
    public ah.z0 f45176u0;
    public ah.j1 f45177v0;
    public e6 f45178w0;
    public e6 f45179x0;
    public boolean f45180y0;
    public float f45181z0;

    @Override
    public final j a() {
        b2 b2Var = new b2(this, getContext(), 0);
        b2Var.f45166r = new RectF();
        return b2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        iv0 iv0Var = this.f45172q0;
        int padding = getPadding();
        float d = this.f45179x0.d(1.0f, false);
        if (d == 1.0f) {
            this.f45174s0 = null;
        }
        canvas.save();
        float f7 = this.f45181z0;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        va vaVar = this.f45174s0;
        if (vaVar != null) {
            vaVar.f3941e = (int) ((1.0f - d) * 255.0f);
            vaVar.setBounds(padding, padding, ((int) iv0Var.f27298a) - padding, ((int) iv0Var.f27299b) - padding);
            this.f45174s0.draw(canvas);
        }
        va vaVar2 = this.f45173r0;
        vaVar2.f3941e = (int) (d * 255.0f);
        vaVar2.setBounds(padding, padding, ((int) iv0Var.f27298a) - padding, ((int) iv0Var.f27299b) - padding);
        this.f45173r0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.f45173r0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f45173r0.getBounds().centerX() - width), (int) (this.f45173r0.getBounds().centerY() - width), (int) (this.f45173r0.getBounds().centerX() + width), (int) (this.f45173r0.getBounds().centerY() + width));
        float d10 = this.f45178w0.d(1.0f, false);
        this.f45175t0.c(rect);
        this.f45176u0.c(rect);
        ah.z0 z0Var = this.f45175t0;
        if (this.f45173r0.f3938a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        z0Var.d(i10);
        if (d10 == 1.0f) {
            this.f45175t0.a(canvas);
        } else {
            canvas.save();
            float f10 = 1.0f - d10;
            canvas.scale(f10, f10, rect.centerX(), rect.top);
            ah.z0 z0Var2 = this.f45176u0;
            z0Var2.h = f10;
            z0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            ah.z0 z0Var3 = this.f45175t0;
            z0Var3.h = d10;
            z0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public ah.j1 getCurrentReaction() {
        return this.f45177v0;
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
        return (int) ((this.f45172q0.f27299b - AndroidUtilities.dp(84.0f)) / 2.0f);
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
        iv0 iv0Var = this.f45172q0;
        setX(getPositionX() - (iv0Var.f27298a / 2.0f));
        setY(getPositionY() - (iv0Var.f27299b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45175t0.b(true);
        this.f45176u0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45175t0.b(false);
        this.f45176u0.b(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        iv0 iv0Var = this.f45172q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) iv0Var.f27298a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) iv0Var.f27299b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f45173r0.a();
        } else {
            this.f45174s0 = this.f45173r0;
            va vaVar = new va(this);
            this.f45173r0 = vaVar;
            if (this.f45174s0.f3938a != 1) {
                vaVar.a();
            }
            this.f45173r0.b(this.f45180y0, false);
            this.f45173r0.c(getScaleX());
            this.f45179x0.d(0.0f, true);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f45180y0;
        this.f45180y0 = z11;
        if (!z10) {
            this.f45173r0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ah.m0(27, this, zArr));
        ofFloat.addListener(new pk0(19, this, zArr));
        ofFloat.setInterpolator(pr.f29494g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(ah.j1 j1Var, boolean z10) {
        if (Objects.equals(this.f45177v0, j1Var)) {
            return;
        }
        if (!z10) {
            this.f45177v0 = j1Var;
            this.f45175t0.e(j1Var);
            invalidate();
            return;
        }
        this.f45177v0 = j1Var;
        this.f45176u0.e(j1Var);
        ah.z0 z0Var = this.f45175t0;
        this.f45175t0 = this.f45176u0;
        this.f45176u0 = z0Var;
        this.f45178w0.d(0.0f, true);
        invalidate();
    }

    @Override
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            super.setScaleX(f7);
            this.f45173r0.c(f7);
            invalidate();
        }
    }
}
