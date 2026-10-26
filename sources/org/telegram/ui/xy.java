package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class xy implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f45900a;

    public xy(ExternalActionActivity externalActionActivity) {
        this.f45900a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f45900a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f35502c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
