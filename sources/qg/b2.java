package qg;

import ai.pb;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.ul0;
public final class b2 extends j {
    public mw0 f46192q0;
    public pb f46193r0;
    public pb f46194s0;
    public zg.e0 f46195t0;
    public zg.e0 f46196u0;
    public zg.n0 f46197v0;
    public g6 f46198w0;
    public g6 f46199x0;
    public boolean f46200y0;
    public float f46201z0;

    @Override
    public final i a() {
        a2 a2Var = new a2(this, getContext(), 0);
        a2Var.f46180r = new RectF();
        return a2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        mw0 mw0Var = this.f46192q0;
        int padding = getPadding();
        float d = this.f46199x0.d(1.0f, false);
        if (d == 1.0f) {
            this.f46194s0 = null;
        }
        canvas.save();
        float f7 = this.f46201z0;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        pb pbVar = this.f46194s0;
        if (pbVar != null) {
            pbVar.f1594e = (int) ((1.0f - d) * 255.0f);
            pbVar.setBounds(padding, padding, ((int) mw0Var.f28963a) - padding, ((int) mw0Var.f28964b) - padding);
            this.f46194s0.draw(canvas);
        }
        pb pbVar2 = this.f46193r0;
        pbVar2.f1594e = (int) (d * 255.0f);
        pbVar2.setBounds(padding, padding, ((int) mw0Var.f28963a) - padding, ((int) mw0Var.f28964b) - padding);
        this.f46193r0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.f46193r0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f46193r0.getBounds().centerX() - width), (int) (this.f46193r0.getBounds().centerY() - width), (int) (this.f46193r0.getBounds().centerX() + width), (int) (this.f46193r0.getBounds().centerY() + width));
        float d10 = this.f46198w0.d(1.0f, false);
        this.f46195t0.c(rect);
        this.f46196u0.c(rect);
        zg.e0 e0Var = this.f46195t0;
        if (this.f46193r0.f1591a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        e0Var.d(i10);
        if (d10 == 1.0f) {
            this.f46195t0.a(canvas);
        } else {
            canvas.save();
            float f10 = 1.0f - d10;
            canvas.scale(f10, f10, rect.centerX(), rect.top);
            zg.e0 e0Var2 = this.f46196u0;
            e0Var2.h = f10;
            e0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            zg.e0 e0Var3 = this.f46195t0;
            e0Var3.h = d10;
            e0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public zg.n0 getCurrentReaction() {
        return this.f46197v0;
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
        return (int) ((this.f46192q0.f28964b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override
    public ml0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new ml0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    @Override
    public final void k() {
        mw0 mw0Var = this.f46192q0;
        setX(getPositionX() - (mw0Var.f28963a / 2.0f));
        setY(getPositionY() - (mw0Var.f28964b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46195t0.b(true);
        this.f46196u0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46195t0.b(false);
        this.f46196u0.b(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        mw0 mw0Var = this.f46192q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) mw0Var.f28963a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) mw0Var.f28964b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f46193r0.a();
        } else {
            this.f46194s0 = this.f46193r0;
            pb pbVar = new pb(this);
            this.f46193r0 = pbVar;
            if (this.f46194s0.f1591a != 1) {
                pbVar.a();
            }
            this.f46193r0.b(this.f46200y0, false);
            this.f46193r0.c(getScaleX());
            this.f46199x0.d(0.0f, true);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f46200y0;
        this.f46200y0 = z11;
        if (!z10) {
            this.f46193r0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ai.x(26, this, zArr));
        ofFloat.addListener(new ul0(18, this, zArr));
        ofFloat.setInterpolator(hs.f27119g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(zg.n0 n0Var, boolean z10) {
        if (Objects.equals(this.f46197v0, n0Var)) {
            return;
        }
        if (!z10) {
            this.f46197v0 = n0Var;
            this.f46195t0.e(n0Var);
            invalidate();
            return;
        }
        this.f46197v0 = n0Var;
        this.f46196u0.e(n0Var);
        zg.e0 e0Var = this.f46195t0;
        this.f46195t0 = this.f46196u0;
        this.f46196u0 = e0Var;
        this.f46198w0.d(0.0f, true);
        invalidate();
    }

    @Override
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            super.setScaleX(f7);
            this.f46193r0.c(f7);
            invalidate();
        }
    }
}
