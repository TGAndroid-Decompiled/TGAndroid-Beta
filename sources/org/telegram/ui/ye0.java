package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public abstract class ye0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public TLRPC.User f52264a;
    public org.telegram.ui.Components.s70 f52265b;
    public org.telegram.ui.Components.iz f52266c;
    public boolean d;
    public int f52267e;

    @Override
    public final void onMeasure(int i3, int i10) {
        org.telegram.ui.Components.s70 s70Var = this.f52265b;
        org.telegram.ui.Components.iz izVar = this.f52266c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), 1073741824);
        boolean z10 = true;
        this.d = true;
        if (izVar.getVisibility() != 0) {
            z10 = false;
        }
        s70Var.setVisibility(8);
        if (z10) {
            izVar.setVisibility(8);
        }
        super.onMeasure(i3, makeMeasureSpec);
        if (z10) {
            izVar.getLayoutParams().width = getMeasuredWidth();
            izVar.setVisibility(0);
        }
        s70Var.setVisibility(0);
        s70Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
        this.d = false;
        super.onMeasure(i3, makeMeasureSpec);
    }

    @Override
    public final void requestLayout() {
        if (this.d) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I5, false);
            if (x02 != this.f52267e) {
                this.f52267e = x02;
                org.telegram.ui.ActionBar.k6.H1(getBackground(), x02, true);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
