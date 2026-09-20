package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class uf implements View.OnClickListener {
    public final int f38079a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f38080b;

    public uf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f38079a = i10;
        this.f38080b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38079a) {
            case 0:
                this.f38080b.getSwipeBack().b(true);
                return;
            case 1:
                this.f38080b.getSwipeBack().b(true);
                return;
            default:
                this.f38080b.getSwipeBack().b(true);
                return;
        }
    }
}
