package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class rz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f36492a;

    public rz(ExternalActionActivity externalActionActivity) {
        this.f36492a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f36492a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f29906c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
