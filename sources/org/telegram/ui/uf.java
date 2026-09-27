package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class uf implements View.OnClickListener {
    public final int f38241a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f38242b;

    public uf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f38241a = i10;
        this.f38242b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38241a) {
            case 0:
                this.f38242b.getSwipeBack().b(true);
                return;
            case 1:
                this.f38242b.getSwipeBack().b(true);
                return;
            default:
                this.f38242b.getSwipeBack().b(true);
                return;
        }
    }
}
