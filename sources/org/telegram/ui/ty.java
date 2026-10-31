package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ty implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f41969a;

    public ty(ExternalActionActivity externalActionActivity) {
        this.f41969a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f41969a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f33324c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
