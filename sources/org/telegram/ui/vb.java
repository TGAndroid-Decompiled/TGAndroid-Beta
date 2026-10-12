package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class vb implements ViewTreeObserver.OnPreDrawListener {
    public final View f40951a;
    public final s4.b1 f40952b;
    public final wb f40953c;

    public vb(wb wbVar, View view, s4.b1 b1Var) {
        this.f40953c = wbVar;
        this.f40951a = view;
        this.f40952b = b1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        View view = this.f40951a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ac acVar = this.f40953c.f41234n;
        int measuredHeight = acVar.v.getMeasuredHeight();
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
        View view2 = this.f40952b.f44838a;
        if (view2 instanceof org.telegram.ui.Cells.u1) {
            int heightWithKeyboard = (acVar.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - acVar.v.getTop();
            float y3 = view.getY();
            kVar3 = ((org.telegram.ui.ActionBar.m2) acVar).actionBar;
            ((org.telegram.ui.Cells.u1) view).b4(i11, measuredHeight2 - i11, heightWithKeyboard, 0.0f, (y3 + kVar3.getMeasuredHeight()) - acVar.X.getBackgroundTranslationY(), acVar.X.getMeasuredWidth(), acVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if (view2 instanceof org.telegram.ui.Cells.x0) {
            kVar = ((org.telegram.ui.ActionBar.m2) acVar).actionBar;
            if (kVar != null && acVar.X != null) {
                org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) view;
                float y10 = view.getY();
                kVar2 = ((org.telegram.ui.ActionBar.m2) acVar).actionBar;
                x0Var.a0((y10 + kVar2.getMeasuredHeight()) - acVar.X.getBackgroundTranslationY(), acVar.X.getBackgroundSizeY());
                return true;
            }
            return true;
        } else {
            return true;
        }
    }
}
