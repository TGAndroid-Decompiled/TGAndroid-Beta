package vh;

import android.content.Context;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gr;
public final class d6 extends FrameLayout {
    public final int f51094a = 0;
    public final org.telegram.ui.Components.t5 f51095b;
    public float f51096c;
    public final Path d;
    public final org.telegram.ui.ActionBar.z2 e;

    public d6(yh.z zVar, Context context) {
        super(context);
        this.e = zVar;
        this.f51095b = new org.telegram.ui.Components.t5(this, 250L, gr.h);
        this.d = new Path();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: vh.d6.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f51094a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f51096c) {
                    ((w6) this.e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f51096c) {
                    ((yh.z) this.e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f51094a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
        }
    }

    public d6(w6 w6Var, Context context) {
        super(context);
        this.e = w6Var;
        this.f51095b = new org.telegram.ui.Components.t5(this, 250L, gr.h);
        this.d = new Path();
    }
}
