package xh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import yh.y7;
public final class g1 extends FrameLayout {
    public final int f45901a;
    public final Object f45902b;

    public g1(Object obj, Context context, int i10) {
        super(context);
        this.f45901a = i10;
        this.f45902b = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f45901a) {
            case 2:
                if (((y7) this.f45902b).f48067f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f45901a) {
            case 3:
                super.onLayout(z10, i10, i11, i12, i13);
                zg.q qVar = (zg.q) this.f45902b;
                if (qVar.K && z10) {
                    qVar.f49164w.setTranslationY(-qVar.f49159c.getMeasuredHeight());
                    int measuredHeight = qVar.f49159c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.f49166y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    qVar.f49166y.setLayoutParams(marginLayoutParams);
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
        switch (this.f45901a) {
            case 0:
                super.onMeasure(i10, i11);
                ((i1) this.f45902b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f45901a) {
            case 1:
                super.setTranslationY(f7);
                yh.a4 a4Var = (yh.a4) this.f45902b;
                yh.l2 l2Var = a4Var.f46979d0;
                if (l2Var != null && l2Var.getVisibility() == 0) {
                    a4Var.f46979d0.invalidate();
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
