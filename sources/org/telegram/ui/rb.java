package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class rb implements ViewTreeObserver.OnPreDrawListener {
    public final View f36324a;
    public final s4.c1 f36325b;
    public final sb f36326c;

    public rb(sb sbVar, View view, s4.c1 c1Var) {
        this.f36326c = sbVar;
        this.f36324a = view;
        this.f36325b = c1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        View view = this.f36324a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        wb wbVar = this.f36326c.f36638n;
        int measuredHeight = wbVar.E.getMeasuredHeight();
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
        View view2 = this.f36325b.f41610a;
        if (view2 instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) view).b4(i10, measuredHeight2 - i10, (wbVar.f37792b0.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - wbVar.E.getTop(), 0.0f, (view.getY() + wb.G0(wbVar).getMeasuredHeight()) - wbVar.f37792b0.getBackgroundTranslationY(), wbVar.f37792b0.getMeasuredWidth(), wbVar.f37792b0.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof org.telegram.ui.Cells.w0) && wb.H0(wbVar) != null && wbVar.f37792b0 != null) {
            ((org.telegram.ui.Cells.w0) view).W((view.getY() + wb.I0(wbVar).getMeasuredHeight()) - wbVar.f37792b0.getBackgroundTranslationY(), wbVar.f37792b0.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}
