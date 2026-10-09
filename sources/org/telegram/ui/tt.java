package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class tt implements View.OnAttachStateChangeListener {
    public st f42118a;

    @Override
    public final void onViewAttachedToWindow(View view) {
        NotificationCenter.getGlobalInstance().addObserver(this.f42118a, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.getGlobalInstance().removeObserver(this.f42118a, NotificationCenter.emojiLoaded);
    }
}
