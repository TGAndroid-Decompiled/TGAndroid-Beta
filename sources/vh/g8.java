package vh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.x60;
import org.telegram.ui.do0;
public final class g8 extends FrameLayout {
    public float f51215a;
    public float f51216b;
    public final Paint f51217c;
    public LinearGradient d;
    public final o8 e;

    public g8(o8 o8Var, Activity activity) {
        super(activity);
        this.e = o8Var;
        this.f51217c = new Paint(1);
    }

    public static void a(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
    }

    public final void b(float f7) {
        float f10 = this.f51215a;
        this.f51216b = f7;
        super.setTranslationY(f10 + f7);
    }

    public final void c() {
        if (this.e.J == 0) {
            setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f7;
        boolean drawChild = super.drawChild(canvas, view, j10);
        o8 o8Var = this.e;
        if (view == o8Var.f51628h0) {
            if (o8Var.V) {
                f7 = org.telegram.messenger.i0.f16020m;
            } else {
                f7 = 0.0f;
            }
            LinearGradient linearGradient = this.d;
            Paint paint = this.f51217c;
            if (linearGradient == null) {
                LinearGradient linearGradient2 = new LinearGradient(0.0f, f7, 0.0f, f7 + org.telegram.messenger.i0.L(72.0f), new int[]{1073741824, 0}, new float[]{f7 / (org.telegram.messenger.i0.L(72.0f) + f7), 1.0f}, Shader.TileMode.CLAMP);
                this.d = linearGradient2;
                paint.setShader(linearGradient2);
            }
            paint.setAlpha(255);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.i0.L(84.0f) + f7);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), paint);
        }
        return drawChild;
    }

    @Override
    public final void invalidate() {
        ValueAnimator valueAnimator = this.e.E;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        o8 o8Var = this.e;
        if (o8Var.V) {
            i14 = o8Var.Z;
        } else {
            i14 = 0;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        o8Var.f51628h0.layout(0, 0, o8Var.S, o8Var.T);
        o8Var.f51628h0.setPivotX(o8Var.S * 0.5f);
        FrameLayout frameLayout = o8Var.f51631i0;
        frameLayout.layout(0, i14, o8Var.S, frameLayout.getMeasuredHeight() + i14);
        FrameLayout frameLayout2 = o8Var.f51637k0;
        frameLayout2.layout(0, o8Var.T - frameLayout2.getMeasuredHeight(), o8Var.S, o8Var.T);
        FrameLayout frameLayout3 = o8Var.m0;
        int i15 = o8Var.T;
        frameLayout3.layout(0, i15, o8Var.S, frameLayout3.getMeasuredHeight() + i15);
        o8Var.f51640l0.layout(0, 0, o8Var.S, o8Var.T);
        do0 do0Var = o8Var.f51665t0;
        if (do0Var != null) {
            do0Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        o8Var.f51661s.f52228c.layout(0, 0, measuredWidth, measuredHeight);
        oh ohVar = o8Var.f51613c1.M;
        if (ohVar != null) {
            ohVar.layout(0, 0, o8Var.S, o8Var.T);
            o8Var.f51613c1.y();
        }
        oe0 oe0Var = o8Var.B1;
        if (oe0Var != null) {
            oe0Var.layout(0, 0, oe0Var.getMeasuredWidth(), o8Var.B1.getMeasuredHeight());
        }
        s7 s7Var = o8Var.f51672v1;
        if (s7Var != null) {
            s7Var.layout(0, 0, s7Var.getMeasuredWidth(), o8Var.f51672v1.getMeasuredHeight());
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof x60) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            }
        }
        setPivotX(measuredWidth / 2.0f);
        setPivotY((-measuredHeight) * 0.2f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        o8 o8Var = this.e;
        a(o8Var.f51628h0, o8Var.S, o8Var.T);
        o8Var.i();
        a(o8Var.f51631i0, o8Var.S, org.telegram.messenger.i0.L(150.0f));
        a(o8Var.f51637k0, o8Var.S, org.telegram.messenger.i0.L(220.0f));
        a(o8Var.m0, o8Var.S, o8Var.U);
        a(o8Var.f51640l0, o8Var.S, o8Var.T);
        a(o8Var.f51661s.f52228c, size, size2);
        do0 do0Var = o8Var.f51665t0;
        if (do0Var != null) {
            a(do0Var, size, size2);
        }
        oh ohVar = o8Var.f51613c1.M;
        if (ohVar != null) {
            a(ohVar, o8Var.S, o8Var.T);
        }
        oe0 oe0Var = o8Var.B1;
        if (oe0Var != null) {
            a(oe0Var, size, size2);
        }
        s7 s7Var = o8Var.f51672v1;
        if (s7Var != null) {
            a(s7Var, size, size2);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof x60) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f7) {
        this.f51215a = f7;
        super.setTranslationY(this.f51216b + f7);
        float i10 = Utilities.i((f7 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        o8 o8Var = this.e;
        o8Var.K = i10;
        o8Var.n();
        o8Var.f51644n.invalidate();
        float i11 = 1.0f - (Utilities.i(getTranslationY() / org.telegram.messenger.i0.L(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(i11);
        setScaleY(i11);
    }
}
