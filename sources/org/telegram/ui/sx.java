package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class sx implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f50004a;

    public sx(ExternalActionActivity externalActionActivity) {
        this.f50004a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f50004a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f41235c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
