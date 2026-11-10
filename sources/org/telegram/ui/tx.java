package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class tx implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f50352a;

    public tx(ExternalActionActivity externalActionActivity) {
        this.f50352a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f50352a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f41226c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
