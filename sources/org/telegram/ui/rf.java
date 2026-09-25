package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class rf implements View.OnClickListener {
    public final int f37324a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f37325b;

    public rf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f37324a = i10;
        this.f37325b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37324a) {
            case 0:
                this.f37325b.getSwipeBack().b(true);
                return;
            case 1:
                this.f37325b.getSwipeBack().b(true);
                return;
            default:
                this.f37325b.getSwipeBack().b(true);
                return;
        }
    }
}
