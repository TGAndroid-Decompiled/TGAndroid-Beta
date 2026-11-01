package xh;

import android.content.Context;
import android.widget.FrameLayout;
public final class d2 extends i3 {
    public final int f53746c0;
    public final Object f53747d0;

    public d2(Object obj, Context context, int i10) {
        super(context);
        this.f53746c0 = i10;
        this.f53747d0 = obj;
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: xh.d2.onMeasure(int, int):void");
    }

    @Override
    public void requestLayout() {
        switch (this.f53746c0) {
            case 0:
                if (!((m2) this.f53747d0).G) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f53746c0) {
            case 0:
                super.setTranslationY(f7);
                m2 m2Var = (m2) this.f53747d0;
                org.telegram.messenger.l2 l2Var = m2Var.f53908n0;
                if (l2Var != null) {
                    l2Var.setTranslationY(org.telegram.messenger.i0.L(24.0f) + f7);
                }
                FrameLayout frameLayout = m2Var.f53911q0;
                if (frameLayout != null) {
                    int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.i0.L(24.0f);
                    int L = org.telegram.messenger.i0.L(70.0f) + m2Var.f53907n.top;
                    frameLayout.setTranslationY(m2Var.f53921x.getTranslationY() + org.telegram.messenger.i0.W1(m2Var.f53901g0, currentActionBarHeight, L));
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
