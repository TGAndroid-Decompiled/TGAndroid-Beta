package rg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.eg0;
import yh.f2;
import yh.p7;
import yh.s3;
public final class t0 extends FrameLayout {
    public final int f47439a;
    public final Object f47440b;

    public t0(Object obj, Context context, int i10) {
        super(context);
        this.f47439a = i10;
        this.f47440b = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f47439a) {
            case 4:
                if (((p7) this.f47440b).f53049f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f47439a) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                zg.q qVar = (zg.q) this.f47440b;
                if (qVar.K && z10) {
                    qVar.f54653w.setTranslationY(-qVar.f54647c.getMeasuredHeight());
                    int measuredHeight = qVar.f54647c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.f54655y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    qVar.f54655y.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        float top;
        int measuredHeight;
        ei.f fVar;
        switch (this.f47439a) {
            case 0:
                y0 y0Var = (y0) this.f47440b;
                z10 = ((f3) y0Var).isPortrait;
                if (z10) {
                    y0Var.f47525s = View.MeasureSpec.getSize(i10);
                } else {
                    y0Var.f47525s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                return;
            case 1:
                super.onMeasure(i10, i11);
                l1 l1Var = ((k1) this.f47440b).f47307c;
                eg0 eg0Var = l1Var.f47335r0;
                if (eg0Var != null) {
                    top = eg0Var.getTop();
                    measuredHeight = l1Var.f47335r0.getMeasuredHeight();
                } else {
                    View view = l1Var.B0;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = l1Var.B0.getMeasuredHeight();
                    } else {
                        f7 = 0.0f;
                        l1Var.f47334q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f7 = (measuredHeight / 2.0f) + top;
                l1Var.f47334q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                return;
            case 2:
                super.onMeasure(i10, i11);
                ((xh.j1) this.f47440b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f47439a) {
            case 3:
                super.setTranslationY(f7);
                s3 s3Var = (s3) this.f47440b;
                f2 f2Var = s3Var.f53165e0;
                if (f2Var != null && f2Var.getVisibility() == 0) {
                    s3Var.f53165e0.invalidate();
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
