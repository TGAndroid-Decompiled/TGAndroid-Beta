package xh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import yh.x7;
public final class g1 extends FrameLayout {
    public final int f45869a;
    public final Object f45870b;

    public g1(Object obj, Context context, int i10) {
        super(context);
        this.f45869a = i10;
        this.f45870b = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f45869a) {
            case 2:
                if (((x7) this.f45870b).f47946f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f45869a) {
            case 3:
                super.onLayout(z10, i10, i11, i12, i13);
                zg.q qVar = (zg.q) this.f45870b;
                if (qVar.K && z10) {
                    qVar.f49129w.setTranslationY(-qVar.f49124c.getMeasuredHeight());
                    int measuredHeight = qVar.f49124c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.f49131y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    qVar.f49131y.setLayoutParams(marginLayoutParams);
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
        switch (this.f45869a) {
            case 0:
                super.onMeasure(i10, i11);
                ((i1) this.f45870b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f45869a) {
            case 1:
                super.setTranslationY(f7);
                yh.z3 z3Var = (yh.z3) this.f45870b;
                yh.k2 k2Var = z3Var.f48017d0;
                if (k2Var != null && k2Var.getVisibility() == 0) {
                    z3Var.f48017d0.invalidate();
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
