package wi;

import android.app.Activity;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.en0;
public final class d extends FrameLayout {
    public final int f59947a;
    public final h f59948b;

    public d(h hVar, Activity activity, int i7) {
        super(activity);
        this.f59947a = i7;
        this.f59948b = hVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f59947a) {
            case 0:
                super.dispatchDraw(canvas);
                h hVar = this.f59948b;
                en0 en0Var = hVar.G;
                if (en0Var != null && en0Var.a()) {
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
        switch (this.f59947a) {
            case 0:
                h hVar = this.f59948b;
                a61 a61Var = hVar.F;
                if (a61Var.f33320j) {
                    a61Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    a61Var.draw(canvas);
                }
                canvas.save();
                canvas.translate(getLeft(), getTop());
                hVar.f59957b.j0(canvas, getRight() - getLeft(), getBottom() - getTop());
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }
}
