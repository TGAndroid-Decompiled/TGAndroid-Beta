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
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.uk0;
public final class a2 extends j {
    public gw0 f44970q0;
    public ob f44971r0;
    public ob f44972s0;
    public zg.d0 f44973t0;
    public zg.d0 f44974u0;
    public zg.m0 f44975v0;
    public e6 f44976w0;
    public e6 f44977x0;
    public boolean f44978y0;
    public float f44979z0;

    @Override
    public final i a() {
        z1 z1Var = new z1(this, getContext(), 0);
        z1Var.f45449r = new RectF();
        return z1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        gw0 gw0Var = this.f44970q0;
        int padding = getPadding();
        float d = this.f44977x0.d(1.0f, false);
        if (d == 1.0f) {
            this.f44972s0 = null;
        }
        canvas.save();
        float f7 = this.f44979z0;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        ob obVar = this.f44972s0;
        if (obVar != null) {
            obVar.f1483e = (int) ((1.0f - d) * 255.0f);
            obVar.setBounds(padding, padding, ((int) gw0Var.f27002a) - padding, ((int) gw0Var.f27003b) - padding);
            this.f44972s0.draw(canvas);
        }
        ob obVar2 = this.f44971r0;
        obVar2.f1483e = (int) (d * 255.0f);
        obVar2.setBounds(padding, padding, ((int) gw0Var.f27002a) - padding, ((int) gw0Var.f27003b) - padding);
        this.f44971r0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.f44971r0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f44971r0.getBounds().centerX() - width), (int) (this.f44971r0.getBounds().centerY() - width), (int) (this.f44971r0.getBounds().centerX() + width), (int) (this.f44971r0.getBounds().centerY() + width));
        float d10 = this.f44976w0.d(1.0f, false);
        this.f44973t0.c(rect);
        this.f44974u0.c(rect);
        zg.d0 d0Var = this.f44973t0;
        if (this.f44971r0.f1480a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        d0Var.d(i10);
        if (d10 == 1.0f) {
            this.f44973t0.a(canvas);
        } else {
            canvas.save();
            float f10 = 1.0f - d10;
            canvas.scale(f10, f10, rect.centerX(), rect.top);
            zg.d0 d0Var2 = this.f44974u0;
            d0Var2.h = f10;
            d0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            zg.d0 d0Var3 = this.f44973t0;
            d0Var3.h = d10;
            d0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public zg.m0 getCurrentReaction() {
        return this.f44975v0;
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
        return (int) ((this.f44970q0.f27003b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override
    public uk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new uk0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    @Override
    public final void k() {
        gw0 gw0Var = this.f44970q0;
        setX(getPositionX() - (gw0Var.f27002a / 2.0f));
        setY(getPositionY() - (gw0Var.f27003b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44973t0.b(true);
        this.f44974u0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44973t0.b(false);
        this.f44974u0.b(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        gw0 gw0Var = this.f44970q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) gw0Var.f27002a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) gw0Var.f27003b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f44971r0.a();
        } else {
            this.f44972s0 = this.f44971r0;
            ob obVar = new ob(this);
            this.f44971r0 = obVar;
            if (this.f44972s0.f1480a != 1) {
                obVar.a();
            }
            this.f44971r0.b(this.f44978y0, false);
            this.f44971r0.c(getScaleX());
            this.f44977x0.d(0.0f, true);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f44978y0;
        this.f44978y0 = z11;
        if (!z10) {
            this.f44971r0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ai.x(26, this, zArr));
        ofFloat.addListener(new cl0(18, this, zArr));
        ofFloat.setInterpolator(tr.f31216g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(zg.m0 m0Var, boolean z10) {
        if (Objects.equals(this.f44975v0, m0Var)) {
            return;
        }
        if (!z10) {
            this.f44975v0 = m0Var;
            this.f44973t0.e(m0Var);
            invalidate();
            return;
        }
        this.f44975v0 = m0Var;
        this.f44974u0.e(m0Var);
        zg.d0 d0Var = this.f44973t0;
        this.f44973t0 = this.f44974u0;
        this.f44974u0 = d0Var;
        this.f44976w0.d(0.0f, true);
        invalidate();
    }

    @Override
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            super.setScaleX(f7);
            this.f44971r0.c(f7);
            invalidate();
        }
    }
}
