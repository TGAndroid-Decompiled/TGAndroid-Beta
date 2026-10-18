package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class zy implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f43866a;

    public zy(ExternalActionActivity externalActionActivity) {
        this.f43866a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f43866a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f33129c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
