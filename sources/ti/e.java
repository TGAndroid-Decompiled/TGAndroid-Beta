package ti;

import android.app.Activity;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.qm0;
public final class e extends FrameLayout {
    public final int f55956a;
    public final i f55957b;

    public e(i iVar, Activity activity, int i7) {
        super(activity);
        this.f55956a = i7;
        this.f55957b = iVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f55956a) {
            case 0:
                super.dispatchDraw(canvas);
                i iVar = this.f55957b;
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
        switch (this.f55956a) {
            case 0:
                i iVar = this.f55957b;
                e51 e51Var = iVar.F;
                if (e51Var.f33151j) {
                    e51Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    e51Var.draw(canvas);
                }
                canvas.save();
                canvas.translate(getLeft(), getTop());
                iVar.f55966b.c0(canvas, getRight() - getLeft(), getBottom() - getTop());
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }
}
