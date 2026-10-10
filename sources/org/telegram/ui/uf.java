package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class uf implements View.OnClickListener {
    public final int f42467a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f42468b;

    public uf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f42467a = i10;
        this.f42468b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42467a) {
            case 0:
                this.f42468b.getSwipeBack().b(true);
                return;
            case 1:
                this.f42468b.getSwipeBack().b(true);
                return;
            default:
                this.f42468b.getSwipeBack().b(true);
                return;
        }
    }
}
