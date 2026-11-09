package ti;

import android.app.Activity;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.rm0;
public final class e extends FrameLayout {
    public final int f56085a;
    public final i f56086b;

    public e(i iVar, Activity activity, int i7) {
        super(activity);
        this.f56085a = i7;
        this.f56086b = iVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f56085a) {
            case 0:
                super.dispatchDraw(canvas);
                i iVar = this.f56086b;
                rm0 rm0Var = iVar.G;
                if (rm0Var != null && rm0Var.a()) {
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
        switch (this.f56085a) {
            case 0:
                i iVar = this.f56086b;
                k51 k51Var = iVar.F;
                if (k51Var.f35251j) {
                    k51Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    k51Var.draw(canvas);
                }
                canvas.save();
                canvas.translate(getLeft(), getTop());
                iVar.f56095b.c0(canvas, getRight() - getLeft(), getBottom() - getTop());
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }
}
