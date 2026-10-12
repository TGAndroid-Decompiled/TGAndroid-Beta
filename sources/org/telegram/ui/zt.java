package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class zt implements View.OnAttachStateChangeListener {
    public yt f42711a;

    @Override
    public final void onViewAttachedToWindow(View view) {
        NotificationCenter.getGlobalInstance().addObserver(this.f42711a, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.getGlobalInstance().removeObserver(this.f42711a, NotificationCenter.emojiLoaded);
    }
}
