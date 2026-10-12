package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class tb implements ViewTreeObserver.OnPreDrawListener {
    public final View f42147a;
    public final s4.d1 f42148b;
    public final ub f42149c;

    public tb(ub ubVar, View view, s4.d1 d1Var) {
        this.f42149c = ubVar;
        this.f42147a = view;
        this.f42148b = d1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        View view = this.f42147a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        yb ybVar = this.f42149c.f42481n;
        int measuredHeight = ybVar.v.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        if (top >= 0) {
            i10 = 0;
        } else {
            i10 = -top;
        }
        int i11 = i10;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i11 + measuredHeight;
        }
        View view2 = this.f42148b.f47897a;
        if (view2 instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).b4(i11, measuredHeight2 - i11, (ybVar.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - ybVar.v.getTop(), 0.0f, (view.getY() + yb.G0(ybVar).getMeasuredHeight()) - ybVar.X.getBackgroundTranslationY(), ybVar.X.getMeasuredWidth(), ybVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof org.telegram.ui.Cells.w0) && yb.H0(ybVar) != null && ybVar.X != null) {
            ((org.telegram.ui.Cells.w0) view).a0((view.getY() + yb.I0(ybVar).getMeasuredHeight()) - ybVar.X.getBackgroundTranslationY(), ybVar.X.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}
