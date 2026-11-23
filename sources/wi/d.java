package wi;

import android.app.Activity;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.z51;
public final class d extends FrameLayout {
    public final int f60065a;
    public final h f60066b;

    public d(h hVar, Activity activity, int i7) {
        super(activity);
        this.f60065a = i7;
        this.f60066b = hVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f60065a) {
            case 0:
                super.dispatchDraw(canvas);
                h hVar = this.f60066b;
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
        switch (this.f60065a) {
            case 0:
                h hVar = this.f60066b;
                z51 z51Var = hVar.F;
                if (z51Var.f42712j) {
                    z51Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    z51Var.draw(canvas);
                }
                canvas.save();
                canvas.translate(getLeft(), getTop());
                hVar.f60075b.t2(canvas, getRight() - getLeft(), getBottom() - getTop());
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }
}
