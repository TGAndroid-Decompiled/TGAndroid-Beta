package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class tf implements View.OnClickListener {
    public final int f42178a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f42179b;

    public tf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f42178a = i10;
        this.f42179b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42178a) {
            case 0:
                this.f42179b.getSwipeBack().b(true);
                return;
            case 1:
                this.f42179b.getSwipeBack().b(true);
                return;
            default:
                this.f42179b.getSwipeBack().b(true);
                return;
        }
    }
}
