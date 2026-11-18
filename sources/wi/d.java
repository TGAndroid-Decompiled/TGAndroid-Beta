package wi;

import android.app.Activity;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.x51;
public final class d extends FrameLayout {
    public final int f59937a;
    public final h f59938b;

    public d(h hVar, Activity activity, int i7) {
        super(activity);
        this.f59937a = i7;
        this.f59938b = hVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f59937a) {
            case 0:
                super.dispatchDraw(canvas);
                h hVar = this.f59938b;
                cn0 cn0Var = hVar.G;
                if (cn0Var != null && cn0Var.a()) {
                    hVar.G.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    hVar.G.draw(canvas);
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
        throw new UnsupportedOperationException("Method not decompiled: wi.d.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f59937a) {
            case 0:
                h hVar = this.f59938b;
                x51 x51Var = hVar.F;
                if (x51Var.f41915j) {
                    x51Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    x51Var.draw(canvas);
                }
                canvas.save();
                canvas.translate(getLeft(), getTop());
                hVar.f59947b.j0(canvas, getRight() - getLeft(), getBottom() - getTop());
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }
}
