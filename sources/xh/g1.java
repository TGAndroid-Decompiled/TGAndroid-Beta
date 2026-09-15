package xh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import yh.y7;
public final class g1 extends FrameLayout {
    public final int f45873a;
    public final Object f45874b;

    public g1(Object obj, Context context, int i10) {
        super(context);
        this.f45873a = i10;
        this.f45874b = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f45873a) {
            case 2:
                if (((y7) this.f45874b).f48039f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f45873a) {
            case 3:
                super.onLayout(z10, i10, i11, i12, i13);
                zg.q qVar = (zg.q) this.f45874b;
                if (qVar.K && z10) {
                    qVar.f49136w.setTranslationY(-qVar.f49131c.getMeasuredHeight());
                    int measuredHeight = qVar.f49131c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.f49138y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    qVar.f49138y.setLayoutParams(marginLayoutParams);
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
        switch (this.f45873a) {
            case 0:
                super.onMeasure(i10, i11);
                ((i1) this.f45874b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f45873a) {
            case 1:
                super.setTranslationY(f7);
                yh.a4 a4Var = (yh.a4) this.f45874b;
                yh.l2 l2Var = a4Var.f46951d0;
                if (l2Var != null && l2Var.getVisibility() == 0) {
                    a4Var.f46951d0.invalidate();
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
