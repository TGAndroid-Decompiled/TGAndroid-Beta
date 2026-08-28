package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class yy implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f44978a;

    public yy(ExternalActionActivity externalActionActivity) {
        this.f44978a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f44978a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f35469c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
