package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class sf implements View.OnClickListener {
    public final int f37273a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f37274b;

    public sf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f37273a = i10;
        this.f37274b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37273a) {
            case 0:
                this.f37274b.getSwipeBack().b(true);
                return;
            case 1:
                this.f37274b.getSwipeBack().b(true);
                return;
            default:
                this.f37274b.getSwipeBack().b(true);
                return;
        }
    }
}
