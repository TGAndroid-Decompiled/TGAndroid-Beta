package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class tf implements View.OnClickListener {
    public final int f40767a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f40768b;

    public tf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.f40767a = i10;
        this.f40768b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40767a) {
            case 0:
                this.f40768b.getSwipeBack().b(true);
                return;
            case 1:
                this.f40768b.getSwipeBack().b(true);
                return;
            default:
                this.f40768b.getSwipeBack().b(true);
                return;
        }
    }
}
