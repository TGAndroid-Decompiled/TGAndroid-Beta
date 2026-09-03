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
import org.telegram.ui.nw0;
public final class s9 extends FrameLayout {
    public float f46106a;
    public float f46107b;
    public final Paint f46108c;
    public LinearGradient d;
    public final ba f46109e;

    public s9(ba baVar, Activity activity) {
        super(activity);
        this.f46109e = baVar;
        this.f46108c = new Paint(1);
    }

    public static void a(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
    }

    public final void b(float f10) {
        float f11 = this.f46106a;
        this.f46107b = f10;
        super.setTranslationY(f11 + f10);
    }

    public final void c() {
        if (this.f46109e.G == 0) {
            setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f10;
        boolean drawChild = super.drawChild(canvas, view, j10);
        ba baVar = this.f46109e;
        if (view == baVar.f45055e0) {
            if (baVar.S) {
                f10 = AndroidUtilities.statusBarHeight;
            } else {
                f10 = 0.0f;
            }
            LinearGradient linearGradient = this.d;
            Paint paint = this.f46108c;
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
        ValueAnimator valueAnimator = this.f46109e.B;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        ba baVar = this.f46109e;
        if (baVar.S) {
            i14 = baVar.W;
        } else {
            i14 = 0;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        baVar.f45055e0.layout(0, 0, baVar.P, baVar.Q);
        baVar.f45055e0.setPivotX(baVar.P * 0.5f);
        FrameLayout frameLayout = baVar.f45059f0;
        frameLayout.layout(0, i14, baVar.P, frameLayout.getMeasuredHeight() + i14);
        FrameLayout frameLayout2 = baVar.f45065h0;
        frameLayout2.layout(0, baVar.Q - frameLayout2.getMeasuredHeight(), baVar.P, baVar.Q);
        FrameLayout frameLayout3 = baVar.f45071j0;
        int i15 = baVar.Q;
        frameLayout3.layout(0, i15, baVar.P, frameLayout3.getMeasuredHeight() + i15);
        baVar.f45068i0.layout(0, 0, baVar.P, baVar.Q);
        nw0 nw0Var = baVar.f45091q0;
        if (nw0Var != null) {
            nw0Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        baVar.f45098s.f45149c.layout(0, 0, measuredWidth, measuredHeight);
        zh zhVar = baVar.Z0.J;
        if (zhVar != null) {
            zhVar.layout(0, 0, baVar.P, baVar.Q);
            baVar.Z0.y();
        }
        pf0 pf0Var = baVar.f45121y1;
        if (pf0Var != null) {
            pf0Var.layout(0, 0, pf0Var.getMeasuredWidth(), baVar.f45121y1.getMeasuredHeight());
        }
        e9 e9Var = baVar.f45100s1;
        if (e9Var != null) {
            e9Var.layout(0, 0, e9Var.getMeasuredWidth(), baVar.f45100s1.getMeasuredHeight());
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
        ba baVar = this.f46109e;
        a(baVar.f45055e0, baVar.P, baVar.Q);
        baVar.j();
        a(baVar.f45059f0, baVar.P, AndroidUtilities.dp(150.0f));
        a(baVar.f45065h0, baVar.P, AndroidUtilities.dp(220.0f));
        a(baVar.f45071j0, baVar.P, baVar.R);
        a(baVar.f45068i0, baVar.P, baVar.Q);
        a(baVar.f45098s.f45149c, size, size2);
        nw0 nw0Var = baVar.f45091q0;
        if (nw0Var != null) {
            a(nw0Var, size, size2);
        }
        zh zhVar = baVar.Z0.J;
        if (zhVar != null) {
            a(zhVar, baVar.P, baVar.Q);
        }
        pf0 pf0Var = baVar.f45121y1;
        if (pf0Var != null) {
            a(pf0Var, size, size2);
        }
        e9 e9Var = baVar.f45100s1;
        if (e9Var != null) {
            a(e9Var, size, size2);
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
        this.f46106a = f10;
        super.setTranslationY(this.f46107b + f10);
        float clamp = Utilities.clamp((f10 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        ba baVar = this.f46109e;
        baVar.H = clamp;
        baVar.o();
        baVar.f45081n.invalidate();
        float clamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(clamp2);
        setScaleY(clamp2);
    }
}
