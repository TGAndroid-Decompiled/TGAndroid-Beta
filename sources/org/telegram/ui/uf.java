package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class uf implements View.OnClickListener {
    public final int f42423a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f42424b;

    public uf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f42423a = i10;
        this.f42424b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42423a) {
            case 0:
                this.f42424b.getSwipeBack().b(true);
                return;
            case 1:
                this.f42424b.getSwipeBack().b(true);
                return;
            default:
                this.f42424b.getSwipeBack().b(true);
                return;
        }
    }
}
