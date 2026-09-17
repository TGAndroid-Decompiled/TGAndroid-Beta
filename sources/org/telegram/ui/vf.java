package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class vf implements View.OnClickListener {
    public final int f38405a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f38406b;

    public vf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f38405a = i10;
        this.f38406b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38405a) {
            case 0:
                this.f38406b.getSwipeBack().b(true);
                return;
            case 1:
                this.f38406b.getSwipeBack().b(true);
                return;
            default:
                this.f38406b.getSwipeBack().b(true);
                return;
        }
    }
}
