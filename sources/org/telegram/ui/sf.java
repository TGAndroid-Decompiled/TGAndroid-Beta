package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class sf implements View.OnClickListener {
    public final int f40465a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f40466b;

    public sf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f40465a = i10;
        this.f40466b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40465a) {
            case 0:
                this.f40466b.getSwipeBack().b(true);
                return;
            case 1:
                this.f40466b.getSwipeBack().b(true);
                return;
            default:
                this.f40466b.getSwipeBack().b(true);
                return;
        }
    }
}
