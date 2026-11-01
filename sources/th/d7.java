package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
public final class d7 extends p {
    public final o7 d;

    public d7(Context context, o7 o7Var) {
        super(context);
        this.d = o7Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        o7 o7Var = this.d;
        z2 currentPeerView = o7Var.f49333n0.getCurrentPeerView();
        f4 f4Var = o7Var.f49356x;
        if (f4Var != null && currentPeerView != null) {
            g2 g2Var = currentPeerView.L0;
            f4Var.setOffset(o7Var.f49315e0);
            if (o7Var.f49356x.f48978f == 1.0f) {
                o7Var.f49333n0.setVisibility(4);
            } else {
                o7Var.f49333n0.setVisibility(0);
            }
            o7Var.f49333n0.B();
            float top = g2Var.getTop() + currentPeerView.getTop();
            float f10 = o7Var.f49356x.f48978f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (g2Var.getMeasuredHeight() > 0) {
                o7Var.f49340q1 = g2Var.getMeasuredHeight();
            }
            float T1 = org.telegram.messenger.i0.T1(1.0f, o7Var.f49356x.f48979n / o7Var.f49340q1, f10);
            o7Var.f49333n0.setPivotY(top);
            o7Var.f49333n0.setPivotX(getMeasuredWidth() / 2.0f);
            o7Var.f49333n0.setScaleX(T1);
            o7Var.f49333n0.setScaleY(T1);
            currentPeerView.E2 = true;
            if (o7Var.f49315e0 == 0.0f) {
                currentPeerView.V0(0.0f, 0.0f, null);
            } else {
                currentPeerView.V0(f10, T1, o7Var.f49356x.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.f49728h1.f46506b = (int) org.telegram.messenger.i0.T1(10.0f, 6.0f / f7, o7Var.f49356x.f48978f);
            g2Var.invalidateOutline();
            o7Var.f49333n0.setTranslationY((o7Var.f49356x.f48976b - top) * f10);
        }
        if (currentPeerView != null) {
            o7Var.f49314d1.setTranslationY(((currentPeerView.L0.getY() + currentPeerView.getY()) - o7Var.f49314d1.getTop()) - org.telegram.messenger.i0.L(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11);
        o7 o7Var = this.d;
        if (!o7Var.f49307b || o7Var.f49310c) {
            View rootView = getRootView();
            Rect rect = org.telegram.messenger.i0.Q;
            getWindowVisibleDisplayFrame(rect);
            int i13 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                int height = rootView.getHeight();
                if (rect.top != 0) {
                    i12 = org.telegram.messenger.i0.f16166m;
                } else {
                    i12 = 0;
                }
                i13 = Math.max(0, ((height - i12) - org.telegram.messenger.i0.q1(rootView)) - (rect.bottom - rect.top));
            }
            o7Var.h(i13);
            size += o7Var.f49337p0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i14 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i14) {
            o7Var.f49333n0.getLayoutParams().width = -1;
            size = i14;
        } else {
            int i15 = (int) ((size / 16.0f) * 9.0f);
            o7Var.f49333n0.getLayoutParams().width = i15;
            size2 = i15;
        }
        o7Var.f49359y0.getLayoutParams().height = size + 1;
        o7Var.f49359y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) o7Var.f49359y0.getLayoutParams()).topMargin = org.telegram.messenger.i0.f16166m;
        super.onMeasure(i10, i11);
    }
}
