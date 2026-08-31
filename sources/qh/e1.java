package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.qt;
public final class e1 extends tl0 {
    public final int U2;
    public final FrameLayout V2;

    public e1(FrameLayout frameLayout, Context context, int i10) {
        super(context, null);
        this.U2 = i10;
        this.V2 = frameLayout;
    }

    @Override
    public boolean E0(float f10) {
        int i10;
        switch (this.U2) {
            case 2:
                mi miVar = ((vf.c0) this.V2).f26546b;
                int dp = AndroidUtilities.dp(30.0f) + miVar.Y1[0];
                if (!miVar.f29043d0) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                if (f10 < dp + i10) {
                    return false;
                }
                return true;
            default:
                return super.E0(f10);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.U2) {
            case 1:
                df dfVar = (df) this.V2;
                e1 e1Var = dfVar.f47737c;
                if (e1Var.getLayoutManager() != null && e1Var.getAdapter() != null && e1Var.getAdapter().h() != 0) {
                    float dp = dfVar.h - AndroidUtilities.dp(8.0f);
                    dfVar.f47738e = dp - AndroidUtilities.dp(16.0f);
                    qg.b bVar = dfVar.f47741r;
                    if (bVar != null) {
                        bVar.draw(canvas);
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(12.0f), dp - AndroidUtilities.dp(4.0f), (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(12.0f), dp);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), dfVar.d);
                    super.dispatchDraw(canvas);
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void k0(int i10, int i11) {
        int i12 = this.U2;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.U2) {
            case 0:
                qt q10 = qt.q();
                i1 i1Var = (i1) this.V2;
                boolean r10 = q10.r(motionEvent, i1Var.f45401b, i1Var.f45404f, this.f31383m2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public e1(vf.c0 c0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.U2 = 2;
        this.V2 = c0Var;
    }

    private final void w1(int i10, int i11) {
    }
}
