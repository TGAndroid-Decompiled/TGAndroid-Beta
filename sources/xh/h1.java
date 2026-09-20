package xh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import yh.w7;
public final class h1 extends FrameLayout {
    public final int f46182a;
    public final Object f46183b;

    public h1(Object obj, Context context, int i10) {
        super(context);
        this.f46182a = i10;
        this.f46183b = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f46182a) {
            case 2:
                if (((w7) this.f46183b).f48232f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f46182a) {
            case 3:
                super.onLayout(z10, i10, i11, i12, i13);
                zg.q qVar = (zg.q) this.f46183b;
                if (qVar.K && z10) {
                    qVar.f49459w.setTranslationY(-qVar.f49454c.getMeasuredHeight());
                    int measuredHeight = qVar.f49454c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.f49461y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    qVar.f49461y.setLayoutParams(marginLayoutParams);
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
        switch (this.f46182a) {
            case 0:
                super.onMeasure(i10, i11);
                ((j1) this.f46183b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f46182a) {
            case 1:
                super.setTranslationY(f7);
                yh.y3 y3Var = (yh.y3) this.f46183b;
                yh.j2 j2Var = y3Var.f48305d0;
                if (j2Var != null && j2Var.getVisibility() == 0) {
                    y3Var.f48305d0.invalidate();
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
