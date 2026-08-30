package ph;

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
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.zh;
import org.telegram.ui.gw0;
public final class v9 extends FrameLayout {
    public float f42486a;
    public float f42487b;
    public final Paint f42488c;
    public LinearGradient d;
    public final da e;

    public v9(da daVar, Activity activity) {
        super(activity);
        this.e = daVar;
        this.f42488c = new Paint(1);
    }

    public static void a(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
    }

    public final void b(float f10) {
        float f11 = this.f42486a;
        this.f42487b = f10;
        super.setTranslationY(f11 + f10);
    }

    public final void c() {
        if (this.e.G == 0) {
            setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f10;
        boolean drawChild = super.drawChild(canvas, view, j10);
        da daVar = this.e;
        if (view == daVar.f41486e0) {
            if (daVar.S) {
                f10 = AndroidUtilities.statusBarHeight;
            } else {
                f10 = 0.0f;
            }
            LinearGradient linearGradient = this.d;
            Paint paint = this.f42488c;
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
        ValueAnimator valueAnimator = this.e.B;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        da daVar = this.e;
        if (daVar.S) {
            i14 = daVar.W;
        } else {
            i14 = 0;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        daVar.f41486e0.layout(0, 0, daVar.P, daVar.Q);
        daVar.f41486e0.setPivotX(daVar.P * 0.5f);
        FrameLayout frameLayout = daVar.f41490f0;
        frameLayout.layout(0, i14, daVar.P, frameLayout.getMeasuredHeight() + i14);
        FrameLayout frameLayout2 = daVar.f41496h0;
        frameLayout2.layout(0, daVar.Q - frameLayout2.getMeasuredHeight(), daVar.P, daVar.Q);
        FrameLayout frameLayout3 = daVar.f41502j0;
        int i15 = daVar.Q;
        frameLayout3.layout(0, i15, daVar.P, frameLayout3.getMeasuredHeight() + i15);
        daVar.f41499i0.layout(0, 0, daVar.P, daVar.Q);
        gw0 gw0Var = daVar.f41522q0;
        if (gw0Var != null) {
            gw0Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        daVar.f41529s.f41423c.layout(0, 0, measuredWidth, measuredHeight);
        zh zhVar = daVar.Z0.J;
        if (zhVar != null) {
            zhVar.layout(0, 0, daVar.P, daVar.Q);
            daVar.Z0.y();
        }
        nf0 nf0Var = daVar.f41552y1;
        if (nf0Var != null) {
            nf0Var.layout(0, 0, nf0Var.getMeasuredWidth(), daVar.f41552y1.getMeasuredHeight());
        }
        h9 h9Var = daVar.f41531s1;
        if (h9Var != null) {
            h9Var.layout(0, 0, h9Var.getMeasuredWidth(), daVar.f41531s1.getMeasuredHeight());
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof m70) {
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
        da daVar = this.e;
        a(daVar.f41486e0, daVar.P, daVar.Q);
        daVar.j();
        a(daVar.f41490f0, daVar.P, AndroidUtilities.dp(150.0f));
        a(daVar.f41496h0, daVar.P, AndroidUtilities.dp(220.0f));
        a(daVar.f41502j0, daVar.P, daVar.R);
        a(daVar.f41499i0, daVar.P, daVar.Q);
        a(daVar.f41529s.f41423c, size, size2);
        gw0 gw0Var = daVar.f41522q0;
        if (gw0Var != null) {
            a(gw0Var, size, size2);
        }
        zh zhVar = daVar.Z0.J;
        if (zhVar != null) {
            a(zhVar, daVar.P, daVar.Q);
        }
        nf0 nf0Var = daVar.f41552y1;
        if (nf0Var != null) {
            a(nf0Var, size, size2);
        }
        h9 h9Var = daVar.f41531s1;
        if (h9Var != null) {
            a(h9Var, size, size2);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof m70) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f10) {
        this.f42486a = f10;
        super.setTranslationY(this.f42487b + f10);
        float clamp = Utilities.clamp((f10 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        da daVar = this.e;
        daVar.H = clamp;
        daVar.o();
        daVar.f41512n.invalidate();
        float clamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(clamp2);
        setScaleY(clamp2);
    }
}
