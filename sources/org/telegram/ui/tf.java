package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class tf implements View.OnClickListener {
    public final int f37658a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f37659b;

    public tf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f37658a = i10;
        this.f37659b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37658a) {
            case 0:
                this.f37659b.getSwipeBack().b(true);
                return;
            case 1:
                this.f37659b.getSwipeBack().b(true);
                return;
            default:
                this.f37659b.getSwipeBack().b(true);
                return;
        }
    }
}
