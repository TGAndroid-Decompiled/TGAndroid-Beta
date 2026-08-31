package qh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.zh;
import org.telegram.ui.iw0;
public final class t9 extends FrameLayout {
    public float f46126a;
    public float f46127b;
    public final Paint f46128c;
    public LinearGradient d;
    public final ca f46129e;

    public t9(ca caVar, Activity activity) {
        super(activity);
        this.f46129e = caVar;
        this.f46128c = new Paint(1);
    }

    public static void a(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
    }

    public final void b(float f10) {
        float f11 = this.f46126a;
        this.f46127b = f10;
        super.setTranslationY(f11 + f10);
    }

    public final void c() {
        if (this.f46129e.G == 0) {
            setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f10;
        boolean drawChild = super.drawChild(canvas, view, j10);
        ca caVar = this.f46129e;
        if (view == caVar.f45089e0) {
            if (caVar.S) {
                f10 = AndroidUtilities.statusBarHeight;
            } else {
                f10 = 0.0f;
            }
            LinearGradient linearGradient = this.d;
            Paint paint = this.f46128c;
            if (linearGradient == null) {
                LinearGradient linearGradient2 = new LinearGradient(0.0f, f10, 0.0f, f10 + AndroidUtilities.dp(72.0f), new int[]{1073741824, 0}, new float[]{f10 / (AndroidUtilities.dp(72.0f) + f10), 1.0f}, Shader.TileMode.CLAMP);
                this.d = linearGradient2;
                paint.setShader(linearGradient2);
            }
            paint.setAlpha(255);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(84.0f) + f10);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
        }
        return drawChild;
    }

    @Override
    public final void invalidate() {
        ValueAnimator valueAnimator = this.f46129e.B;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        ca caVar = this.f46129e;
        if (caVar.S) {
            i14 = caVar.W;
        } else {
            i14 = 0;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        caVar.f45089e0.layout(0, 0, caVar.P, caVar.Q);
        caVar.f45089e0.setPivotX(caVar.P * 0.5f);
        FrameLayout frameLayout = caVar.f45093f0;
        frameLayout.layout(0, i14, caVar.P, frameLayout.getMeasuredHeight() + i14);
        FrameLayout frameLayout2 = caVar.f45099h0;
        frameLayout2.layout(0, caVar.Q - frameLayout2.getMeasuredHeight(), caVar.P, caVar.Q);
        FrameLayout frameLayout3 = caVar.f45105j0;
        int i15 = caVar.Q;
        frameLayout3.layout(0, i15, caVar.P, frameLayout3.getMeasuredHeight() + i15);
        caVar.f45102i0.layout(0, 0, caVar.P, caVar.Q);
        iw0 iw0Var = caVar.f45125q0;
        if (iw0Var != null) {
            iw0Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        caVar.f45132s.f45183c.layout(0, 0, measuredWidth, measuredHeight);
        zh zhVar = caVar.Z0.J;
        if (zhVar != null) {
            zhVar.layout(0, 0, caVar.P, caVar.Q);
            caVar.Z0.y();
        }
        pf0 pf0Var = caVar.f45155y1;
        if (pf0Var != null) {
            pf0Var.layout(0, 0, pf0Var.getMeasuredWidth(), caVar.f45155y1.getMeasuredHeight());
        }
        f9 f9Var = caVar.f45134s1;
        if (f9Var != null) {
            f9Var.layout(0, 0, f9Var.getMeasuredWidth(), caVar.f45134s1.getMeasuredHeight());
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof o70) {
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
        ca caVar = this.f46129e;
        a(caVar.f45089e0, caVar.P, caVar.Q);
        caVar.j();
        a(caVar.f45093f0, caVar.P, AndroidUtilities.dp(150.0f));
        a(caVar.f45099h0, caVar.P, AndroidUtilities.dp(220.0f));
        a(caVar.f45105j0, caVar.P, caVar.R);
        a(caVar.f45102i0, caVar.P, caVar.Q);
        a(caVar.f45132s.f45183c, size, size2);
        iw0 iw0Var = caVar.f45125q0;
        if (iw0Var != null) {
            a(iw0Var, size, size2);
        }
        zh zhVar = caVar.Z0.J;
        if (zhVar != null) {
            a(zhVar, caVar.P, caVar.Q);
        }
        pf0 pf0Var = caVar.f45155y1;
        if (pf0Var != null) {
            a(pf0Var, size, size2);
        }
        f9 f9Var = caVar.f45134s1;
        if (f9Var != null) {
            a(f9Var, size, size2);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof o70) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f10) {
        this.f46126a = f10;
        super.setTranslationY(this.f46127b + f10);
        float clamp = Utilities.clamp((f10 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        ca caVar = this.f46129e;
        caVar.H = clamp;
        caVar.o();
        caVar.f45115n.invalidate();
        float clamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(clamp2);
        setScaleY(clamp2);
    }
}
