package ph;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class q9 extends FrameLayout {
    public final int f42253a;
    public Object f42254b;

    public q9(Context context) {
        super(context);
        this.f42253a = 2;
    }

    @Override
    public void addView(View view, int i10, int i11) {
        switch (this.f42253a) {
            case 3:
                super.addView(view, i10, i11);
                ((ug.f) this.f42254b).e();
                return;
            default:
                super.addView(view, i10, i11);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f42253a) {
            case 1:
                if (((qh.g) this.f42254b).f43101b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f42253a) {
            case 0:
                da daVar = (da) this.f42254b;
                if (getTranslationY() != f10 && daVar.Z0 != null) {
                    super.setTranslationY(f10);
                    daVar.Z0.y();
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public q9(Object obj, Context context, int i10) {
        super(context);
        this.f42253a = i10;
        this.f42254b = obj;
    }
}
