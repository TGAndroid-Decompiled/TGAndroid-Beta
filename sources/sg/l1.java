package sg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.eg0;
import zh.i2;
import zh.v7;
import zh.w3;
public final class l1 extends FrameLayout {
    public final int f46171a;
    public final Object f46172b;

    public l1(Object obj, Context context, int i10) {
        super(context);
        this.f46171a = i10;
        this.f46172b = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f46171a) {
            case 3:
                if (((v7) this.f46172b).f52738f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        float f7;
        float top;
        int measuredHeight;
        fi.g gVar;
        switch (this.f46171a) {
            case 0:
                super.onMeasure(i10, i11);
                o1 o1Var = ((n1) this.f46172b).f46185c;
                eg0 eg0Var = o1Var.f46210r0;
                if (eg0Var != null) {
                    top = eg0Var.getTop();
                    measuredHeight = o1Var.f46210r0.getMeasuredHeight();
                } else {
                    View view = o1Var.B0;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = o1Var.B0.getMeasuredHeight();
                    } else {
                        f7 = 0.0f;
                        o1Var.f46209q0.setTranslationY(f7 - (gVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f7 = (measuredHeight / 2.0f) + top;
                o1Var.f46209q0.setTranslationY(f7 - (gVar.getMeasuredHeight() / 2.0f));
                return;
            case 1:
                super.onMeasure(i10, i11);
                ((yh.h1) this.f46172b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f46171a) {
            case 2:
                super.setTranslationY(f7);
                w3 w3Var = (w3) this.f46172b;
                i2 i2Var = w3Var.f52761d0;
                if (i2Var != null && i2Var.getVisibility() == 0) {
                    w3Var.f52761d0.invalidate();
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
