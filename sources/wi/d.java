package wi;

import android.app.Activity;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.um0;
public final class d extends FrameLayout {
    public final int f59372a;
    public final h f59373b;

    public d(h hVar, Activity activity, int i7) {
        super(activity);
        this.f59372a = i7;
        this.f59373b = hVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f59372a) {
            case 0:
                super.dispatchDraw(canvas);
                h hVar = this.f59373b;
                um0 um0Var = hVar.G;
                if (um0Var != null && um0Var.a()) {
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
        switch (this.f59372a) {
            case 0:
                h hVar = this.f59373b;
                m51 m51Var = hVar.F;
                if (m51Var.f37069j) {
                    m51Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    m51Var.draw(canvas);
                }
                canvas.save();
                canvas.translate(getLeft(), getTop());
                hVar.f59382b.o0(canvas, getRight() - getLeft(), getBottom() - getTop());
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }
}
