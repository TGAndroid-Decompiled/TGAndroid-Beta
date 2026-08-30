package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.pt;
public final class e1 extends sl0 {
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
                li liVar = ((uf.c0) this.V2).f24278b;
                int dp = AndroidUtilities.dp(30.0f) + liVar.Y1[0];
                if (!liVar.f26692d0) {
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
                e1 e1Var = dfVar.f43821c;
                if (e1Var.getLayoutManager() != null && e1Var.getAdapter() != null && e1Var.getAdapter().h() != 0) {
                    float dp = dfVar.h - AndroidUtilities.dp(8.0f);
                    dfVar.e = dp - AndroidUtilities.dp(16.0f);
                    pg.b bVar = dfVar.f43824r;
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
                pt q10 = pt.q();
                i1 i1Var = (i1) this.V2;
                boolean r10 = q10.r(motionEvent, i1Var.f41733b, i1Var.f41735f, this.f28750m2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public e1(uf.c0 c0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.U2 = 2;
        this.V2 = c0Var;
    }

    private final void w1(int i10, int i11) {
    }
}
