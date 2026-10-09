package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class uf implements View.OnClickListener {
    public final int f42421a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f42422b;

    public uf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f42421a = i10;
        this.f42422b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42421a) {
            case 0:
                this.f42422b.getSwipeBack().b(true);
                return;
            case 1:
                this.f42422b.getSwipeBack().b(true);
                return;
            default:
                this.f42422b.getSwipeBack().b(true);
                return;
        }
    }
}
