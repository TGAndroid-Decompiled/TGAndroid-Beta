package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class sb implements ViewTreeObserver.OnPreDrawListener {
    public final View f41052a;
    public final s4.b1 f41053b;
    public final tb f41054c;

    public sb(tb tbVar, View view, s4.b1 b1Var) {
        this.f41054c = tbVar;
        this.f41052a = view;
        this.f41053b = b1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        View view = this.f41052a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        xb xbVar = this.f41054c.f41642n;
        int measuredHeight = xbVar.v.getMeasuredHeight();
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
        View view2 = this.f41053b.f45938a;
        if (view2 instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).b4(i11, measuredHeight2 - i11, (xbVar.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - xbVar.v.getTop(), 0.0f, (view.getY() + xb.G0(xbVar).getMeasuredHeight()) - xbVar.X.getBackgroundTranslationY(), xbVar.X.getMeasuredWidth(), xbVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof org.telegram.ui.Cells.x0) && xb.H0(xbVar) != null && xbVar.X != null) {
            ((org.telegram.ui.Cells.x0) view).a0((view.getY() + xb.I0(xbVar).getMeasuredHeight()) - xbVar.X.getBackgroundTranslationY(), xbVar.X.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}
