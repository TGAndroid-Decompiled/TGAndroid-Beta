package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class rb implements ViewTreeObserver.OnPreDrawListener {
    public final View f42908a;
    public final s4.e1 f42909b;
    public final sb f42910c;

    public rb(sb sbVar, View view, s4.e1 e1Var) {
        this.f42910c = sbVar;
        this.f42908a = view;
        this.f42909b = e1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        View view = this.f42908a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        wb wbVar = this.f42910c.f43288n;
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
        View view2 = this.f42909b.f47773a;
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
