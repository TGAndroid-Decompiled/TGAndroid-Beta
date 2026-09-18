package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class rb implements ViewTreeObserver.OnPreDrawListener {
    public final View f37178a;
    public final s4.c1 f37179b;
    public final sb f37180c;

    public rb(sb sbVar, View view, s4.c1 c1Var) {
        this.f37180c = sbVar;
        this.f37178a = view;
        this.f37179b = c1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        View view = this.f37178a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        wb wbVar = this.f37180c.f37452n;
        int measuredHeight = wbVar.v.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        if (top >= 0) {
            i10 = 0;
        } else {
            i10 = -top;
        }
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i10 + measuredHeight;
        }
        View view2 = this.f37179b.f42702a;
        if (view2 instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) view).b4(i10, measuredHeight2 - i10, (wbVar.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - wbVar.v.getTop(), 0.0f, (view.getY() + wb.G0(wbVar).getMeasuredHeight()) - wbVar.X.getBackgroundTranslationY(), wbVar.X.getMeasuredWidth(), wbVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof org.telegram.ui.Cells.w0) && wb.H0(wbVar) != null && wbVar.X != null) {
            ((org.telegram.ui.Cells.w0) view).W((view.getY() + wb.I0(wbVar).getMeasuredHeight()) - wbVar.X.getBackgroundTranslationY(), wbVar.X.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}
