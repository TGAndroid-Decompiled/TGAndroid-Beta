package ti;

import android.app.Activity;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.qm0;
public final class e extends FrameLayout {
    public final int f55981a;
    public final i f55982b;

    public e(i iVar, Activity activity, int i7) {
        super(activity);
        this.f55981a = i7;
        this.f55982b = iVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f55981a) {
            case 0:
                super.dispatchDraw(canvas);
                i iVar = this.f55982b;
                qm0 qm0Var = iVar.G;
                if (qm0Var != null && qm0Var.a()) {
                    iVar.G.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    iVar.G.draw(canvas);
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: ti.e.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f55981a) {
            case 0:
                i iVar = this.f55982b;
                i51 i51Var = iVar.F;
                if (i51Var.f34466j) {
                    i51Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    i51Var.draw(canvas);
                }
                canvas.save();
                canvas.translate(getLeft(), getTop());
                iVar.f55991b.c0(canvas, getRight() - getLeft(), getBottom() - getTop());
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }
}
