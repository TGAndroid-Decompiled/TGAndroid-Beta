package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class sy implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f41489a;

    public sy(ExternalActionActivity externalActionActivity) {
        this.f41489a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f41489a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f33331c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
