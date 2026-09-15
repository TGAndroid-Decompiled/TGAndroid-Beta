package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class tf implements View.OnClickListener {
    public final int f37663a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f37664b;

    public tf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f37663a = i10;
        this.f37664b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37663a) {
            case 0:
                this.f37664b.getSwipeBack().b(true);
                return;
            case 1:
                this.f37664b.getSwipeBack().b(true);
                return;
            default:
                this.f37664b.getSwipeBack().b(true);
                return;
        }
    }
}
