package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class rf implements View.OnClickListener {
    public final int f37322a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f37323b;

    public rf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f37322a = i10;
        this.f37323b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37322a) {
            case 0:
                this.f37323b.getSwipeBack().b(true);
                return;
            case 1:
                this.f37323b.getSwipeBack().b(true);
                return;
            default:
                this.f37323b.getSwipeBack().b(true);
                return;
        }
    }
}
