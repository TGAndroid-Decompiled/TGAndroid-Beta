package qh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class o9 extends FrameLayout {
    public final int f45838a;
    public Object f45839b;

    public o9(Context context) {
        super(context);
        this.f45838a = 2;
    }

    @Override
    public void addView(View view, int i10, int i11) {
        switch (this.f45838a) {
            case 3:
                super.addView(view, i10, i11);
                ((vg.f) this.f45839b).e();
                return;
            default:
                super.addView(view, i10, i11);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f45838a) {
            case 1:
                if (((rh.g) this.f45839b).f46826b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f45838a) {
            case 0:
                ca caVar = (ca) this.f45839b;
                if (getTranslationY() != f10 && caVar.Z0 != null) {
                    super.setTranslationY(f10);
                    caVar.Z0.y();
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public o9(Object obj, Context context, int i10) {
        super(context);
        this.f45838a = i10;
        this.f45839b = obj;
    }
}
