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
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.uk0;
public final class a2 extends j {
    public fw0 f44955q0;
    public ob f44956r0;
    public ob f44957s0;
    public zg.f0 f44958t0;
    public zg.f0 f44959u0;
    public zg.o0 f44960v0;
    public e6 f44961w0;
    public e6 f44962x0;
    public boolean f44963y0;
    public float f44964z0;

    @Override
    public final i a() {
        z1 z1Var = new z1(this, getContext(), 0);
        z1Var.f45434r = new RectF();
        return z1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        fw0 fw0Var = this.f44955q0;
        int padding = getPadding();
        float d = this.f44962x0.d(1.0f, false);
        if (d == 1.0f) {
            this.f44957s0 = null;
        }
        canvas.save();
        float f7 = this.f44964z0;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        ob obVar = this.f44957s0;
        if (obVar != null) {
            obVar.f1483e = (int) ((1.0f - d) * 255.0f);
            obVar.setBounds(padding, padding, ((int) fw0Var.f26584a) - padding, ((int) fw0Var.f26585b) - padding);
            this.f44957s0.draw(canvas);
        }
        ob obVar2 = this.f44956r0;
        obVar2.f1483e = (int) (d * 255.0f);
        obVar2.setBounds(padding, padding, ((int) fw0Var.f26584a) - padding, ((int) fw0Var.f26585b) - padding);
        this.f44956r0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.f44956r0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f44956r0.getBounds().centerX() - width), (int) (this.f44956r0.getBounds().centerY() - width), (int) (this.f44956r0.getBounds().centerX() + width), (int) (this.f44956r0.getBounds().centerY() + width));
        float d10 = this.f44961w0.d(1.0f, false);
        this.f44958t0.c(rect);
        this.f44959u0.c(rect);
        zg.f0 f0Var = this.f44958t0;
        if (this.f44956r0.f1480a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        f0Var.d(i10);
        if (d10 == 1.0f) {
            this.f44958t0.a(canvas);
        } else {
            canvas.save();
            float f10 = 1.0f - d10;
            canvas.scale(f10, f10, rect.centerX(), rect.top);
            zg.f0 f0Var2 = this.f44959u0;
            f0Var2.h = f10;
            f0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            zg.f0 f0Var3 = this.f44958t0;
            f0Var3.h = d10;
            f0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public zg.o0 getCurrentReaction() {
        return this.f44960v0;
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
        return (int) ((this.f44955q0.f26585b - AndroidUtilities.dp(84.0f)) / 2.0f);
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
        fw0 fw0Var = this.f44955q0;
        setX(getPositionX() - (fw0Var.f26584a / 2.0f));
        setY(getPositionY() - (fw0Var.f26585b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44958t0.b(true);
        this.f44959u0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44958t0.b(false);
        this.f44959u0.b(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        fw0 fw0Var = this.f44955q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) fw0Var.f26584a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) fw0Var.f26585b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f44956r0.a();
        } else {
            this.f44957s0 = this.f44956r0;
            ob obVar = new ob(this);
            this.f44956r0 = obVar;
            if (this.f44957s0.f1480a != 1) {
                obVar.a();
            }
            this.f44956r0.b(this.f44963y0, false);
            this.f44956r0.c(getScaleX());
            this.f44962x0.d(0.0f, true);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f44963y0;
        this.f44963y0 = z11;
        if (!z10) {
            this.f44956r0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ai.x(26, this, zArr));
        ofFloat.addListener(new cl0(18, this, zArr));
        ofFloat.setInterpolator(tr.f31141g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(zg.o0 o0Var, boolean z10) {
        if (Objects.equals(this.f44960v0, o0Var)) {
            return;
        }
        if (!z10) {
            this.f44960v0 = o0Var;
            this.f44958t0.e(o0Var);
            invalidate();
            return;
        }
        this.f44960v0 = o0Var;
        this.f44959u0.e(o0Var);
        zg.f0 f0Var = this.f44958t0;
        this.f44958t0 = this.f44959u0;
        this.f44959u0 = f0Var;
        this.f44961w0.d(0.0f, true);
        invalidate();
    }

    @Override
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            super.setScaleX(f7);
            this.f44956r0.c(f7);
            invalidate();
        }
    }
}
