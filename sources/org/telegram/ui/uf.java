package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class uf implements View.OnClickListener {
    public final int f37253a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f37254b;

    public uf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f37253a = i10;
        this.f37254b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37253a) {
            case 0:
                this.f37254b.getSwipeBack().b(true);
                return;
            case 1:
                this.f37254b.getSwipeBack().b(true);
                return;
            default:
                this.f37254b.getSwipeBack().b(true);
                return;
        }
    }
}
