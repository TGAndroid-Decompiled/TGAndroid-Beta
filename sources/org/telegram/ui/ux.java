package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ux implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f52640a;

    public ux(ExternalActionActivity externalActionActivity) {
        this.f52640a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f52640a;
        externalActionActivity.g();
        ActionBarLayout actionBarLayout = externalActionActivity.f43041c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
