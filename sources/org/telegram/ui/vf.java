package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class vf implements View.OnClickListener {
    public final int f38410a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f38411b;

    public vf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f38410a = i10;
        this.f38411b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38410a) {
            case 0:
                this.f38411b.getSwipeBack().b(true);
                return;
            case 1:
                this.f38411b.getSwipeBack().b(true);
                return;
            default:
                this.f38411b.getSwipeBack().b(true);
                return;
        }
    }
}
