package rg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.cg0;
import yh.i2;
import yh.x3;
import yh.x7;
public final class j1 extends FrameLayout {
    public final int f46136a;
    public final Object f46137b;

    public j1(Object obj, Context context, int i10) {
        super(context);
        this.f46136a = i10;
        this.f46137b = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f46136a) {
            case 3:
                if (((x7) this.f46137b).f52275r0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f46136a) {
            case 4:
                super.onLayout(z10, i10, i11, i12, i13);
                zg.q qVar = (zg.q) this.f46137b;
                if (qVar.K && z10) {
                    qVar.f53518w.setTranslationY(-qVar.f53512c.getMeasuredHeight());
                    int measuredHeight = qVar.f53512c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.f53520y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    qVar.f53520y.setLayoutParams(marginLayoutParams);
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
        float f7;
        float top;
        int measuredHeight;
        ei.g gVar;
        switch (this.f46136a) {
            case 0:
                super.onMeasure(i10, i11);
                m1 m1Var = ((l1) this.f46137b).f46184c;
                cg0 cg0Var = m1Var.f46202r0;
                if (cg0Var != null) {
                    top = cg0Var.getTop();
                    measuredHeight = m1Var.f46202r0.getMeasuredHeight();
                } else {
                    View view = m1Var.B0;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = m1Var.B0.getMeasuredHeight();
                    } else {
                        f7 = 0.0f;
                        m1Var.f46201q0.setTranslationY(f7 - (gVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f7 = (measuredHeight / 2.0f) + top;
                m1Var.f46201q0.setTranslationY(f7 - (gVar.getMeasuredHeight() / 2.0f));
                return;
            case 1:
                super.onMeasure(i10, i11);
                ((xh.i1) this.f46137b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f46136a) {
            case 2:
                super.setTranslationY(f7);
                x3 x3Var = (x3) this.f46137b;
                i2 i2Var = x3Var.f52213d0;
                if (i2Var != null && i2Var.getVisibility() == 0) {
                    x3Var.f52213d0.invalidate();
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
