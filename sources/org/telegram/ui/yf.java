package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class yf implements View.OnClickListener {
    public final int f44471a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f44472b;

    public yf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f44471a = i10;
        this.f44472b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44471a) {
            case 0:
                this.f44472b.getSwipeBack().b(true);
                return;
            case 1:
                this.f44472b.getSwipeBack().b(true);
                return;
            default:
                this.f44472b.getSwipeBack().b(true);
                return;
        }
    }
}
