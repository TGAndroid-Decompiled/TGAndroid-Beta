package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.cg0;
import yh.j2;
import yh.y3;
import yh.z7;
public final class j1 extends FrameLayout {
    public final int f46150a;
    public final Object f46151b;

    public j1(Object obj, Context context, int i10) {
        super(context);
        this.f46150a = i10;
        this.f46151b = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f46150a) {
            case 3:
                if (((z7) this.f46151b).f52373r0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f46150a) {
            case 4:
                super.onDraw(canvas);
                zg.o oVar = (zg.o) this.f46151b;
                if (oVar.f53509x > 0) {
                    canvas.drawRect(0.0f, getHeight() - oVar.f53509x, getWidth(), getHeight(), oVar.f53510y);
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f46150a) {
            case 4:
                super.onLayout(z10, i10, i11, i12, i13);
                zg.o oVar = (zg.o) this.f46151b;
                if (oVar.N && z10) {
                    oVar.e0(oVar.P.f15436e);
                    return;
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        float f7;
        float top;
        int measuredHeight;
        ei.g gVar;
        switch (this.f46150a) {
            case 0:
                super.onMeasure(i10, i11);
                m1 m1Var = ((l1) this.f46151b).f46198c;
                cg0 cg0Var = m1Var.f46216r0;
                if (cg0Var != null) {
                    top = cg0Var.getTop();
                    measuredHeight = m1Var.f46216r0.getMeasuredHeight();
                } else {
                    View view = m1Var.B0;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = m1Var.B0.getMeasuredHeight();
                    } else {
                        f7 = 0.0f;
                        m1Var.f46215q0.setTranslationY(f7 - (gVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f7 = (measuredHeight / 2.0f) + top;
                m1Var.f46215q0.setTranslationY(f7 - (gVar.getMeasuredHeight() / 2.0f));
                return;
            case 1:
                super.onMeasure(i10, i11);
                ((xh.i1) this.f46151b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f46150a) {
            case 2:
                super.setTranslationY(f7);
                y3 y3Var = (y3) this.f46151b;
                j2 j2Var = y3Var.f52286d0;
                if (j2Var != null && j2Var.getVisibility() == 0) {
                    y3Var.f52286d0.invalidate();
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public j1(zg.o oVar, Context context) {
        super(context);
        this.f46150a = 4;
        this.f46151b = oVar;
        setWillNotDraw(false);
    }
}
