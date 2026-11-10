package ti;

import android.app.Activity;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.qm0;
public final class e extends FrameLayout {
    public final int f56084a;
    public final i f56085b;

    public e(i iVar, Activity activity, int i7) {
        super(activity);
        this.f56084a = i7;
        this.f56085b = iVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f56084a) {
            case 0:
                super.dispatchDraw(canvas);
                i iVar = this.f56085b;
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
        switch (this.f56084a) {
            case 0:
                i iVar = this.f56085b;
                k51 k51Var = iVar.F;
                if (k51Var.f35178j) {
                    k51Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    k51Var.draw(canvas);
                }
                canvas.save();
                canvas.translate(getLeft(), getTop());
                iVar.f56094b.c0(canvas, getRight() - getLeft(), getBottom() - getTop());
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }
}
