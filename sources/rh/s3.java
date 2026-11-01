package rh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class s3 extends FrameLayout {
    public final b1 f47456a;
    public final r3 f47457b;
    public final r3 f47458c;
    public final r3 d;
    public boolean e;
    public final li.k f47459f;
    public final RectF h;

    public s3(Context context, org.telegram.ui.ActionBar.p6 p6Var, b1 b1Var) {
        super(context);
        this.f47459f = new li.k(23);
        this.h = new RectF();
        this.f47456a = b1Var;
        r3 r3Var = new r3(context, p6Var);
        this.f47457b = r3Var;
        r3 r3Var2 = new r3(context, p6Var);
        this.f47458c = r3Var2;
        r3 r3Var3 = new r3(context, p6Var);
        this.d = r3Var3;
        addView(r3Var, w7.b6.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(r3Var2, w7.b6.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(r3Var3, w7.b6.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(i3 i3Var, float f7, boolean z10, i3 i3Var2, float f10, boolean z11, i3 i3Var3, float f11, boolean z12) {
        b1 b1Var = this.f47456a;
        r3 r3Var = this.f47457b;
        if (i3Var != null) {
            if (z10) {
                f7 = Math.max(0.5f, f7);
            }
            r3Var.setVisibility(0);
            r3Var.e(i3Var.f47097a, i3Var.f47098b, b1Var);
            r3Var.setTranslationY(org.telegram.messenger.i0.L(36.0f) * ((f7 - 0.5f) / 1.5f));
        } else {
            r3Var.setVisibility(4);
        }
        r3 r3Var2 = this.f47458c;
        if (i3Var2 != null) {
            float f12 = f10;
            if (z11) {
                f12 = Math.max(0.5f, f12);
            }
            float f13 = (f12 - 0.5f) / 1.5f;
            r3Var2.setVisibility(0);
            r3Var2.e(i3Var2.f47097a, i3Var2.f47098b, b1Var);
            r3Var2.setTranslationY(org.telegram.messenger.i0.L(36.0f) * f13);
            if (z11 && f13 <= 0.0f && !this.e) {
                this.e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new qh.e0(r3Var2, 4));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            r3Var2.setVisibility(4);
        }
        r3 r3Var3 = this.d;
        if (i3Var3 != null) {
            float f14 = f11;
            if (z12) {
                f14 = Math.max(0.5f, f14);
            }
            r3Var3.setVisibility(0);
            r3Var3.e(i3Var3.f47097a, i3Var3.f47098b, b1Var);
            r3Var3.setTranslationY(org.telegram.messenger.i0.L(36.0f) * ((f14 - 0.5f) / 1.5f));
            return;
        }
        r3Var3.setVisibility(4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.i0.L(8.0f));
        li.k kVar = this.f47459f;
        kVar.o(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - org.telegram.messenger.i0.L(8.0f), getWidth(), getHeight());
        kVar.o(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(37.66f), 1073741824));
    }
}
