package wi;

import android.app.Activity;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.fn0;
public final class d extends FrameLayout {
    public final int f59978a;
    public final h f59979b;

    public d(h hVar, Activity activity, int i7) {
        super(activity);
        this.f59978a = i7;
        this.f59979b = hVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f59978a) {
            case 0:
                super.dispatchDraw(canvas);
                h hVar = this.f59979b;
                fn0 fn0Var = hVar.G;
                if (fn0Var != null && fn0Var.a()) {
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
        switch (this.f59978a) {
            case 0:
                h hVar = this.f59979b;
                a61 a61Var = hVar.F;
                if (a61Var.f33341j) {
                    a61Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    a61Var.draw(canvas);
                }
                canvas.save();
                canvas.translate(getLeft(), getTop());
                hVar.f59988b.j0(canvas, getRight() - getLeft(), getBottom() - getTop());
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }
}
