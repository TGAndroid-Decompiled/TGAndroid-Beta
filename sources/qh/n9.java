package qh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class n9 extends FrameLayout {
    public final int f45810a;
    public Object f45811b;

    public n9(Context context) {
        super(context);
        this.f45810a = 2;
    }

    @Override
    public void addView(View view, int i10, int i11) {
        switch (this.f45810a) {
            case 3:
                super.addView(view, i10, i11);
                ((vg.f) this.f45811b).e();
                return;
            default:
                super.addView(view, i10, i11);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f45810a) {
            case 1:
                if (((rh.g) this.f45811b).f46857b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f45810a) {
            case 0:
                ba baVar = (ba) this.f45811b;
                if (getTranslationY() != f10 && baVar.Z0 != null) {
                    super.setTranslationY(f10);
                    baVar.Z0.y();
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public n9(Object obj, Context context, int i10) {
        super(context);
        this.f45810a = i10;
        this.f45811b = obj;
    }
}
