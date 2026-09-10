package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class j7 extends p {
    public final u7 d;

    public j7(Context context, u7 u7Var) {
        super(context);
        this.d = u7Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        u7 u7Var = this.d;
        a3 currentPeerView = u7Var.f48947n0.getCurrentPeerView();
        g4 g4Var = u7Var.f48967w;
        if (g4Var != null && currentPeerView != null) {
            h2 h2Var = currentPeerView.f48160c1;
            g4Var.setOffset(u7Var.f48929e0);
            if (u7Var.f48967w.f48443f == 1.0f) {
                u7Var.f48947n0.setVisibility(4);
            } else {
                u7Var.f48947n0.setVisibility(0);
            }
            u7Var.f48947n0.B();
            float top = h2Var.getTop() + currentPeerView.getTop();
            float f10 = u7Var.f48967w.f48443f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (h2Var.getMeasuredHeight() > 0) {
                u7Var.f48954q1 = h2Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, u7Var.f48967w.f48444n / u7Var.f48954q1, f10);
            u7Var.f48947n0.setPivotY(top);
            u7Var.f48947n0.setPivotX(getMeasuredWidth() / 2.0f);
            u7Var.f48947n0.setScaleX(lerp);
            u7Var.f48947n0.setScaleY(lerp);
            currentPeerView.V2 = true;
            if (u7Var.f48929e0 == 0.0f) {
                currentPeerView.X0(0.0f, 0.0f, null);
            } else {
                currentPeerView.X0(f10, lerp, u7Var.f48967w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.f48229y1.f45148b = (int) AndroidUtilities.lerp(10.0f, 6.0f / f7, u7Var.f48967w.f48443f);
            h2Var.invalidateOutline();
            u7Var.f48947n0.setTranslationY((u7Var.f48967w.f48441b - top) * f10);
        }
        if (currentPeerView != null) {
            u7Var.f48928d1.setTranslationY(((currentPeerView.f48160c1.getY() + currentPeerView.getY()) - u7Var.f48928d1.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11);
        u7 u7Var = this.d;
        if (!u7Var.f48921b || u7Var.f48924c) {
            View rootView = getRootView();
            Rect rect = AndroidUtilities.rectTmp2;
            getWindowVisibleDisplayFrame(rect);
            int i13 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                int height = rootView.getHeight();
                if (rect.top != 0) {
                    i12 = AndroidUtilities.statusBarHeight;
                } else {
                    i12 = 0;
                }
                i13 = Math.max(0, ((height - i12) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
            }
            u7Var.setKeyboardHeightFromParent(i13);
            size += u7Var.f48951p0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i14 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i14) {
            u7Var.f48947n0.getLayoutParams().width = -1;
            size = i14;
        } else {
            int i15 = (int) ((size / 16.0f) * 9.0f);
            u7Var.f48947n0.getLayoutParams().width = i15;
            size2 = i15;
        }
        u7Var.f48973y0.getLayoutParams().height = size + 1;
        u7Var.f48973y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) u7Var.f48973y0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
