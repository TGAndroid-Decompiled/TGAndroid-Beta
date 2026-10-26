package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class rb implements ViewTreeObserver.OnPreDrawListener {
    public final View f43090a;
    public final s4.e1 f43091b;
    public final sb f43092c;

    public rb(sb sbVar, View view, s4.e1 e1Var) {
        this.f43092c = sbVar;
        this.f43090a = view;
        this.f43091b = e1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        View view = this.f43090a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        wb wbVar = this.f43092c.f43444n;
        int measuredHeight = wbVar.v.getMeasuredHeight();
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
        View view2 = this.f43091b.f47738a;
        if (view2 instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) view).d4(i11, measuredHeight2 - i11, (wbVar.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - wbVar.v.getTop(), 0.0f, (view.getY() + wb.H0(wbVar).getMeasuredHeight()) - wbVar.X.getBackgroundTranslationY(), wbVar.X.getMeasuredWidth(), wbVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof org.telegram.ui.Cells.v0) && wb.I0(wbVar) != null && wbVar.X != null) {
            ((org.telegram.ui.Cells.v0) view).Y((view.getY() + wb.J0(wbVar).getMeasuredHeight()) - wbVar.X.getBackgroundTranslationY(), wbVar.X.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}
