package sg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import di.e9;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.qw0;
public final class c2 extends j {
    public qw0 f48165q0;
    public e9 f48166r0;
    public e9 f48167s0;
    public bh.n0 f48168t0;
    public bh.n0 f48169u0;
    public bh.x0 f48170v0;
    public h6 f48171w0;
    public h6 f48172x0;
    public boolean f48173y0;
    public float f48174z0;

    @Override
    public final i a() {
        b2 b2Var = new b2(this, getContext(), 0);
        b2Var.f48163r = new RectF();
        return b2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        qw0 qw0Var = this.f48165q0;
        int padding = getPadding();
        float d = this.f48172x0.d(1.0f, false);
        if (d == 1.0f) {
            this.f48167s0 = null;
        }
        canvas.save();
        float f7 = this.f48174z0;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        e9 e9Var = this.f48167s0;
        if (e9Var != null) {
            e9Var.e = (int) ((1.0f - d) * 255.0f);
            e9Var.setBounds(padding, padding, ((int) qw0Var.f32054a) - padding, ((int) qw0Var.f32055b) - padding);
            this.f48167s0.draw(canvas);
        }
        e9 e9Var2 = this.f48166r0;
        e9Var2.e = (int) (d * 255.0f);
        e9Var2.setBounds(padding, padding, ((int) qw0Var.f32054a) - padding, ((int) qw0Var.f32055b) - padding);
        this.f48166r0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.f48166r0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f48166r0.getBounds().centerX() - width), (int) (this.f48166r0.getBounds().centerY() - width), (int) (this.f48166r0.getBounds().centerX() + width), (int) (this.f48166r0.getBounds().centerY() + width));
        float d10 = this.f48171w0.d(1.0f, false);
        this.f48168t0.c(rect);
        this.f48169u0.c(rect);
        bh.n0 n0Var = this.f48168t0;
        if (this.f48166r0.f8529a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        n0Var.d(i10);
        if (d10 == 1.0f) {
            this.f48168t0.a(canvas);
        } else {
            canvas.save();
            float f10 = 1.0f - d10;
            canvas.scale(f10, f10, rect.centerX(), rect.top);
            bh.n0 n0Var2 = this.f48169u0;
            n0Var2.h = f10;
            n0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            bh.n0 n0Var3 = this.f48168t0;
            n0Var3.h = d10;
            n0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public bh.x0 getCurrentReaction() {
        return this.f48170v0;
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
        return (int) ((this.f48165q0.f32055b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override
    public hl0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new hl0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    @Override
    public final void k() {
        qw0 qw0Var = this.f48165q0;
        setX(getPositionX() - (qw0Var.f32054a / 2.0f));
        setY(getPositionY() - (qw0Var.f32055b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48168t0.b(true);
        this.f48169u0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48168t0.b(false);
        this.f48169u0.b(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        qw0 qw0Var = this.f48165q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) qw0Var.f32054a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) qw0Var.f32055b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f48166r0.a();
        } else {
            this.f48167s0 = this.f48166r0;
            e9 e9Var = new e9(this);
            this.f48166r0 = e9Var;
            if (this.f48167s0.f8529a != 1) {
                e9Var.a();
            }
            this.f48166r0.b(this.f48173y0, false);
            this.f48166r0.c(getScaleX());
            this.f48172x0.d(0.0f, true);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f48173y0;
        this.f48173y0 = z11;
        if (!z10) {
            this.f48166r0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new tg.i1(1, this, zArr));
        ofFloat.addListener(new ll0(19, this, zArr));
        ofFloat.setInterpolator(ds.f27587g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(bh.x0 x0Var, boolean z10) {
        if (Objects.equals(this.f48170v0, x0Var)) {
            return;
        }
        if (!z10) {
            this.f48170v0 = x0Var;
            this.f48168t0.e(x0Var);
            invalidate();
            return;
        }
        this.f48170v0 = x0Var;
        this.f48169u0.e(x0Var);
        bh.n0 n0Var = this.f48168t0;
        this.f48168t0 = this.f48169u0;
        this.f48169u0 = n0Var;
        this.f48171w0.d(0.0f, true);
        invalidate();
    }

    @Override
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            super.setScaleX(f7);
            this.f48166r0.c(f7);
            invalidate();
        }
    }
}
