package xh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import yh.w7;
public final class h1 extends FrameLayout {
    public final int f46162a;
    public final Object f46163b;

    public h1(Object obj, Context context, int i10) {
        super(context);
        this.f46162a = i10;
        this.f46163b = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f46162a) {
            case 2:
                if (((w7) this.f46163b).f48196f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f46162a) {
            case 3:
                super.onLayout(z10, i10, i11, i12, i13);
                zg.q qVar = (zg.q) this.f46163b;
                if (qVar.K && z10) {
                    qVar.f49432w.setTranslationY(-qVar.f49427c.getMeasuredHeight());
                    int measuredHeight = qVar.f49427c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.f49434y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    qVar.f49434y.setLayoutParams(marginLayoutParams);
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
        switch (this.f46162a) {
            case 0:
                super.onMeasure(i10, i11);
                ((j1) this.f46163b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f46162a) {
            case 1:
                super.setTranslationY(f7);
                yh.x3 x3Var = (yh.x3) this.f46163b;
                yh.i2 i2Var = x3Var.f48234d0;
                if (i2Var != null && i2Var.getVisibility() == 0) {
                    x3Var.f48234d0.invalidate();
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
