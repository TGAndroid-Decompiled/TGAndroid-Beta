package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ux implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f52648a;

    public ux(ExternalActionActivity externalActionActivity) {
        this.f52648a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f52648a;
        externalActionActivity.g();
        ActionBarLayout actionBarLayout = externalActionActivity.f43082c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
