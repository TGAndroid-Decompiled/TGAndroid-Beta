package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class rx implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f51049a;

    public rx(ExternalActionActivity externalActionActivity) {
        this.f51049a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f51049a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f42596c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
