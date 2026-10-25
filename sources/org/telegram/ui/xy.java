package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class xy implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f45897a;

    public xy(ExternalActionActivity externalActionActivity) {
        this.f45897a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f45897a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f35499c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
