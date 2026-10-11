package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class tf implements View.OnClickListener {
    public final int f42212a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f42213b;

    public tf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f42212a = i10;
        this.f42213b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42212a) {
            case 0:
                this.f42213b.getSwipeBack().b(true);
                return;
            case 1:
                this.f42213b.getSwipeBack().b(true);
                return;
            default:
                this.f42213b.getSwipeBack().b(true);
                return;
        }
    }
}
