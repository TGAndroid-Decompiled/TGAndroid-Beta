package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class rz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f37344a;

    public rz(ExternalActionActivity externalActionActivity) {
        this.f37344a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f37344a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f30807c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
