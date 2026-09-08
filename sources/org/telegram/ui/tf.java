package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class tf implements View.OnClickListener {
    public final int f40766a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f40767b;

    public tf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f40766a = i10;
        this.f40767b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40766a) {
            case 0:
                this.f40767b.getSwipeBack().b(true);
                return;
            case 1:
                this.f40767b.getSwipeBack().b(true);
                return;
            default:
                this.f40767b.getSwipeBack().b(true);
                return;
        }
    }
}
