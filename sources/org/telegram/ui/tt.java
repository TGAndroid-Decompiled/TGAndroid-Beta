package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class tt implements View.OnAttachStateChangeListener {
    public st f42164a;

    @Override
    public final void onViewAttachedToWindow(View view) {
        NotificationCenter.getGlobalInstance().addObserver(this.f42164a, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.getGlobalInstance().removeObserver(this.f42164a, NotificationCenter.emojiLoaded);
    }
}
