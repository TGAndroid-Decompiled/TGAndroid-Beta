package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class sf implements View.OnClickListener {
    public final int f40470a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f40471b;

    public sf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f40470a = i10;
        this.f40471b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40470a) {
            case 0:
                this.f40471b.getSwipeBack().b(true);
                return;
            case 1:
                this.f40471b.getSwipeBack().b(true);
                return;
            default:
                this.f40471b.getSwipeBack().b(true);
                return;
        }
    }
}
