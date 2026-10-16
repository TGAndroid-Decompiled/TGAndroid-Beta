package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class zt implements View.OnAttachStateChangeListener {
    public yt f42418a;

    @Override
    public final void onViewAttachedToWindow(View view) {
        NotificationCenter.getGlobalInstance().addObserver(this.f42418a, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.getGlobalInstance().removeObserver(this.f42418a, NotificationCenter.emojiLoaded);
    }
}
