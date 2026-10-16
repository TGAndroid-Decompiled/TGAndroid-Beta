package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class zf implements View.OnClickListener {
    public final int f42302a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f42303b;

    public zf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f42302a = i10;
        this.f42303b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42302a) {
            case 0:
                this.f42303b.getSwipeBack().b(true);
                return;
            case 1:
                this.f42303b.getSwipeBack().b(true);
                return;
            default:
                this.f42303b.getSwipeBack().b(true);
                return;
        }
    }
}
