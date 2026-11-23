package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class tx implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f52495a;

    public tx(ExternalActionActivity externalActionActivity) {
        this.f52495a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f52495a;
        externalActionActivity.g();
        ActionBarLayout actionBarLayout = externalActionActivity.f43161c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
