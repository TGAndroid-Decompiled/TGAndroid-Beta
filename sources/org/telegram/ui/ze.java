package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ze implements View.OnClickListener {
    public final int f52667a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f52668b;

    public ze(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i3) {
        this.f52667a = i3;
        this.f52668b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52667a) {
            case 0:
                this.f52668b.getSwipeBack().b(true);
                return;
            case 1:
                this.f52668b.getSwipeBack().b(true);
                return;
            default:
                this.f52668b.getSwipeBack().b(true);
                return;
        }
    }
}
