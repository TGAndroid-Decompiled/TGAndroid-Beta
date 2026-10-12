package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class zf implements View.OnClickListener {
    public final int f42608a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f42609b;

    public zf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f42608a = i10;
        this.f42609b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42608a) {
            case 0:
                this.f42609b.getSwipeBack().b(true);
                return;
            case 1:
                this.f42609b.getSwipeBack().b(true);
                return;
            default:
                this.f42609b.getSwipeBack().b(true);
                return;
        }
    }
}
