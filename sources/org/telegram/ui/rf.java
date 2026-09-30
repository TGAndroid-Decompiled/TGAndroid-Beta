package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class rf implements View.OnClickListener {
    public final int f37425a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f37426b;

    public rf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f37425a = i10;
        this.f37426b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37425a) {
            case 0:
                this.f37426b.getSwipeBack().b(true);
                return;
            case 1:
                this.f37426b.getSwipeBack().b(true);
                return;
            default:
                this.f37426b.getSwipeBack().b(true);
                return;
        }
    }
}
