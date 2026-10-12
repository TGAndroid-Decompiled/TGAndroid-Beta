package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class qz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f41457a;

    public qz(ExternalActionActivity externalActionActivity) {
        this.f41457a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f41457a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f33590c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
